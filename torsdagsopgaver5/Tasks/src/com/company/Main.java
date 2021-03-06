package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        //System.out.println(text.length);

        //printWordsStartingWith("Ø");

        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        //printLongestWord();
        //printFirstHalfOfEachWord();
        printMostFrequentLetter();

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
                System.out.println(s.substring(0,s.length()/2));
            }
        }

    static ArrayList<Character> chars = new ArrayList<>();
    static ArrayList<Integer> charCount = new ArrayList<>();
        //task 3
        private static void printMostFrequentLetter(){
            for(String s: text){
                s = s.toLowerCase();
                for(int i = 0; i <= s.length()-1;i++){
                    char x = s.charAt(i);
                    findChar2(x);
                }
            }
            System.out.println(chars);
           System.out.println(charCount);
            //System.out.println(chars.size());
        }

        private static void findChar1(char x){
            //System.out.println(x);
           if(chars.size() == 0){
               chars.add(x);
               charCount.add(1);
               //System.out.println("den er nul");
           }

            for(int i = 0; i < chars.size(); i++){
                if(chars.get(i) == x){
                    charCount.set(i, i += 1);
                   // System.out.println("if statement");
                    //System.out.println("den er kendt " + x);
                }
                else{
                    chars.add(x);
                    charCount.add(1);
                    //System.out.println("den er ukendt " + x);
                    //System.out.println("else statement");
                }
            }
           // for(int i = 0; i <= chars.size(); i++){
        }

        private static void findChar2(char x ){
            boolean found = false;
               if(chars.size() == 0){
                   chars.add(x);
                   //System.out.println(chars.get(0));
               }
               else{
                   for(int i = 0; i < chars.size()-1;i++){
                       if(chars.get(i) == x){
                           //System.out.println("if statement");
                           //System.out.println(x);
                           found = true;
                           //System.out.println("i: " + i + " arraysize:" + chars.size());
                           charCount.set(i, charCount.get(i)+1);
                       }
                       else{
                           //System.out.println("else statement");
                       }
                   }
                   if(found == false){
                       chars.add(x);
                       charCount.add(1);
                       //System.out.println("fandt nyt bogstav: " + x);
                   }
               }
        }
}