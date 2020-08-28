package com.example.trivia.Model;

public class Question {
    private String answer;
    private Boolean answerTrue;

    public Question()
    {

    }

    public Question(String answer, Boolean answerTrue)
    {
        this.answer=answer;
        this.answerTrue=answerTrue;
    }

    public String getAnswer() {
        return answer;
    }

    public Boolean getAnswerTrue() {
        return answerTrue;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setAnswerTrue(Boolean answerTrue) {
        this.answerTrue = answerTrue;
    }
}
