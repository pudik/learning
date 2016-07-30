package com.example.tmp.criminalintent;

import java.util.UUID;

/**
 * Created by tmp on 30.07.2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
