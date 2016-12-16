package com.example.joey.firstandroidappquiz;

/**
 * Created by Joey on 12/15/2016.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

   //constructor
    public Question(int txtResId, boolean answerTrue) {
        mTextResId = txtResId;
        mAnswerTrue = answerTrue;

    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
