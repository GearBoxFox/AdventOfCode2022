package AdventOfCode2022.Day4;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Day4 {
    public static void main(){

        try{

            File input = new File("AdventOfCode2022/Day4/input.txt");
            Scanner scanner = new Scanner(input);
            int counts = 0;
            int counts2 = 0;

            while(scanner.hasNextLine()){
                //Input
                String[] words = scanner.nextLine().split(",");

                //Formats input into two ranges of ints
                Range range1 = new Range(Integer.valueOf(words[0].split("-")[0]), Integer.valueOf(words[0].split("-")[1]));
                Range range2 = new Range(Integer.valueOf(words[1].split("-")[0]), Integer.valueOf(words[1].split("-")[1]));

                if(range1.contains(range2)){
                    counts++;
                }
                else if(range2.contains(range1)){
                    counts++;
                }

                if (range1.overlaps(range2)){
                    counts2++;
                }
                else if(range2.overlaps(range1)){
                    counts2++;
                }

            }

            System.out.println("Task 1: " + counts);
            System.out.println("Task 2: " + counts2);
            scanner.close();

        }

        catch(FileNotFoundException e){

            e.printStackTrace();

        }

    }

}

class Range{
    private int low;
    private int high;

    public Range(int low, int high){
        this.low = low;
        this.high = high;
    }

    public boolean contains(Range range){
        return ((range.getLow() >= low) && (range.getHigh() <= high));
    }

    public boolean overlaps(Range range){
        /* 
        if(range.getLow() == low && range.getHigh() == high){
            return true;
        }

        else if(low == high){
            return range.low <= low && range.high >= low;
        }
        */
        
        return range.getHigh() >= low && range.getLow() <= high;
    }
    
    public int getLow(){
        return low;
    }

    public int getHigh(){
        return high;
    }
}
