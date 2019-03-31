package edu.cscc;

import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException  {

		Scanner scanner = new Scanner( System.in );

		String questionOne;
        String questionTwo;
        String questionThree;

        System.out.println("What's your favorite color?");
        questionOne = scanner.next();

        System.out.println("What's your hometown?");
        questionTwo = scanner.next();

        System.out.println("What's good my dude?");
        questionThree = scanner.next();


        PrintWriter writer = new PrintWriter("answers.txt", "UTF-8");

        writer.println(questionOne);
		writer.println(questionTwo);
		writer.println(questionThree);

        writer.close();
    }
}

