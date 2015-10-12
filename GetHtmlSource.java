/**
 * Use java.net.URL to fetch the information of a web page
 */

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GetHtmlSource{
    private String PagePath;
    public GetHtmlSource(){
        PagePath = new String("http://www.google.com");
    }
    public GetHtmlSource(String value){
        PagePath = value;
    }
    public void setPagePath(String PathStr){
        PagePath = PathStr;
    }
    public String fetchInfo() throws Exception {
        URL connection = new URL(PagePath);
        InputStream sourceStream = connection.openStream();
        StringBuffer source = new StringBuffer("");
        int temp;
        while ((temp = sourceStream.read()) != -1) source.append((char) temp);
        return source.toString();
    }
}
