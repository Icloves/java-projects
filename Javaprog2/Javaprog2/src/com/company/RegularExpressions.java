package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    void valid_email(String text) {
        //System.out.println(text);
        Pattern p = Pattern.compile(".+@.+\\.\\w+");
        Matcher m = p.matcher(text);
        System.out.println(m.matches());
        //if (m.matches())
        //return m.matches();
    }

    void email_in_text(String text)
    {
        String newtext [] = text.split(" ");
        int len = newtext.length;
        Pattern p = Pattern.compile(".+@.+\\.\\w+");

        for (int i = 0; i < (len - 1); i++)
        {
            Matcher m = p.matcher(newtext[i]);
            if (m.find())
                System.out.println(m.group());
        }
    }
}
