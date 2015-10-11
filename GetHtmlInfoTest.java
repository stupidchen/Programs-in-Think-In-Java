/**
 * Use java.net.URL to fetch the information of a web page
 */

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.Format;
import java.util.Scanner;

public class GetHtmlInfoTest{
    private String PagePath;
    public GetHtmlInfoTest(){
        PagePath = new String("http://www.google.com");
    }
    public void setPagePath(String PathStr){
        PagePath = PathStr;
    }
    public void fetchInfo() throws Exception {
        URL connection = new URL(PagePath);
        InputStream sourceStream = connection.openStream();
        StringBuffer source = new StringBuffer("");
        int temp;
        while ((temp = sourceStream.read()) != -1) source.append((char)temp);
        System.out.print(source.toString());
    }
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        GetHtmlInfoTest test = new GetHtmlInfoTest();
        test.setPagePath(input.nextLine());
        test.fetchInfo();
    }
}