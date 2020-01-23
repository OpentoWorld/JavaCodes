package ObjectOrientedProgrammingConcepts.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular3 {
    public static void main(String[] args) {
        String pattern="in";
        String stringToCheck="Happy Learning in Edureka!";
        Pattern compiledPattern=Pattern.compile(pattern);
        Matcher matcher=compiledPattern.matcher(stringToCheck);
        while(matcher.find()){
            System.out.println(stringToCheck.substring(matcher.start(),matcher.end()));
        }
    }
}
