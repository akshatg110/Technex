package com.codewithsaurabh.technex.ui;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.codewithsaurabh.technex.R;

public class cops extends Fragment{

    private CopsViewModel mViewModel;
    private WebView webView;
    public static cops newInstance() {
        return new cops();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

//       event1=(CardView) root.findViewById(R.id.Cevent1);
//       event1.setOnClickListener(this);
        return inflater.inflate(R.layout.cops_fragment, container, false);
    }
private CardView event1,event2,event3;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CopsViewModel.class);
        // TODO: Use the ViewModel
    }

}
