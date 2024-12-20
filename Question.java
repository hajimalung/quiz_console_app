package JAdvanced.quiz_console_app;

import java.util.Arrays;

public class Question {
    private int id;
    private String question;
    private String[] options;
    private int answerIndex;

    public Question(int id, String question, String[] options, int answerIndex) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answerIndex = answerIndex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getAnswerIndex() {
        return answerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        this.answerIndex = answerIndex;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options)
                + ", answerIndex=" + answerIndex + "]";
    }

}
