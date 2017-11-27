package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("scores.txt"));
        String[] abc = new String[1000];
        double overallAverage = 0;
        int maxIndx = -1;
        ArrayList<School> schools = new ArrayList<>();
        while (input.hasNext()) {
            maxIndx++;
            abc[maxIndx] = input.nextLine();
        }

        for (int j = 0; j < maxIndx; j++) {
            schools.add(j, new School(abc[j + 1]));
        }

        schools.sort( (s1, s2) ->
                Integer.compare(s2.average, s1.average));
        int max = 0;
        for (School x : schools) {
            if (x.average != 0){
                max++;
                overallAverage += x.average;
            }


        }
        overallAverage = Math.round(overallAverage/max);
        System.out.println("The overall average of NY is " + overallAverage);
        System.out.println("The top three schools in NY are " + schools.get(0).Name + ", " + schools.get(1).Name + ", " + schools.get(2).Name);
    }


}
