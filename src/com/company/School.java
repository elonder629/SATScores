package com.company;

import java.util.Scanner;

/**
 * Created by el693 on 11/10/17.
 */
public class School {
    public int SATMath;
    public int SATReading;
    public int SATWriting;
    public double average;
    public String Name = "";

    public School(String scores) {
       /* String temp = "";
        if (scores.lastIndexOf("%") != -1 && scores.lastIndexOf("%") == scores.length() - 1) {
            temp = scores.substring(0, scores.lastIndexOf("%") - 5);
            System.out.println(temp);
            temp = temp.substring(temp.lastIndexOf("%") + 2);
            System.out.println(temp);

            Scanner sc = new Scanner(temp);

            if (sc.hasNext()) {
                SATMath = sc.nextInt();
                SATReading = sc.nextInt();
                SATWriting = sc.nextInt();
            }

        } else {
            SATReading = 0;
            SATWriting = 0;
            SATMath = 0;
        }*/
        String[] temp = scores.split("\t");
        Scanner reading = new Scanner(temp[19]);
        Scanner math = new Scanner(temp[18]);
        Scanner writing = new Scanner(temp[20]);
        if (temp.length < 22 && reading.hasNextInt()) {
            SATWriting = 0;
            SATMath = 0;
            SATReading = 0;
            Name = temp[1];
        } else {
            System.out.println(temp[19]);
            SATReading = Integer.parseInt(temp[19]);
            SATWriting = Integer.parseInt(temp[20]);
            SATMath = Integer.parseInt(temp[18]);
            Name = temp[1];
        }
        average = ((SATMath + SATReading + SATWriting));
        System.out.println(SATReading);
        System.out.println(SATWriting);
        System.out.println(SATMath);
        System.out.println(Name);

    }
}
