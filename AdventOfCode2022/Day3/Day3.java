package AdventOfCode2022.Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {
    public static void main(){
        try{
            File input = new File("AdventOfCode2022/Day3/input.txt");
            Scanner scanner = new Scanner(input);
            int totalPror = 0;
            int task2 = 0;

            //Counter and string variables for part 2
            String l1 = "", l2 = "";
            int i = 0;

            //read lines from input
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                //Part 1
                // Split code into two halves
                String half1 = line.substring(0, line.length() / 2);
                String half2 = line.substring(line.length() / 2);

                //Checks for similar characters in both substrings
                for(char ch: half1.toCharArray()){
                    if(half2.contains(String.valueOf(ch))){
                        totalPror += hash(ch);
                        break;
                    }
                }

                //Part 2
                //this is pain
                if(i == 2){
                    //Nestled foreach loop to check similar characters
                    //First line
                    for(char ch: l1.toCharArray()){

                        //Second line
                        if(l2.contains(String.valueOf(ch))){

                            //Third line
                            if(line.contains(String.valueOf(ch))){

                                task2 += hash(ch);
                                i = 0;
                                break;
                            }
                        }
                    }

                }

                //Fill extra lines
                else if(i == 1){
                    l2 = line;
                    i++;
                }

                else if(i == 0){
                    l1 = line;
                    i++;
                }

                
                
            }
            scanner.close();
            System.out.println("Task 1: " + totalPror);
            System.out.println("Task 2: " + task2);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    static int hash(char c){
        if(Character.isUpperCase(c)){
            //offset of ascii value (65-90) to numerical priority value (27-52) for challenge
            return (int) c - 38;
        }
        if(Character.isLowerCase(c)){
            //offset of ascii value (97-122) to priority value (1-26) for challenge
            return (int) c - 96;
        }

        return 0;
    }
}
