package AdventOfCode2022.Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Hashtable;

//scoring: rock-1 paper-2 scissors-3 win-6 draw-3 lose-0
public class Day2 {
    
    

    public static void main(){
        //Setup dictionary for quick parsing of scoring
        Hashtable<Character, Integer> shapePoints = new Hashtable<Character, Integer>();
        Hashtable<Character, Character> winTable = new Hashtable<Character, Character>();
        Hashtable<Character, Character> tieTable = new Hashtable<Character, Character>();
        Hashtable<Character, Character> loseTable = new Hashtable<Character, Character>();

        int totalScore = 0;
        int twoScore = 0;

        shapePoints.put('X', 1);
        shapePoints.put('Y', 2);
        shapePoints.put('Z', 3);

        winTable.put('A', 'Y');
        winTable.put('B', 'Z');
        winTable.put('C', 'X');

        tieTable.put('A', 'X');
        tieTable.put('B', 'Y');
        tieTable.put('C', 'Z');

        loseTable.put('A', 'Z');
        loseTable.put('B', 'X');
        loseTable.put('C', 'Y');

        try {

            File input = new File("AdventOfCode2022/Day2/input.txt");
            Scanner scanner = new Scanner(input);

            while(scanner.hasNextLine()){
                String s = scanner.nextLine();
                char e = s.charAt(0);
                char y = s.charAt(2);
                char x = 'x';

                //Determine if you need to win/tie/lose
                switch(y){
                    case 'Y':
                        twoScore += 3;
                        x = tieTable.get(e);
                        break;
                    case 'Z':
                        twoScore += 6;
                        x = winTable.get(e);
                        break;
                    case 'X':
                        x = loseTable.get(e);
                }
                //Calculate score for shape
                totalScore += shapePoints.get(y);
                twoScore += shapePoints.get(x);

                

                //Calculate score for win/tie/lose
                if(winTable.get(e) == y){
                    totalScore += 6;
                }
             
                 if(tieTable.get(e) == y){
                    totalScore += 3;
                }
            
            }    
            
            System.out.println("Task 1: " + totalScore);
            System.out.println("Task 2: " + twoScore);

            scanner.close();

            }


        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}


