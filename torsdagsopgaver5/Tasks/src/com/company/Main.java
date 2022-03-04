package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        //printWordsStartingWith("Ø");

        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        //printLongestWord();
        printFirstHalfOfEachWord();


    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }
        //skriv dine metoder herunder:
        //task 1
        private static void printLongestWord(){
            int counter = 0;
            String longestWord ="";
            for(String s : text){
                if(s.length() > counter){
                    counter = s.length();
                   longestWord = s;
                }
            }
            System.out.println(longestWord);
        }
        //task 2
        private static void printFirstHalfOfEachWord(){
            for(String s: text){
                System.out.println(s.substring(s.length()/2));
            }
        }
        //task 3
        private static void printMostFrequentLetter(){
        
        }


}
