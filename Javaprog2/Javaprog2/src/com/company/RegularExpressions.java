package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    boolean valid_email(String text) {
        System.out.println(text);
        Pattern p = Pattern.compile(".+@.+\\..+");
        Matcher m = p.matcher(text);
        System.out.println(m.matches());
        //if (m.matches())
        return m.matches();
    }
}
