package edu.cscc;

import java.util.Scanner;
import java.io.*;

public class interviewQuestions {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );

        String questionOne;
        String questionTwo;
        String questionThree;

        System.out.println("What's your favorite color?");
        questionOne = scanner.next();

        System.out.println("What city were you born in?");
        questionTwo = scanner.next();

        System.out.println("What's your favorite movie?");
        questionThree = scanner.next();


        PrintWriter writer = new PrintWriter("Interview.md", "UTF-8");

        writer.println("My favorite color is "+ questionOne);
        writer.println("My hometown is " + questionTwo);
        writer.println("My favorite movie is "+ questionThree);

        writer.close();

    }

}
