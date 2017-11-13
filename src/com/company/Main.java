package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
	Scanner input = new Scanner(new File("scores.txt"));
        String[] abc = new String[1000];
        int maxIndx = -1;
        School[] schools = new School[1000];
        while(input.hasNext())
        {
            maxIndx++;
            abc[maxIndx] = input.nextLine();
        }
        maxIndx = 0;
        for (int j = 0; j <= maxIndx; j++){

            schools[j] = new School(abc[j]);
            maxIndx++;

        }





    }
}
