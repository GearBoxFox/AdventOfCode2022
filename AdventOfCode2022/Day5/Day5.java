package AdventOfCode2022.Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day5 {

    public static void main(String args[]){

        try{
            //Size determined by looking at puzzle input :p
            char[][] stack = new char[10][8];

            File input = new File("AdventOfCode2022/Day5/input.txt");
            Scanner scanner = new Scanner(input);

            while(scanner.hasNextLine()){

                String line;
                //Read only the part of the file conatining the crates
                while(!(line = scanner.nextLine()).startsWith("m") && scanner.hasNextLine()){
                    int i = 0, y = 0;
                    for(String s : line.split(" ")){
                        // Parse crates into the 2d array "stack"
                        s.trim();
                        stack[i][y] = s.charAt(0);

                        if(i == 9) i = 0; y++;

                        i++;

                    }
                }

            }

            scanner.close();
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
    
}
