/**
 * Fetch the specific information in the code
 */


import java.util.*;
import java.util.regex.*;

public class FetchInfo{
    private String keyWord;
    private String source;
    public FetchInfo(){
        keyWord = new String("");
        source = new String("");
    }
    public FetchInfo(String value0, String value1){
        keyWord = value0;
        source = value1;
    }
    public void setKeyword(String value){
        keyWord = value;
    }
    public void setSource(String value){
        source = value;
    }
    public ArrayList fetchBlock(){
        Pattern specPattern = Pattern.compile(keyWord);
        Matcher specMatcher = specPattern.matcher(source);

        ArrayList result = new ArrayList();
        while (specMatcher.find()) result.add(source.substring(specMatcher.start(),specMatcher.end()));

        return result;
    }
}