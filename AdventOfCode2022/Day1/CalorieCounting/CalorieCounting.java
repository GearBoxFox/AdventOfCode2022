package AdventOfCode2022.Day1.CalorieCounting;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class CalorieCounting{

    public static void main(){

        System.out.println("hello world!");

        try{
            File calFile = new File("calories.txt");
            Scanner scanner = new Scanner(calFile);
            int totalCals = 0;

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                if(line.indexOf("\n") != 0){
                    totalCals += Integer.parseInt(line);
                }
            }
            scanner.close();
        }

        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}