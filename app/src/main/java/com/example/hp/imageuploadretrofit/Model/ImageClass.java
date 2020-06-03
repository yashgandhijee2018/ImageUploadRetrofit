package com.example.hp.imageuploadretrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageClass {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

}
