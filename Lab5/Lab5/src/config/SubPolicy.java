/*
 * This program has been written by Brendan Bellows and should
 * probably be executed with care as he is a student, not a trained
 * professional. Yet.
 */
package config;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SubPolicy {
    private String direction;
    private String regexp;
    private String flags;
    private Pattern pattern;
    
    public SubPolicy(){
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setRegexp(String inRegexp) {
        inRegexp = inRegexp.substring(1, inRegexp.length()-1);
        this.regexp = inRegexp;
        pattern = Pattern.compile(inRegexp);
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }
    
    public boolean matchRule(String inTest){
        Matcher m = this.pattern.matcher(inTest);
        return m.find();
    }
    
}
