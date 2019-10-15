package com.company;
import java.util.Scanner;
import java.util.SplittableRandom;


public class Main {

    public static void main(String[] args) {
        Text text = new Text();
        Scanner scanner = new Scanner(System.in);
        int task;
        boolean a = true;
        //String mytext = new String();
        String mytext = "Князь равнодушно замолк. Анна Павловна. C свойственною ей придворною. и женскою ловкостью и быстротою такта. захотела и .щелкануть князя за то., что он дерзнул так отозваться о лице,  . рекомендованном императрице. и в то же время утешить его.\n" +
                "— Mais à propos de votre famille, — сказала она, — знаете ли, что ваша дочь, с тех пор как выезжает, fait les délices de tout le monde. On la trouve belle comme le jour 16,42.\n" +
                "Князь наклонился в знак уважения и признательности." +
                "И она улыбнулась своею восторженной улыбкой.\n" +
                "— Que voulez-vous? Lafater aurait dit que je n'ai pas la bosse de la paternité 17, — сказал князь.";
        while (a) {
            System.out.println("Choose what you want:\n" +
                    "1. Count the number of paragraphs\n" +
                    "2. Found the time talks\n" +
                    "3. Split first paragraphs\n" +
                    "5. Exit\n");
            task = scanner.nextByte();
            switch (task) {
                case 1: text.paragraph(mytext);
                    break;
                case 2: text.timetalk(mytext);
                    break;
                case 3: text.parsep(mytext);
                    break;
                //case 4: text.edittext(mytext);
                 //   break;
                case 5: a = false;
                    break;
            }

        }
        // write your code here
    }
}
