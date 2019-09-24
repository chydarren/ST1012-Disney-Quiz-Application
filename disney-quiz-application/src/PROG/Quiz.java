package PROG;

//CLASS QUIZ 
public class Quiz {

    //CREATE QUIZ ARRAY 
    private Question[] quizArray = new Question[10];

    public Quiz() {

        //ADDITIONAL FEATURE - SOUND (STORE FILE PATHS INTO STRINGS) 
        String Question1Sound = "c:\\disney-quiz-application\\attachments\\Question1Sound.wav";
        String Question2Sound = "c:\\disney-quiz-application\\attachments\\Question2Sound.wav";
        String Question3Sound = "c:\\disney-quiz-application\\attachments\\Question3Sound.wav";
        String Question4Sound = "c:\\disney-quiz-application\\attachments\\Question4Sound.wav";
        String Question5Sound = "c:\\disney-quiz-application\\attachments\\Question5Sound.wav";
        String Question6Sound = "c:\\disney-quiz-application\\attachments\\Question6Sound.wav";
        String Question7Sound = "c:\\disney-quiz-application\\attachments\\Question7Sound.wav";
        String Question8Sound = "c:\\disney-quiz-application\\attachments\\Question8Sound.wav";
        String Question9Sound = "c:\\disney-quiz-application\\attachments\\Question9Sound.wav";
        String Question10Sound = "c:\\disney-quiz-application\\attachments\\Question10Sound.wav";

        String Answer1Sound = "c:\\disney-quiz-application\\attachments\\Answer1Sound.wav";
        String Answer2Sound = "c:\\disney-quiz-application\\attachments\\Answer2Sound.wav";
        String Answer3Sound = "c:\\disney-quiz-application\\attachments\\Answer3Sound.wav";
        String Answer4Sound = "c:\\disney-quiz-application\\attachments\\Answer4Sound.wav";
        String Answer5Sound = "c:\\disney-quiz-application\\attachments\\Answer5Sound.wav";
        String Answer6Sound = "c:\\disney-quiz-application\\attachments\\Answer6Sound.wav";
        String Answer7Sound = "c:\\disney-quiz-application\\attachments\\Answer7Sound.wav";
        String Answer8Sound = "c:\\disney-quiz-application\\attachments\\Answer8Sound.wav";
        String Answer9Sound = "c:\\disney-quiz-application\\attachments\\Answer9Sound.wav";
        String Answer10Sound = "c:\\disney-quiz-application\\attachments\\Answer10Sound.wav";

        //ADDITIONAL FEATURE - IMAGE (STORE FILE PATHS INTO STRINGS)
        String Question1Image = "c:\\disney-quiz-application\\attachments\\Question1Image.png";
        String Question2Image = "c:\\disney-quiz-application\\attachments\\Question2Image.png";
        String Question3Image = "c:\\disney-quiz-application\\attachments\\Question3Image.png";
        String Question4Image = "c:\\disney-quiz-application\\attachments\\Question4Image.png";
        String Question5Image = "c:\\disney-quiz-application\\attachments\\Question5Image.png";
        String Question6Image = "c:\\disney-quiz-application\\attachments\\Question6Image.png";
        String Question7Image = "c:\\disney-quiz-application\\attachments\\Question7Image.png";
        String Question8Image = "c:\\disney-quiz-application\\attachments\\Question8Image.png";
        String Question9Image = "c:\\disney-quiz-application\\attachments\\Question9Image.png";
        String Question10Image = "c:\\disney-quiz-application\\attachments\\Question10Image.png";

        //STORE VALUES INTO CONSTRUCTORS INTO QUIZARRAY 
        quizArray[0] = new Question("What is the name of Mickey’s girlfriend?", "1. Nanny", "2. Mikaela", "3. Minnie", "4. Mikaele", "3", Question1Sound, Question1Image, Answer1Sound);
        quizArray[1] = new Question("'A Dream is A Wish your Heart Makes' is from which Disney movie?", "1. Cinderella", "2. Beauty and the Beast", "3. The Little Mermaid", "4. Aladdin", "1", Question2Sound, Question2Image, Answer2Sound);
        quizArray[2] = new Question("Who founded Walt Disney company?", "1. Walt and Roy Disney", "2. Walt and Charles Disney", "3. Walt and Roman Disney", "4. Walt and Allen Disney", "1", Question3Sound, Question3Image, Answer3Sound);
        quizArray[3] = new Question("What is Donald Duck's full name?", "1. Donald Chenille Duck", "2. Donald Whitlatch Duck", "3. Donald Fauntleroy Duck", "4. Donald Clarence Duck", "3", Question4Sound, Question4Image, Answer4Sound);
        quizArray[4] = new Question("What is Sleeping Beauty's real name?", "1. Christabel", "2. Calista", "3. Astrid", "4. Aurora", "4", Question5Sound, Question5Image, Answer5Sound);
        quizArray[5] = new Question("In what year was Disney Company founded?", "1923", Question6Sound, Question6Image, Answer6Sound);
        quizArray[6] = new Question("Finish this movie name: Snow White and the...", "Seven Dwarves", Question7Sound, Question7Image, Answer7Sound);
        quizArray[7] = new Question("What is the name of Mickey Mouse's dog?", "Pluto", Question8Sound, Question8Image, Answer8Sound);
        quizArray[8] = new Question("What is Cinderella's evil stepmother's name?", "Lady Trimaine", Question9Sound, Question9Image, Answer9Sound);
        quizArray[9] = new Question("What is the theme song of Mulan?", "Reflection", Question10Sound, Question10Image, Answer10Sound);
    }

    //RETURN QUIZ ARRAY 
    public Question returnarray(int x) {
        return quizArray[x];
    }
}
