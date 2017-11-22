package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static School[] schools = new School[1000];
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("scores.txt"));
        String[] abc = new String[1000];

        int maxIndx = -1;
        School[] schools = new School[1000];
        while (input.hasNext()) {
            maxIndx++;
            abc[maxIndx] = input.nextLine();
        }

        for (int j = 1; j <= maxIndx; j++) {
            schools[j] = new School(abc[j]);
        }
        for (int j = 1; j <= maxIndx; j++) {
            int currentRank = 0;
            for (int x = 1; x <= maxIndx; x++) {
                if (schools[j].average <= schools[x].average && schools[j].Name.equals(schools[x].Name) == false) {
                    currentRank++;
                }
            }
            schools[j].rank = currentRank;
            System.out.println(currentRank);
        }
        School[] ranked = new School[1000];
        for (int x = 1; x <= maxIndx;x++){
            ranked[schools[x].rank] = schools[x];

        }
        System.out.println(ranked[2].Name);

    }

}
