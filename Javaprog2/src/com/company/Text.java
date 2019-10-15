package com.company;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class Text {
    void paragraph(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == '\n')
                count++;
        System.out.println("This text have " + count + " paragraphs\n");
    }
    void timetalk(String text){
        int count = 0;
        int a;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n')
                count++;
        }
        a = count;
        int[] myArray = new int[count];
        count = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (count >= a)
                break;
            if (text.charAt(i) == '\n')
                count++;
            if (Character.isDigit(text.charAt(i))) { //use format!!!!!!!!!!!!!!
                myArray[count] = text.charAt(i) + (myArray[count] * 10) - '0';
                //count++;
            }
            //System.out.print(text.charAt(i) + "");
        }
        System.out.println(Arrays.toString(myArray));
    }
    void parsep(String text){
        int count = 0;
        int a = 0;
        //int i = 0;
        //String newtext = "";
        String newtext[] = new String[1];
        String temp = "";
        System.out.println(Arrays.toString(newtext));
        //ArrayList<String> newtext = new ArrayList<String>();
//        for (int i = 0; '\n' != text.charAt(i); i++) {
//            //newtext.add(a, String.valueOf(text.charAt(i)));
//            if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?')
//                if (text.charAt(i + 1) == ' ' && text.charAt(i + 1) != '\n')
//                    if (Character.isUpperCase(text.charAt(i + 2))) {
//                        newtext.add(a, String.valueOf(text.charAt('\n')));
//                        a++;
//                    }
        int i = 0;
        while (text.charAt(i) != '\n')
        {
            temp += text.charAt(i);
            if (text.charAt(i + 1) == '\n'){
                newtext[0] = temp.replace(". ", ".\n");
            }
            i++;
        }
        newtext[0] += '\n';
        newtext[0] += text.substring('\n');
        System.out.println(Arrays.toString(newtext));
    }
//    void edittext(String text, String newtext)
//    {
//
//    }
}
