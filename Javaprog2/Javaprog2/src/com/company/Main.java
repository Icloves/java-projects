package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Text text = new Text();
        int temp = 0;
        RegularExpressions regexp = new RegularExpressions();
        BuildBuff buff = new BuildBuff();
        Scanner scanner = new Scanner(System.in);
        int task;
        String myinput;
        boolean b, a = true;
        String mytext = "— Mais à propos de votre famille, — сказала она, — знаете ли, что ваша дочь, с тех lollol@mail.ru пор как выезжает, fait les délices de tout le monde. On la trouve belle comme le jour 16.42.\n" +
                "Князь наклонился в знак уважения и признательности." +
                "И она улыбнулась своею восторженной улыбкой.\n" +
                "Князь равнодушно 42.2 замолк. Анна Павловна 423. C свойственною ей придворною 43 . и женскою ловкостью 43 и быстротою такта. захотела и .щелкануть 11 князя за то., rsipgdkvqqopw@sogkrgk23123123.24fwes, что он дерзнул так отозваться о лице,  . рекомендованном 33 императрице. и в то же время 10 утешить его.\n" +
                "— Que voulez-vous? Lafater aurait dit que je rufj@rkgdioffvodifjv.irffffwefsfsd n'ai pas la bosse de la paternité 17, — сказал князь.";
        while (a) {
            System.out.println("\nChoose needed task:\n" +
                    "1. Edit text with using 'String'\n" +
                    "2. Edit text with using 'StringBuilder and StringBuffer'\n" +
                    "3. Using regular expressions\n" +
                    "0. Exit\n");
            task = scanner.nextByte();
            if (task == 1) {
                b = true;
                while (b) {
                    System.out.println("\nChoose what you want:\n" +
                            "1. Count the number of paragraphs\n" +
                            "2. Found the time talks\n" +
                            "3. Split first paragraphs\n" +
                            "4. Out edit test\n" +
                            "0. Back\n");
                    task = scanner.nextByte();
                    switch (task) {
                        case 1:
                            text.paragraph(mytext);
                            break;
                        case 2:
                            text.timetalk(mytext);
                            break;
                        case 3:
                            text.parsep(mytext);
                            break;
                        case 4:
                            text.edittext();
                            break;
                        case 0:
                            b = false;
                            break;
                    }
                }
            }
            else if (task == 2) {
                b = true;
                while (b) {
                    System.out.println("\nChoose what you want:\n" +
                            "1. Delete the large paragraph\n" +
                            "2. Modify text: append first paragraph to the end\n" +
                            "0. Back\n");
                    task = scanner.nextByte();
                    switch (task) {
                        case 1:
                            buff.delete_the_large_paragraph(mytext);
                            break;
                        case 2:
                            buff.append_first_to_end(mytext, temp);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            b = false;
                            break;

                    }
                }
            }
            else if (task == 3) {
                b = true;
                while (b) {
                    System.out.println("\nChoose what you want:\n" +
                            "1. Determine emails\n" +
                            "2. Show all emails in the text\n" +
                            "0. Back\n");
                    task = scanner.nextByte();
                    switch (task) {
                        case 1:
                            System.out.println("Input address for validation: ");
                            myinput = scanner.next();
                            regexp.valid_email(myinput);
                            break;
                        case 2:
                            regexp.email_in_text(mytext);
                            break;
                        case 0:
                            b = false;
                            break;
                    }
                }
            }
            else if (task == 0)
                a = false;
        }
    }
}
