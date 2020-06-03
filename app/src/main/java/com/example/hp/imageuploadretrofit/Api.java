package com.example.hp.imageuploadretrofit;

import com.example.hp.imageuploadretrofit.Model.ImageClass;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Api {
    String BASE_URL = "https://incampusbackend.herokuapp.com/api/v1/";

    @Multipart
    @POST("user/profile-pic/upload")
    Call<ImageClass> uploadImage(@Part("profile_pic\"; filename=\"myfile.jpg\" ") RequestBody file, @Part("desc") RequestBody desc);

}
