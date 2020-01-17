package com.codewithsaurabh.technex;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("posts")
    Call<ResponseBody> Register(
            @Field("Id_token") String id_token,
            @Field("First_name") String first_name,
            @Field("Last_name") String last_name
//            @Field("Gender") int gender,
//            @Field("Phone") String phone,
//            @Field("College") String college,
//            @Field("City") String city,
//            @Field("Year") int year
            );
}
