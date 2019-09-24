package PROG;

//CLASS QUESTION
public class Question {

    //DEFINE INSTANCE VARIABLES 
    private String question;
    private String answer;
    private String[] mcqArray = new String[4];
    private String questionSound;
    private String questionImage;
    private String answerSound;

    //CONSTRUCTOR
    public Question(String q, String mcq1, String mcq2, String mcq3, String mcq4, String a, String qs, String qi, String as) {
        question = q;
        answer = a;
        mcqArray[0] = mcq1;
        mcqArray[1] = mcq2;
        mcqArray[2] = mcq3;
        mcqArray[3] = mcq4;
        questionSound = qs;
        questionImage = qi;
        answerSound = as; 
    }

    public Question(String q, String a, String qs, String qi, String as) {
        question = q;
        answer = a;
        questionSound = qs;
        questionImage = qi;
        answerSound = as; 
    }

    //SETTER
    public void setQuestion(String q) {
        question = q;
    }

    public void setAnswer(String a) {
        answer = a;
    }

    public void setMcqArray(String[] m) {
        mcqArray = m;
    }

    public void setQuestionSound(String qs) {
        questionSound = qs;
    }

    public void setQuestionImage(String qi) {
        questionImage = qi;
    }
    
    public void setAnswerSound(String as) {
        answerSound = as; 
    }

    //GETTER 
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String[] getMcqArray() {
        return mcqArray;
    }

    public String getQuestionSound() {
        return questionSound;
    }

    public String getQuestionImage() {
        return questionImage;
    }
    
    public String getAnswerSound() { 
        return answerSound; 
    }
}
