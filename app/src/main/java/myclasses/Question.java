package myclasses;

public class Question {

    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private int rightQuestion;
    private int choice;

    public Question(String question, String answer1, String answer2, String answer3, int rightQuestion) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.rightQuestion = rightQuestion;
        this.choice = -1;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public int getRightQuestion() {
        return rightQuestion;
    }

    public void setRightQuestion(int rightQuestion) {
        this.rightQuestion = rightQuestion;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice (int choice) {
        this.choice = choice;
    }

    public boolean verify() {
        if (this.choice == this.rightQuestion) {
            return true;
        }
        else {
            return false;
        }
    }
}
