/*REFERENCES 
  ADDITIONAL FEATURE - IMAGE (https://www.youtube.com/watch?v=FdQX8sUNO-s)
  ADDITIONAL FEATURE - IMAGE (http://stackoverflow.com/questions/6975736/java-joptionpane-showmessagedialog-custom-icon-problem)
  ADDITIONAL FEATURE - IMAGE (https://www.youtube.com/watch?v=By2wARNZ-QQ)
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (https://www.mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/)
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (http://stackoverflow.com/questions/2885173/how-to-create-a-file-and-write-to-a-file-in-java/)
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (http://www.javaproficiency.com/2015/02/file-create-in-java.html)
  ADDITIONAL FEATURE - SOUND (https://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html)
  ADDITIONAL FEATURE - SOUND (https://docs.oracle.com/javase/7/docs/api/java/io/File.html#pathSeparatorChar)
  ADDITIONAL FEATURE - FONT (http://stackoverflow.com/questions/685521/multiline-text-in-jlabel)
  ADDITIONAL FEATURE - FONT (http://stackoverflow.com/questions/26913923/change-size-e-font-joptionpane) 
  ADDITIONAL FEATURE - FONT (http://stackoverflow.com/questions/25355377/unable-to-make-text-areas-uneditable-in-java)
  ADDITIONAL FEATURE - FONT BACKGROUND (https://www.ntu.edu.sg/home/ehchua/programming/java/J4a_GUI_2.html)
  ADDITIONAL FEATURE - TIME ELAPSED (http://javadevnotes.com/java-long-to-string-examples) 
  ADDITIONAL FEATURE - TIME ELAPSED (https://www.mkyong.com/java/how-do-calculate-elapsed-execute-time-in-java/)
  ADDITIONAL FEATURE - DIALOG BUTTON FONT (http://stackoverflow.com/questions/4017042/how-to-enlarge-buttons-on-joptionpane-dialog-boxes) 
  ADDITIONAL FEATURE - CUSTOM DROPBOX DIALOG (http://www.java2s.com/Tutorial/Java/0240__Swing/Todisplaysadialogwithalistofchoicesinadropdownlistbox.htm)
  ADDITIONAL FEATURE - CUSTOM OPTION DIALOG (http://stackoverflow.com/questions/1257420/making-a-joptionpane-with-4-options)
  ADDITIONAL FEATURE - USER INPUT VALIDATION USING TRY & CATCH (http://forums.d2jsp.org/topic.php?t=62327243&f=124)
  ADDITIONAL FEATURE - OPEN WEBSITE (https://www.youtube.com/watch?v=C_Y6yrkj9Sg)
  ADDITIONAL FEATURE - MULTI DIMENSIONAL ARRAY (https://www.willamette.edu/~gorr/classes/cs231/lectures/chapter9/arrays2d.htm)
 */

 /*ADDITIONAL FEATURES INCLUDE: 
  - MULTIPLAYER
  - IMAGES (GIF/PNG/JPG) - READ FROM FILE 
  - AUDIO (THEME SONG, CORRECT/WRONG, TEXT AUDIO ASSISTANT USING RECORDED VOICE BY ME) - READ FROM FILE  
  - CREATE PIN AND LOGIN USING PIN BY WRITING INTO AND READING FROM FILE 
  - CHANGE OF FONT TYPE AND SIZE FOR NORMAL TEXTS  
  - CHANGE OF FONT BACKGROUND 
  - CUSTOM OPTION DIALOG 
  - DIALOG BUTTON FONTS 
  - TIME ELAPSED 
  - CUSTOM DROPBOX DIALOG 
  - USER INPUT VALIDATION (MCQ QUESTION)
  - USER INPUT VALIDATION USING TRY & CATCH 
  - GETRANDOM FROM ARRAY
  - OPEN WEBSITE 
  - MULTIDIMENSIONAL ARRAY 
  - CHANGE OF OPTION DIALOG BUTTON FONT TYPE AND SIZE 
  - CHANGE OF INPUT DIALOG BOX FONT TYPE AND SIZE 
 */
package PROG;

//IMPORTS
import javax.swing.JOptionPane;
import java.awt.*; //ADDITIONAL FEATURE - IMAGE  
import javax.swing.*; //ADDITIONAL FEATURE - IMAGE 
import java.util.Date; //ADDITIONAL FEATURE - TIME ELAPSED 
import java.awt.Font; //ADDITIONAL FEATURE - DIALOG BUTTON FONTS 
import java.io.IOException; //ADDITIONAL FEATURE - WEBSITE 
import java.net.URISyntaxException; //ADDITIONAL FEATURE - WEBSITE 
import javax.swing.plaf.FontUIResource; //ADDITIONAL FEATURE - DIALOG BUTTON FONTS 

//CLASS QUIZ APPLICATION
public class QuizApplication {

    //MAIN METHOD
    public static void main(String[] args) throws IOException, URISyntaxException {

        //ADDITIONAL FEATURE - SOUND (FILE PATHS STORAGE) 
        String SmallWorld = "c:\\disney-quiz-application\\attachments\\Small World.wav";
        String InstructionIdentity = "c:\\disney-quiz-application\\attachments\\InstructionIdentity.wav";
        String InstructionIdentityRegister = "c:\\disney-quiz-application\\attachments\\InstructionIdentityRegister.wav";
        String InstructionIdentityLogin = "c:\\disney-quiz-application\\attachments\\InstructionIdentityLogin.wav";
        String InstructionIdentityLoginFail = "c:\\disney-quiz-application\\attachments\\InstructionIdentityLoginFail.wav";
        String InstructionWelcome = "c:\\disney-quiz-application\\attachments\\InstructionWelcome.wav";
        String InstructionNameInput = "c:\\disney-quiz-application\\attachments\\InstructionNameInput.wav";
        String InstructionGameRules = "c:\\disney-quiz-application\\attachments\\InstructionGameRules.wav";
        String InstructionMCQLoop = "c:\\disney-quiz-application\\attachments\\InstructionMCQLoop.wav";
        String InstructionQuizLoop = "c:\\disney-quiz-application\\attachments\\InstructionQuizLoop.wav";
        String MarkWrong = "c:\\disney-quiz-application\\attachments\\MarkWrong.wav";
        String MarkCorrect = "c:\\disney-quiz-application\\attachments\\MarkCorrect.wav";
        String InstructionFontType = "c:\\disney-quiz-application\\attachments\\InstructionFontType.wav";
        String InstructionFontSize = "c:\\disney-quiz-application\\attachments\\InstructionFontSize.wav";
        String InstructionRecommendation = "c:\\disney-quiz-application\\attachments\\InstructionRecommendation.wav";
        String InstructionMultiplayerFail = "c:\\disney-quiz-application\\attachments\\InstructionMultiplayerFail.wav";

        //ADDITIONAL FEATURE - IMAGE (FILE PATHS STORAGE) 
        String WaltDisneyInstructions = "c:\\disney-quiz-application\\attachments\\WaltDisneyInstructions.gif";
        String FontSupport = "c:\\disney-quiz-application\\attachments\\FontSupport.png";
        String AudioSupport = "c:\\disney-quiz-application\\attachments\\AudioSupport.png";
        String AuthenticationSupport = "c:\\disney-quiz-application\\attachments\\AuthenticationSupport.png";
        String ScoreSupport = "c:\\disney-quiz-application\\attachments\\ScoreSupport.png";
        String MarkWrongImage = "c:\\disney-quiz-application\\attachments\\MarkWrongImage.png";
        String SongSupport = "c:\\disney-quiz-application\\attachments\\SongSupport.png";
        String ThanksSupport = "c:\\disney-quiz-application\\attachments\\ThanksSupport.png";

        //DECLARE VARIABLES 
        int confirm;                                          //REPEAT QUIZ
        String name;                                          //ADDITIONAL FEATURE - MULTIPLAYER (NAME)         
        int players = 0;                                      //ADDITIONAL FEATURE - MULTIPLAYER (PLAYER AMOUNT)
        int printcount;                                       //ADDITIONAL FEATURE - MULTIPLAYER (PRINT COUNT OF PLAYER SCORES)  
        JTextArea FontText;                                   //ADDITIONAL FEATURE - FONT (FONTTEXT) 
        AdditionalFeatureAudio ThemeSong;                     //ADDITIONAL FEATURE - SOUND (THEME SONG) 
        AdditionalFeatureAudio OptionalAudioSupport = null;   //ADDITIONAL FEATURE - SPUND (OPTIONAL AUDIO SUPPORT) 
        AdditionalFeatureAudio Marking = null;                //ADDITIONAL FEATURE - SOUND (MARKING) 
        int sFontSize;                                        //ADDITIONAL FEATURE - FONT (FONT SIZE) 
        String sFontType;                                     //ADDITIONAL FEATURE - FONT (FONT TYPE) 
        int option;                                           //ADDITIONAL FEATURE - SOUND (AUDIO SUPPORT) 

        //BEGIN QUIZ 
        do {

            //STEP 1: PLAY THEME SONG 
            //ADDITIONAL FEATURE - SOUND (PLAY THEME SONG)
            ThemeSong = new AdditionalFeatureAudio(SmallWorld);

            //STEP 2: SET DEFAULT FONT OF DIALOG BUTTONS AND INPUT DIALOGS 
            //ADDITIONAL FEATURE - FONT R(SET DIALOG BUTTONS)
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Arial", Font.BOLD, 30)));
            UIManager.put("TextField.font", new FontUIResource(new Font("Arial", Font.BOLD, 30)));

            //STEP 3: AUDIO ASSISTANT REQUEST 
            //ADDITIONAL FEATURE - FONT (SET TEXT) 
            FontText = new JTextArea("Do you require an audio assistant?");
            FontText.setFont(new Font("Arial", Font.BOLD, 30));
            FontText.setOpaque(false);
            FontText.setEditable(false);

            //ADDITIONAL FEATURE - IMAGE  
            ImageIcon Instructions = new ImageIcon(AudioSupport);

            //ADDITIONAL FEATURE - OPTION DIALOG (ASK USER WHETHER NEED AUDIO ASSISTANT) 
            Object[] options = {"Yes, please", "No, thanks"};
            option = JOptionPane.showOptionDialog(
                    null,
                    FontText,
                    "Audio Assistant",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.DEFAULT_OPTION,
                    Instructions,
                    options, options[1]);

            //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
            Marking = new AdditionalFeatureAudio(MarkCorrect);

            //STEP 4: CHOOSE FONT TYPE 
            //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)
            if (option == 0) {
                OptionalAudioSupport = new AdditionalFeatureAudio(InstructionFontType);
            }

            //ADDITIONAL FEATURE - FONT (SET TEXT) 
            FontText = new JTextArea("Please choose a font type for the texts.");
            FontText.setFont(new Font("Arial", Font.BOLD, 30));
            FontText.setOpaque(false);
            FontText.setEditable(false);

            //ADDITIONAL FEATURE - IMAGE  
            Instructions = new ImageIcon(FontSupport);

            //ADDITIONAL FEATURE - DROP BOX DIALOG 
            String[] fontTypes = {"Arial", "Cambria", "Hobo Std", "Times New Roman"};
            String fontType = (String) JOptionPane.showInputDialog(
                    null,
                    FontText,
                    "Font Types",
                    JOptionPane.INFORMATION_MESSAGE,
                    Instructions,
                    fontTypes, fontTypes[3]);

            if (option == 0) {
                OptionalAudioSupport.stop();
            }

            sFontType = null;
            if (fontType.equals("Arial")) {
                sFontType = "Arial";
            } else if (fontType.equals("Cambria")) {
                sFontType = "Cambria";
            } else if (fontType.equals("Hobo Std")) {
                sFontType = "Hobo Std";
            } else {
                sFontType = "Times New Roman";
            }

            //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
            Marking = new AdditionalFeatureAudio(MarkCorrect);

            //STEP 5: CHOOSE FONT SIZE 
            //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)
            if (option == 0) {
                OptionalAudioSupport = new AdditionalFeatureAudio(InstructionFontSize);
            }

            //ADDITIONAL FEATURE - FONT (SET TEXT)  
            FontText = new JTextArea("Please choose a font size for the texts");
            FontText.setFont(new Font("Arial", Font.BOLD, 30));
            FontText.setOpaque(false);
            FontText.setEditable(false);

            sFontSize = 30;
            String FontSize;

            //ADDITIONAL FEATURE - DROP BOX DIALOG 
            String[] fontSizes = {"10", "20", "30", "40", "50", "60", "70"};
            String fontSize = (String) JOptionPane.showInputDialog(
                    null,
                    FontText,
                    "Font Sizes",
                    JOptionPane.INFORMATION_MESSAGE,
                    Instructions,
                    fontSizes, fontSizes[2]);

            sFontSize = Integer.parseInt(fontSize);

            if (option == 0) {
                OptionalAudioSupport.stop();
            }

            //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
            Marking = new AdditionalFeatureAudio(MarkCorrect);

            //STEP 6: SET NEW FONT OF DIALOG BUTTONS 
            //ADDITIONAL FEATURE - FONT (SET DIALOG BUTTONS)
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font(sFontType, Font.BOLD, sFontSize)));
            UIManager.put("TextField.font", new FontUIResource(new Font(sFontType, Font.BOLD, sFontSize)));

            //STEP 7: USER AUTHENTICATION 
            //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)
            if (option == 0) {
                OptionalAudioSupport = new AdditionalFeatureAudio(InstructionIdentity);
            }

            //ADDITIONAL FEATURE - FONT (SET TEXT)
            FontText = new JTextArea("Please authenticate your identity.");
            FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
            FontText.setOpaque(false);
            FontText.setEditable(false);

            //ADDITIONAL FEATURE - OPTION DIALOG (ASK USER TO CREATE NEW PIN / LOGIN USING PIN)
            Instructions = new ImageIcon(AuthenticationSupport);

            Object[] logins = {"Create New Pin", "Login Using Pin"};
            int login = JOptionPane.showOptionDialog(
                    null,
                    FontText,
                    "Identity",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.DEFAULT_OPTION,
                    Instructions,
                    logins, logins[1]);

            if (option == 0) {
                OptionalAudioSupport.stop();
            }

            //ADDITIONAL FEATURE - SOUND (PLAY MARKING)
            Marking = new AdditionalFeatureAudio(MarkCorrect);

            //STEP 7A: USER AUTHENTICATION - REGISTER 
            //ADDITIONAL FEATURE - FILE LOGIN 
            if (login == 0) {

                //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                if (option == 0) {
                    OptionalAudioSupport = new AdditionalFeatureAudio(InstructionIdentityRegister);
                }

                //ADDITIONAL FEATURE - FONT (SET TEXT) 
                FontText = new JTextArea("Please register a pin.");
                FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                FontText.setOpaque(false);
                FontText.setEditable(false);

                String registerpin = (String) JOptionPane.showInputDialog(
                        null,
                        FontText,
                        "Identity",
                        JOptionPane.INFORMATION_MESSAGE,
                        Instructions,
                        null,
                        "");

                if (option == 0) {
                    OptionalAudioSupport.stop();
                }

                //ADDITIONAL FEATURE - SOUND (PLAY MARKING)
                Marking = new AdditionalFeatureAudio(MarkCorrect);

                //ADDITIONAL FEATURE - FILE LOGIN (STORE PIN INTO FILE) 
                AdditionalFeatureCreateFileLogin CreateFileLogin = new AdditionalFeatureCreateFileLogin(registerpin);

                //STEP 7B: USER AUTHENTICATION - LOG IN 
            } else {

                //ADDITIONAL FEATURE - FILE LOGIN (READ PIN FROM FILE) 
                AdditionalFeatureReadFileLogin ReadFilelogin = new AdditionalFeatureReadFileLogin();

                String readpin;
                String pin;

                do {

                    //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                    if (option == 0) {
                        OptionalAudioSupport = new AdditionalFeatureAudio(InstructionIdentityLogin);
                    }

                    //ADDITIONAL FEATURE - FONT (SET TEXT) 
                    FontText = new JTextArea("Please login using an existing pin.");
                    FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                    FontText.setOpaque(false);
                    FontText.setEditable(false);

                    readpin = (String) JOptionPane.showInputDialog(
                            null,
                            FontText,
                            "Identity",
                            JOptionPane.INFORMATION_MESSAGE,
                            Instructions,
                            null,
                            "");

                    if (option == 0) {
                        OptionalAudioSupport.stop();
                    }

                    if (!readpin.equals(pin = (ReadFilelogin.AdditionalFeatureReadFileLogin()))) {

                        //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
                        Marking = new AdditionalFeatureAudio(MarkWrong);

                        //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                        if (option == 0) {
                            OptionalAudioSupport = new AdditionalFeatureAudio(InstructionIdentityLoginFail);
                        }

                        //ADDITIONAL FEATURE - FONT (SET TEXT)
                        FontText = new JTextArea("Incorrect pin. Please try again.");
                        FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                        FontText.setOpaque(false);
                        FontText.setEditable(false);

                        JOptionPane.showMessageDialog(
                                null,
                                FontText,
                                "Error",
                                JOptionPane.ERROR_MESSAGE);

                        if (option == 0) {
                            OptionalAudioSupport.stop();
                        }

                    } else {

                        //ADDITIONAL FEATURE  - SOUND (PLAY MARKING) 
                        Marking = new AdditionalFeatureAudio(MarkCorrect);

                    }

                    if (option == 0) {
                        OptionalAudioSupport.stop();
                    }
                } while (!readpin.equals(pin = (ReadFilelogin.AdditionalFeatureReadFileLogin())));
            }

            //STEP 9: RESET PLAYER COUNT FOR MULTIPLAYER 
            int count = 0;

            //STEP 10: MULTIPLAYER REQUEST 
            //ADDITIONAL FEATURE - USER INPUT VALIDATION (TRY & CATCH) 
            String playerss;
            boolean catchy = false;
            while (!catchy || players <= 0) {

                try {
                    //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                    if (option == 0) {
                        OptionalAudioSupport = new AdditionalFeatureAudio(InstructionWelcome);
                    }

                    //ADDITIONAL FEATURE - FONT (SET TEXT) 
                    FontText = new JTextArea("Welcome to the Walt Disney Trivia! How many players do you have?");
                    FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                    FontText.setOpaque(false);
                    FontText.setEditable(false);

                    playerss = JOptionPane.showInputDialog(
                            null,
                            FontText,
                            "Welcome",
                            JOptionPane.QUESTION_MESSAGE);

                    if (option == 0) {
                        OptionalAudioSupport.stop();
                    }

                    players = Integer.parseInt(playerss);
                    catchy = true;

                    if (players <= 0) {

                        //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
                        Marking = new AdditionalFeatureAudio(MarkWrong);

                        //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)
                        if (option == 0) {
                            OptionalAudioSupport = new AdditionalFeatureAudio(InstructionMultiplayerFail);
                        }

                        //ADDITIONAL FEATURE - FONT (SET TEXT)
                        FontText = new JTextArea("Please enter a positive integer.");
                        FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                        FontText.setOpaque(false);
                        FontText.setEditable(false);

                        JOptionPane.showMessageDialog(
                                null,
                                FontText,
                                "Error",
                                JOptionPane.ERROR_MESSAGE);

                        if (option == 0) {
                            OptionalAudioSupport.stop();
                        }
                    }

                } catch (NumberFormatException e) {

                    //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
                    Marking = new AdditionalFeatureAudio(MarkWrong);

                    //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)
                    if (option == 0) {
                        OptionalAudioSupport = new AdditionalFeatureAudio(InstructionMultiplayerFail);
                    }

                    //ADDITIONAL FEATURE - FONT (SET TEXT)
                    FontText = new JTextArea("Please enter a positive integer.");
                    FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                    FontText.setOpaque(false);
                    FontText.setEditable(false);

                    JOptionPane.showMessageDialog(
                            null,
                            FontText,
                            "Error",
                            JOptionPane.ERROR_MESSAGE);

                    if (option == 0) {
                        OptionalAudioSupport.stop();
                    }
                }
            }

            //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
            Marking = new AdditionalFeatureAudio(MarkCorrect);

            //ADDITIONAL FEATURE - MULTIMENSIONAL ARRAY (CREATE TO STORE NAME AND SCORE OF PLAYER)
            String[][] namescore = new String[players][3];

            do {

                //STEP 11: NAME REQUEST 
                //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)  
                if (option == 0) {
                    OptionalAudioSupport = new AdditionalFeatureAudio(InstructionNameInput);
                }

                //ADDITIONAL FEATURE - FONT (SET TEXT) 
                FontText = new JTextArea("Hello Player " + (count + 1) + "! Please type in your name.");
                FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                FontText.setOpaque(false);
                FontText.setEditable(false);

                name = JOptionPane.showInputDialog(
                        null,
                        FontText,
                        "Welcome",
                        JOptionPane.QUESTION_MESSAGE);

                if (option == 0) {
                    OptionalAudioSupport.stop();
                }

                //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
                Marking = new AdditionalFeatureAudio(MarkCorrect);

                //STEP 12: DISPLAY INSTRUCTIONS 
                //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                if (option == 0) {
                    OptionalAudioSupport = new AdditionalFeatureAudio(InstructionGameRules);
                }

                //ADDITIONAL FEATURE - IMAGE 
                Instructions = new ImageIcon(WaltDisneyInstructions);

                //ADDITIONAL FEATURE - FONT (SET TEXT) 
                FontText = new JTextArea(name + ", before you take the quiz, please read the instructions.\n1. If its an MCQ question, type in answers from 1 to 4. \n2. Re-entry of answer for  MCQ question will be prompted if answers are not within 1 to 4. \n3. If asked to fill in the blank, you can type any answer.\n4. The fastest player with the highest score will win!");
                FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                FontText.setOpaque(false);
                FontText.setEditable(false);

                JOptionPane.showMessageDialog(
                        null,
                        FontText,
                        "Instructions",
                        JOptionPane.INFORMATION_MESSAGE,
                        Instructions);

                if (option == 0) {
                    OptionalAudioSupport.stop();
                }

                //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
                Marking = new AdditionalFeatureAudio(MarkCorrect);

                //STEP 13: SET UP FOR QUIZ 
                Quiz One = new Quiz();

                //DECLARE VARIABLES
                int i;
                int score = 0;    //ADDITIONAL FEATURE - MULTIPLAYER (SCORE) 

                //ADDITIONAL FEATURE - IMAGE 
                ImageIcon Image = null;

                //ADDITIONAL FEATURE - TIME ELAPSED (START) 
                long lStartTime = new Date().getTime();

                //STEP 14: MULTIPLE CHOICE QUESTION 
                //FOR LOOP (MCQ) 
                for (i = 0; i < 5; i++) {

                    //RETURN VALUES STORED IN ARRAY FROM OTHER CLASSES 
                    String Question = One.returnarray(i).getQuestion();
                    String[] MCQArray = One.returnarray(i).getMcqArray();
                    String Answer = One.returnarray(i).getAnswer();
                    String QuestionSound = One.returnarray(i).getQuestionSound();
                    String QuestionImage = One.returnarray(i).getQuestionImage();
                    String AnswerSound = One.returnarray(i).getAnswerSound();

                    //STEP 14A: ASK QUESTION 
                    //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                    if (option == 0) {
                        OptionalAudioSupport = new AdditionalFeatureAudio(QuestionSound);
                    }

                    //ADDITIONAL FEATURE - FONT (SET TEXT) 
                    FontText = new JTextArea(Question + "\n" + MCQArray[0] + "\n" + MCQArray[1] + "\n" + MCQArray[2] + "\n" + MCQArray[3]);
                    FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                    FontText.setOpaque(false);
                    FontText.setEditable(false);

                    //ADDITIONAL FEATURE - IMAGE 
                    Image = new ImageIcon(QuestionImage);

                    String input = (String) JOptionPane.showInputDialog(
                            null,
                            FontText,
                            "Quiz",
                            JOptionPane.QUESTION_MESSAGE,
                            Image,
                            null,
                            "");

                    if (option == 0) {
                        OptionalAudioSupport.stop();
                    }

                    //ADDITIONAL FEATURE - USER INPUT VALIDATION 
                    while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4")) {

                        //ADDITIONAL FEATURE - SOUND (PLAY MARK WRONG)
                        Marking = new AdditionalFeatureAudio(MarkWrong);

                        //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                        if (option == 0) {
                            OptionalAudioSupport = new AdditionalFeatureAudio(InstructionMCQLoop);
                        }

                        //ADDITIONAL FEATURE - FONT (SET TEXT)
                        FontText = new JTextArea("MCQ answer should be within 1 to 4.");
                        FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                        FontText.setOpaque(false);
                        FontText.setEditable(false);

                        JOptionPane.showMessageDialog(
                                null,
                                FontText,
                                "Error",
                                JOptionPane.ERROR_MESSAGE);

                        if (option == 0) {
                            OptionalAudioSupport.stop();
                        }

                        //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                        if (option == 0) {
                            OptionalAudioSupport = new AdditionalFeatureAudio(QuestionSound);
                        }

                        //ADDITIONAL FEATURE  - FONT (SET TEXT) 
                        FontText = new JTextArea(Question + "\n" + MCQArray[0] + "\n" + MCQArray[1] + "\n" + MCQArray[2] + "\n" + MCQArray[3]);
                        FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                        FontText.setOpaque(false);
                        FontText.setEditable(false);

                        //ADDITIONAL FEATURE - IMAGE  
                        Image = new ImageIcon(QuestionImage);

                        input = (String) JOptionPane.showInputDialog(
                                null,
                                FontText,
                                "Quiz",
                                JOptionPane.QUESTION_MESSAGE,
                                Image,
                                null,
                                "");

                        if (option == 0) {
                            OptionalAudioSupport.stop();
                        }
                    }

                    //STEP 14B: MARK QUESTION 
                    if (input.equals(Answer)) {

                        //ADDITIONAL FEATURE - SOUND (PLAY MARKING)
                        Marking = new AdditionalFeatureAudio(MarkCorrect);
                        score++;

                    } else {

                        //ADDITIONAL FEATURE - SOUND (PLAY MARKING)
                        Marking = new AdditionalFeatureAudio(MarkWrong);

                        //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)
                        if (option == 0) {
                            OptionalAudioSupport = new AdditionalFeatureAudio(AnswerSound);
                        }

                        //ADDITIONAL FEATURE - FONT (SET TEXT) 
                        FontText = new JTextArea("The correct answer is: " + Answer);
                        FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                        FontText.setOpaque(false);
                        FontText.setEditable(false);

                        //ADDITIONAL FEATURE - IMAGE 
                        Image = new ImageIcon(MarkWrongImage);

                        JOptionPane.showMessageDialog(
                                null,
                                FontText,
                                "Answer",
                                JOptionPane.INFORMATION_MESSAGE,
                                Image);

                        if (option == 0) {
                            OptionalAudioSupport.stop();
                        }
                    }
                }

                //STEP 15: FILL IN THE BLANK QUESTION 
                //FOR LOOP (FILL IN THE BLANK) 
                for (i = 5; i < 10; i++) {

                    //RETURN VALUES STORED IN ARRAY FROM OTHER CLASSES 
                    String Question = One.returnarray(i).getQuestion();
                    String Answer = One.returnarray(i).getAnswer();
                    String QuestionSound = One.returnarray(i).getQuestionSound();
                    String QuestionImage = One.returnarray(i).getQuestionImage();
                    String AnswerSound = One.returnarray(i).getAnswerSound();

                    //STEP 15A: ASK QUESTION 
                    //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
                    if (option == 0) {
                        OptionalAudioSupport = new AdditionalFeatureAudio(QuestionSound);
                    }

                    //ADDITIONAL FEATURE - FONT (SET TEXT) 
                    FontText = new JTextArea(Question);
                    FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                    FontText.setOpaque(false);
                    FontText.setEditable(false);

                    //ADDITIONAL FEATURE - IMAGE 
                    Image = new ImageIcon(QuestionImage);

                    String finalinput = (String) JOptionPane.showInputDialog(
                            null,
                            FontText,
                            "Quiz",
                            JOptionPane.QUESTION_MESSAGE,
                            Image,
                            null,
                            "");

                    if (option == 0) {
                        OptionalAudioSupport.stop();
                    }

                    //STEP 15B: MARK QUESTION 
                    if (finalinput.equalsIgnoreCase(Answer)) {

                        //ADDITIONAL FEATURE - SOUND (PLAY MARKING)
                        Marking = new AdditionalFeatureAudio(MarkCorrect);
                        score++;

                    } else {

                        //ADDITIONAL FEATURE - SOUND (PLAY MARKING)
                        Marking = new AdditionalFeatureAudio(MarkWrong);

                        //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)
                        if (option == 0) {
                            OptionalAudioSupport = new AdditionalFeatureAudio(AnswerSound);
                        }

                        //ADDITIONAL FEATURE - FONT (SET TEXT) 
                        FontText = new JTextArea("The correct answer is: " + Answer);
                        FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                        FontText.setOpaque(false);
                        FontText.setEditable(false);

                        //ADDITIONAL FEATURE - IMAGE 
                        Image = new ImageIcon(MarkWrongImage);

                        JOptionPane.showMessageDialog(
                                null,
                                FontText,
                                "Answer",
                                JOptionPane.INFORMATION_MESSAGE,
                                Image);

                        if (option == 0) {
                            OptionalAudioSupport.stop();
                        }
                    }
                }

                //STEP 16: STORE NAME AND SCORE OF PLAYER 
                //ADDITIONAL FEATURE - MULTIDIMENSIONAL ARRAY 
                namescore[count][0] = name;
                namescore[count][1] = Integer.toString(score);

                //STEP 17: STORE TIME ELAPSED OF PLAYER 
                //ADDITIONAL FEATURE - TIME ELAPSED (END) 
                long lEndTime = new Date().getTime();
                long difference = ((lEndTime - lStartTime) / 1000);
                String TimeElapsed = Long.toString(difference);

                namescore[count][2] = TimeElapsed;

                count++;

            } while (count < players);

            //STEP 18: TRANSFER NAME, SCORE AND TIME ELAPSED OF PLAYER INTO PRINTSTUFF 
            String printstuff = "";
            for (printcount = 0; printcount < players; printcount++) {

                printstuff += namescore[printcount][0] + ", you got " + namescore[printcount][1] + " out of 10 correct within " + namescore[printcount][2] + " seconds." + "\n";

            }

            //STEP 19: DISPLAY PRINTSTUFF    
            //ADDITIONAL FEATURE - FONT (SET TEXT) 
            FontText = new JTextArea(printstuff);
            FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
            FontText.setOpaque(false);
            FontText.setEditable(false);

            //ADDITIONAL FEATURE - IMAGE
            Instructions = new ImageIcon(ScoreSupport);

            JOptionPane.showMessageDialog(
                    null,
                    FontText,
                    "Scoring Panel",
                    JOptionPane.INFORMATION_MESSAGE,
                    Instructions);

            //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
            Marking = new AdditionalFeatureAudio(MarkCorrect);

            //STEP 20: COMPARE THE SCORE AND TIME OF PLAYERS 
            String highestnamescoretime = "";
            if (players > 1) {

                int highestscore = Integer.parseInt(namescore[0][1]);
                int besttime = Integer.parseInt(namescore[0][2]);

                for (int h = 1; h < namescore.length; h++) {
                    if ((Integer.parseInt(namescore[h][1]) >= highestscore) && (Integer.parseInt(namescore[h][2]) <= besttime)) {
                        highestscore = Integer.parseInt(namescore[h][1]);
                        besttime = Integer.parseInt(namescore[h][2]);
                    }
                }

                //STEP 21: STORE THE BEST SCORE AND TIME OF PLAYERS 
                for (printcount = 0; printcount < players; printcount++) {

                    if ((Integer.parseInt(namescore[printcount][1]) == highestscore) && (Integer.parseInt(namescore[printcount][2]) == besttime)) {
                        highestnamescoretime += namescore[printcount][0] + ", ";
                    }

                }

                //STEP 22: DISPLAY BEST SCORE AND TIME OF PLAYERS 
                //ADDITIONAL FEATURE - FONT (SET TEXT)
                FontText = new JTextArea("The winners are " + highestnamescoretime + "with a total score of " + highestscore + " out of 10 correct within " + besttime + " seconds.");
                FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
                FontText.setOpaque(false);
                FontText.setEditable(false);

                JOptionPane.showMessageDialog(
                        null,
                        FontText,
                        "Congratulations",
                        JOptionPane.INFORMATION_MESSAGE,
                        Instructions);

                //ADDITIONAL FE ATURE - SOUND (PLAY MARKING) 
                Marking = new AdditionalFeatureAudio(MarkCorrect);

            }

            //STEP 23: CONFIRM WHETHER TO PLAY AGAIN 
            //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT) 
            if (option == 0) {
                OptionalAudioSupport = new AdditionalFeatureAudio(InstructionQuizLoop);
            }

            //ADDITIONAL FEATURE - FONT (SET TEXT) 
            FontText = new JTextArea("Thank you for your participation. Do you want to take the quiz again?");
            FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
            FontText.setOpaque(false);
            FontText.setEditable(false);

            //ADDITIONAL FEATURE - IMAGE  
            Instructions = new ImageIcon(ThanksSupport);

            confirm = JOptionPane.showConfirmDialog(
                    null,
                    FontText,
                    "The End",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    Instructions);

            if (option == 0) {
                OptionalAudioSupport.stop();
            }

            //ADDITIONAL FEATURE - SOUND (PLAY MARKING) 
            Marking = new AdditionalFeatureAudio(MarkCorrect);

            //STEP 24: END THE GAME 
            ThemeSong.stop();

        } while (confirm == JOptionPane.YES_OPTION);

        //STEP 25: RECOMMEND DISNEY SONG AS A FORM OF APPRECIATION 
        //ADDITIONAL FEATURE - MULTIMENSIONAL ARRAY (CREATE TO STORE SONG NAME AND SONG URL) 
        String[][] websiteurls = {{"Beauty and The Beast", "https://www.youtube.com/tv#/watch/video/control?v=3n_5xo9YpmQ&resume"}, {"Colors of the Wind", "https://www.youtube.com/tv#/watch/video/control?v=J8rU2CK_1FI&resume"}, {"Mulan Reflection", "https://www.youtube.com/tv#/watch/video/control?v=7LJxv9ZX8Is&resume"}};

        //ADDITIONAL FEATURE - GET RANDOM FROM ARRAY 
        int w = (int) (Math.random() * 3);

        //ADDITIONAL FEATURE - SOUND (PLAY OPTIONAL AUDIO SUPPORT)
        if (option == 0) {
            OptionalAudioSupport = new AdditionalFeatureAudio(InstructionRecommendation);
        }

        //ADDITIONAL FONT - SET TEXT 
        FontText = new JTextArea("Thank you! Here's a recommended Disney song, " + websiteurls[w][0]);
        FontText.setFont(new Font(sFontType, Font.BOLD, sFontSize));
        FontText.setOpaque(false);
        FontText.setEditable(false);

        //ADDITIONAL FEATURE - IMAGE  
        ImageIcon Instructions = new ImageIcon(SongSupport);

        //ADDITIONAL FEATURE - OPTION DIALOG 
        Object[] websites = {"OK"};
        int website = JOptionPane.showOptionDialog(
                null,
                FontText,
                "Walt Disney",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                Instructions,
                websites,
                websites[0]
        );

        if (option == 0) {
            OptionalAudioSupport.stop();
        }

        //ADDITIONAL FEATURE - OPEN WEBSITE 
        if (website == 0) {
            AdditionalFeatureWebsite websiteopen = new AdditionalFeatureWebsite(websiteurls[w][1]);
        }
    }
}
