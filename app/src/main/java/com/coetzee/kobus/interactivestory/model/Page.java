package com.coetzee.kobus.interactivestory.model;

/**
 * Created by Kobus on 10/21/2016.
 */

public class Page {
    private int mImageId;
    private String text;
    private Choice mChoice1;
    private Choice mChoice2;

    public int getImageId()
    {
        return mImageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public void setImageId(int id)
    {
        mImageId = id;
    }



}
