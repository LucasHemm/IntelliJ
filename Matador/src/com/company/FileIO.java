package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO
{
    File file = new File("data.txt");
    ArrayList<String> data = new ArrayList<>();
        try {
    Scanner scan = new Scanner(file);
    while(scan.hasNextLine()){
        data.add(scan.nextLine());//“Egon: 30000”
    }
}catch(
    FileNotFoundException e){
    e.printStackTrace();
}
        return data;



}
