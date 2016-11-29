package com.acv.droidmob.model;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by vinicius.castro on 11/7/2016.
 */

public class User implements Parcelable {

    private String name;
    private String site;
    private String mobile;
    private String email;

    protected User(Parcel in) {
        name = in.readString();
        site = in.readString();
        mobile = in.readString();
        email = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(site);
        parcel.writeString(mobile);
        parcel.writeString(email);
    }

    public User(String name, String site, String mobile, String email) {
        this.name = name;
        this.site = site;
        this.mobile = mobile;
        this.email = email;
    }

}
