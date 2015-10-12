/**
 * Tester of the simple spider
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

public class SpiderTester{
    private String dir, filenameBase;
    public SpiderTester(){
        dir = new String("");
        filenameBase = new String("result.html");
    }
    public static void main(String args[]) throws Exception{
        Scanner input = new Scanner(System.in);
        String website = input.nextLine();
        String keyWord = input.nextLine();
        String temp = new String();

        GetHtmlSource ghs = new GetHtmlSource(website);
        String result_G = ghs.fetchInfo();

        FetchInfo fi = new FetchInfo(keyWord, result_G);
        ArrayList result_F = fi.fetchBlock();

        File outputFile = new File("result.html");
        try{
            outputFile.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        FileOutputStream outputStream = new FileOutputStream(outputFile);
       /* outputStream.write("Source : \n".getBytes());
        outputStream.write(result_G.getBytes());*/
        outputStream.write("<p> Fetch ".getBytes());
        outputStream.write(temp.valueOf(result_F.size()).getBytes());
        outputStream.write(" results. </p>".getBytes());
        Iterator records = result_F.iterator();
        int nu = 0;
        while (records.hasNext()){
            outputStream.write("<p> Record ".getBytes());
            outputStream.write(temp.valueOf(++nu).getBytes());
            outputStream.write(" : ".getBytes());
            String record = (String)records.next();
            outputStream.write(record.getBytes());
            outputStream.write("</p>".getBytes());
        }
        outputStream.close();
    }
}