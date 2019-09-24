/*REFERENCES
  ADDITIONAL FEATURE - OPEN WEBSITE (https://www.youtube.com/watch?v=w8hjGTOan7k)
 */
package PROG;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AdditionalFeatureWebsite {

    private static String website = "";

    public AdditionalFeatureWebsite (String website) throws IOException, URISyntaxException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI(website));
    }
}
