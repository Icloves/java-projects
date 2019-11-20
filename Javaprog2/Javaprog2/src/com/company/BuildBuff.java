package com.company;

import java.util.Arrays;

public class BuildBuff {
    int delete_the_large_paragraph(String text)
    {
        int temp = 0;
        StringBuilder deltext = new StringBuilder(text);
        String[] large = deltext.toString().split("\n");
        for (int i = 1; i < large.length; i++) {
            temp = i;
            if (large[i].length() > large[i - 1].length() && large[i].length() > large[0].length())
                large[0] = large[i];
        }
        deltext.delete(deltext.lastIndexOf(large[0]), deltext.lastIndexOf(large[0]) + large[0].length() + 1);
        System.out.println(deltext);
        return temp;
    }

    void parse_to_float(String text)
    {
        
    }

    void append_first_to_end(String text, int temp)
    {
        StringBuilder swaptext = new StringBuilder(text);
        String[] firstsent = swaptext.toString().split("\n");
        swaptext.append("\n").append(firstsent[0]);
        swaptext.delete(swaptext.indexOf(firstsent[0]), swaptext.indexOf("\n") + 1);
        //swaptext.append(swaptext.lastIndexOf("\n", swaptext.length()));
        System.out.println(swaptext);
    }
}
