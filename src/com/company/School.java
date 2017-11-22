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
    public  int rank;

    public School(String scores) {
        String[] temp = scores.split("\t");

        if (temp.length < 22) {
            SATWriting = 0;
            SATMath = 0;
            SATReading = 0;
            Name = temp[1];
        } else if (temp[19].equals("") && temp[18].equals("") && temp[20].equals("")) {
            SATWriting = 0;
            SATMath = 0;
            SATReading = 0;
            Name = temp[1];
        }
        else {
            Scanner reading = new Scanner(temp[19]);
            Scanner math = new Scanner(temp[18]);
            Scanner writing = new Scanner(temp[20]);
            SATReading = Integer.valueOf(temp[19]);
            SATWriting = Integer.parseInt(temp[20]);
            SATMath = Integer.parseInt(temp[18]);
            Name = temp[1];
        }
        average = ((SATMath + SATReading + SATWriting));
        System.out.println(SATReading);
        System.out.println(SATWriting);
        System.out.println(SATMath);
        System.out.println(average);
        System.out.println(Name);


    }


}

