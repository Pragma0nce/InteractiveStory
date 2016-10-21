package com.coetzee.kobus.interactivestory.model;

/**
 * Created by Kobus on 10/21/2016.
 */

public class Choice {
    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
