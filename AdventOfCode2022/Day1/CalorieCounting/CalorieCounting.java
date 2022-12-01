package AdventOfCode2022.Day1.CalorieCounting;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class Main{

    public static void main() throws FileNotFoundException{

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
        }

        catch(FileNotFoundException e){
            throw(e);
        }

    }
}