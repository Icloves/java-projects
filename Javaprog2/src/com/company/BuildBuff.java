package com.company;

import java.util.Arrays;

public class BuildBuff {
    void delete_the_large_paragraph(String text)
    {
        int count = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == '\n')
                count++;
        int [] counter = new int[count];
        //StringBuilder [] large = new StringBuilder[count];
        String[] large = text.split("\n");
//        String large = new String(text);

        for (int i = 1; i < large.length; i++)
        {
            if (large[i].length() > large[i - 1].length() && large[i].length() > large[0].length())
            {
                large[0] = large[i];
            }

        }



//        for (int i = 0; i < count; i++)
//        {
//            if ((i == 1 ||i == 0) || text.indexOf("." + 1) == '\n')
//                large[i] = text.substring(i, text.indexOf("\n"));
//        }
//        for (int i = 1; i < large[i].length(); i++)
//            if (large[i].length() > large[i - 1].length())
//                large[0] = large[i];

       // System.out.println(large[0]);
        System.out.println(large[0]);
    }
}
