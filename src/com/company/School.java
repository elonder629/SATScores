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
    public School(String scores){
        String temp = "";
        if (scores.lastIndexOf("%") != -1 && scores.lastIndexOf("%") == scores.length()-1) {
            temp = scores.substring(0, scores.lastIndexOf("%") - 5);
            System.out.println(temp);
            temp = temp.substring(temp.lastIndexOf("%")+2);
            System.out.println(temp);

            Scanner sc = new Scanner(temp);


                SATMath = sc.nextInt();
                SATReading = sc.nextInt();
                SATWriting = sc.nextInt();

        }
        else {
            SATReading = 0;
            SATWriting = 0;
            SATMath = 0;
        }
        average = (Math.round((SATMath + SATReading + SATWriting)/3));



    }
}
