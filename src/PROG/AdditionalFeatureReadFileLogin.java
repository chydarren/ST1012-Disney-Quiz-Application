/*REFERENCES
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (https://www.mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/)
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (http://stackoverflow.com/questions/2885173/how-to-create-a-file-and-write-to-a-file-in-java/)
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (http://www.javaproficiency.com/2015/02/file-create-in-java.html)
 */
package PROG;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AdditionalFeatureReadFileLogin {

    private String pin;
    
    public String AdditionalFeatureReadFileLogin() {

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader("c:\\disney-quiz-application\\attachments\\AdditionalFeatureLogin.txt"));
            try {

                //STORE THE LINE 
                 pin = br.readLine();

                //EXCEPTIONS
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
        return pin; 
    }
}
