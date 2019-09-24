/*REFERENCES
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (https://www.mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/)
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (http://stackoverflow.com/questions/2885173/how-to-create-a-file-and-write-to-a-file-in-java/)
  ADDITIONAL FEATURE - LOGIN USING NOTEPAD FILE (http://www.javaproficiency.com/2015/02/file-create-in-java.html)
 */
package PROG;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AdditionalFeatureCreateFileLogin {

    private String pin = "";

    public AdditionalFeatureCreateFileLogin(String p) {

        try {

            //STORE CONTENT AND PATH 
            pin = p;
            String path = "c:\\disney-quiz-application\\attachments\\AdditionalFeatureLogin.txt";
            File file = new File(path);

            //IF FILE DONT EXIST, THEN CREATE 
            if (!file.exists()) {
                file.createNewFile();
            }

            //START NEW FILE WRITING 
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            //WRITE INTO THE FILE 
            bw.write(pin);

            //CLOSE THE FILE 
            bw.close();

            //EXCEPTIONS
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
