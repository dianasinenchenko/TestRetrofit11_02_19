package com.devitis.testretrofit11_02_19.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Diana on 11.02.2019.
 * [
 * {
 * "id": 1,
 * "email": ds@gmail.com,
 * "password": 12345
 * },
 * {
 * "id": ,
 * "email": dt@gmail.com,
 * "password": 12222
 * }
 * ]
 */

public class Users {

    @SerializedName("id")
    private int id;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
