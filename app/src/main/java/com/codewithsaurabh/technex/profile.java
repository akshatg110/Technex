package com.codewithsaurabh.technex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.io.IOException;
import com.google.firebase.auth.FirebaseAuth;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class profile extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    GoogleSignInClient mGoogleSignInClient;
    Button sign_out;
    TextView nameTV;
    TextView emailTV;
    EditText num,col,ct;
    Spinner gen,yr;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    String name;
    String email;
    String phno;
    String gn;
    String coll;
    String city;
    String year;
    String personId="" ;
    String ln="";
    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        sign_out = findViewById(R.id.log_out);
        nameTV = findViewById(R.id.name);
        emailTV = findViewById(R.id.email);
        num=findViewById(R.id.number);
        gen=findViewById(R.id.gender1);
        col=findViewById(R.id.college);
        ct=findViewById(R.id.city);
        yr=findViewById(R.id.spinner1);

        Spinner spinner=findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.year,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(this);
        Spinner spinners=findViewById(R.id.gender1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.gender,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinners.setAdapter(adapter);
        spinners.setOnItemSelectedListener(this);

        mAuth = FirebaseAuth.getInstance();
        // Configure sign-in to request the user's ID, email address, and basic
        // profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(profile.this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
           personId = acct.getIdToken();
//            Uri personPhoto = acct.getPhotoUrl();

            nameTV.setText(personName);
            emailTV.setText(personEmail);

//            Glide.with(this).load(personPhoto).into(photoIV);
        }
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null) {
                    startActivity(new Intent(profile.this, googleAuth.class));
                }
            }
        };


      sign_out.setOnClickListener((new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mAuth.signOut();
              Toast.makeText(profile.this, "Successfully signed out", Toast.LENGTH_SHORT).show();
          }
      }));

    }
    public void updateprofile(){
        name =nameTV.getText().toString().trim();
        email=emailTV.getText().toString().trim();
        phno=num.getText().toString().trim();
        gn=gen.getSelectedItem().toString().trim();
        coll=col.getText().toString().trim();
        city=ct.getText().toString().trim();
        year =yr.getSelectedItem().toString().trim();

        int gender=0;
        int Year=1;
        if(year=="First")
            Year=1;
       else if(year=="Second")
            Year=2;
      else if(year=="Third")
            Year=3;
       else if(year=="Fourth")
            Year=4;
       else if(year=="Fifth")
            Year=5;
//       if(gn=="Male")
//            gender=0;
//        else if(gn=="Female")
//            gender=1;
//        else
//            gender=2;
        Toast.makeText(this, name+phno+gn+coll+city+year, Toast.LENGTH_SHORT).show();
        Call<ResponseBody> call=RetrofitClient
                .getInstance()
                .getApi()
                .Register("12345","saurabh","text ");
//                .Register(personId,name,ln,gender,phno,coll,city,Year);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String s=response.body().string();
                    Toast.makeText(profile.this, s, Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(profile.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }
    public void uprofile(View V){
        Toast.makeText(this, "saurabh", Toast.LENGTH_SHORT).show();
      updateprofile();
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}