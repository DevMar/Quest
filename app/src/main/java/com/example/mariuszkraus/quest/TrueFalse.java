package com.example.mariuszkraus.quest;

/**
 * Created by mariusz.kraus on 13.03.15.
 */
public class TrueFalse {
    public int mQuestion;
    private boolean mTrueQuestion;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
}
