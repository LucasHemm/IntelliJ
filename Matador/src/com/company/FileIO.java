package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    ArrayList<String> readGameData() {
    File file = new File("src/data.txt");
    ArrayList<String> data = new ArrayList<>();

    try{
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            data.add(scan.nextLine());
        }
    }
    catch(FileNotFoundException e) {
        data = null;
    }
        return data;
    }

    public String[] readFieldData(){
        File file = new File("src/fieldData.csv");
        String[] data = new String[40];

        try{
            Scanner scan = new Scanner(file);
            int i = 0;

            String header = scan.nextLine(); // ignorer header inde i dokumentet
            System.out.println(header);
            while (scan.hasNextLine()) {
                data[i] = scan.nextLine();
                i++;
            }
        } catch (FileNotFoundException e){
            data = null;
        }
        return data;

    }

}