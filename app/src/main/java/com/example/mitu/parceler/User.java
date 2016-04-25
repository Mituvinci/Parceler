package com.example.mitu.parceler;

import org.parceler.Parcel;

/**
 * Created by mitu on 4/25/16.
 */
@Parcel
public class User {
    // fields must be public
    String firstName;
    String lastName;

    // empty constructor needed by the Parceler library
    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
