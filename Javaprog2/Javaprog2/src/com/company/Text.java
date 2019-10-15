package com.company;
import java.lang.String;
import java.util.Arrays;

public class Text {
    String newtext = "";
    void paragraph(String text) {
        if (newtext == "") { // operator '==' same with 'equals(oper)'
            int count = 0;
            for (int i = 0; i < text.length(); i++)
                if (text.charAt(i) == '\n')
                    count++;
            System.out.println("This text have " + count + " paragraphs\n");
        }
        else
        {
            int count = 0;
            for (int i = 0; i < newtext.length(); i++)
                if (newtext.charAt(i) == '\n')
                    count++;
            System.out.println("This text have " + count + " paragraphs\n");
        }
    }
    void timetalk(String text){
        int count = 1;
        int a;
        if (newtext.equals("")) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '\n')
                    count++;
            }
            a = count;
            int[] myArray = new int[count];
            count = 1;
            for (int i = 0; i < text.length(); i++) {
                if (count == a)
                    break;
                if (text.charAt(i) == '\n')
                    count++;
                if (Character.isDigit(text.charAt(i))) { //use format!!!!!!!!!!!!!!
                    myArray[count] = text.charAt(i) + (myArray[count] * 10) - '0'; //Если после запятой идет пробел то выходим, иначе дальше чекаем и записываем
                    //count++;
                }
                //System.out.print(text.charAt(i) + "");
            }
            System.out.println(Arrays.toString(myArray));
        }
        else {
            count = 1;
            for (int i = 0; i < newtext.length(); i++) {
                if (newtext.charAt(i) == '\n')
                    count++;
            }
            a = count;
            int[] myArray = new int[count];
            count = 1;
            for (int i = 0; i < newtext.length(); i++) {
                if (count == a)
                    break;
                if (newtext.charAt(i) == '\n')
                    count++;
                while (Character.isDigit(newtext.charAt(i))) {
                    if (newtext.charAt(i + 1) == ',' && newtext.charAt(i + 2) == ' ') {
                        myArray[count] = newtext.charAt(i) + (myArray[count] * 10) - '0';
                        i++;
                        break;
                    } else if (newtext.charAt(i + 1) == ',' && Character.isDigit(newtext.charAt(i + 2))) {
                        myArray[count] = newtext.charAt(i) + (myArray[count] * 10) - '0';
                        i++;
                        myArray[count] = newtext.charAt(i);
                    } else
                        myArray[count] = newtext.charAt(i) + (myArray[count] * 10) - '0';
                    i++;
                }
                //if (Character.isDigit(newtext.charAt(i))) { //use format!!!!!!!!!!
                //  myArray[count] = newtext.charAt(i) + (myArray[count] * 10) - '0'; //Если после запятой идет пробел то выходим, иначе дальше чекаем и записываем
                //count++;
                //}
                //System.out.print(text.charAt(i) + "");
            }
            System.out.println(Arrays.toString(myArray));
        }
    }
    void parsep(String text){
        String temp = "";
        int i = 0;

        while (text.charAt(i) != '\n')
        {
            temp += text.charAt(i);
            if (text.charAt(i + 1) == '\n')
                newtext = temp.replace(". ", ".\n");
            i++;
        }
        newtext += text.substring(i);
    }
    void edittext()
    {
        System.out.println(newtext);
    }
}