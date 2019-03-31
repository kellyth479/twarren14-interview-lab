package edu.cscc;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException  {

            final String regex = "[$](toName)";
            final String string = "Hello $toName,\n\n"
                    + "I am $myName, and I am looking to send you $send.\n\n"
                    + "Thanks,\n\n"
                    + "$myName";
            final String subst = "James";


            final Pattern pattern = Pattern.compile(regex);

            final Matcher matcher = pattern.matcher(string);

            // The substituted value will be contained in the result variable
            final String result = matcher.replaceFirst(subst);


            System.out.println("Substitution result: " + result);

        PrintWriter writer = new PrintWriter("form.txt", "UTF-8");
        writer.println(result);

        writer.close();
    }
}

