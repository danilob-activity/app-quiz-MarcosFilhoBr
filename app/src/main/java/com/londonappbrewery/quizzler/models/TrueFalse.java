package com.londonappbrewery.quizzler.models;

/**
 * Created by aluno on 23/05/19.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    public TrueFalse(int questionID, boolean answer) {
        mQuestionID = questionID;
        mAnswer = answer;
    }
}
