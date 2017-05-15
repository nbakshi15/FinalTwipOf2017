package com.company;
import java.util.*;
import java.io.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        File inputx = new File("RawData.txt");
        Scanner scan = new Scanner(inputx);
        scan.useDelimiter("\t,");
        ArrayList<String> collection = new ArrayList<String>();

        String[] names = new String[1000];
        int x = - 1;


        while(scan.hasNext()) {
            x++;
            collection.add(scan.nextLine());
        }

        int secretNumber = 0;
        double frq1 = 0;
        double frq2 = 0;

        StudNames stud = new StudNames (scan.nextLine(), secretNumber, frq1, frq2);

        while (scan.hasNext()) {
            secretNumber = Integer.parseInt(scan.nextLine());
            int num=0;

            {
                num = scan.nextInt();

            }

            {
                scan.nextLine();
                continue;

            }

        File nametext = new File("names.txt");
        Scanner scan2 = new Scanner(nametext);

        while(scan2.hasNextLine()) {
            String name = scan2.next();
            int numb = scan2.nextInt();

            for(String zpp : collection)
                if (numb == zpp.) {

                    zpp.weird = name;

                    break;

                }

        System.out.print("Name" + ""  + "Secret Number" + "" + "Avg Total Grade" + "" + "Avg FR Q1 Grade" + "" +"Avg FR Q2 Grade");

        System.out.println("");

        for(StudNames zpp : collection) {

            System.out.println();

        }

    }

        }


    }
}
