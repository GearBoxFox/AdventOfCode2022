package AdventOfCode2022.Day1.CalorieCounting;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Vector;


public class CalorieCounting{

    public static void main(){

        System.out.println("hello world!");

        try{
            // Create all needed objects
            File calFile = new File("AdventOfCode2022/Day1/CalorieCounting/calories.txt");
            Scanner scanner = new Scanner(calFile);
            int totalCals = 0;

            Vector<Integer> elfCals = new Vector<Integer>(200);

            // Scans lines until file is empty
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                //Checks if the line isn't a newline
                if(line.length() > 1){
                    totalCals += Integer.parseInt(line);
                }

                //Checks for newline, and for higher calorie count
                if(line.length() <= 1){
                    elfCals.add(totalCals);
                    totalCals = 0;
                }

                
            
            }
            Collections.sort(elfCals);

            System.out.println("Part 1: " + elfCals.get(elfCals.size() - 1));
            System.out.println("Part 2: " + (elfCals.get(elfCals.size() - 1) + elfCals.get(elfCals.size() - 2) + elfCals.get(elfCals.size() - 3)));
                
            scanner.close();
        }

        catch(FileNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
            }
    }
}