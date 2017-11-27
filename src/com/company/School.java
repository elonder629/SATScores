package com.company;


/**
 * Created by el693 on 11/10/17.
 */
public class School {
    private int SATMath;
    private int SATReading;
    private int SATWriting;
    public int average;
    public String Name = "";
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
        } else {
            SATReading = Integer.parseInt(temp[19]);
            SATWriting = Integer.parseInt(temp[20]);
            SATMath = Integer.parseInt(temp[18]);
            Name = temp[1];
        }
        average = ((SATMath + SATReading + SATWriting));
        System.out.println("\n" + Name + " \nTheir Average SAT Math Score is: " + SATMath + " \nTheir Average SAT Reading Score is: "
                + SATReading + " \nTheir Average SAT Writing Score is: " + SATWriting + " \nTheir Average SAT Score is: " + average);


    }


}




