import AdventOfCode2022.Day1.CalorieCounting.CalorieCounting;
import AdventOfCode2022.Day2.Day2;
import AdventOfCode2022.Day3.Day3;
import AdventOfCode2022.Day4.Day4;

import java.util.Scanner;

public class AdventOfCode2022 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("What day do you want to see?: ");

        String input = s.nextLine();
        int in = Integer.parseInt(input);

        switch(in){
            case 1:
                CalorieCounting.main();
                break;
            case 2:
                Day2.main();
                break;
            case 3:
                Day3.main();
                break;
            case 4:
                Day4.main();
                break;
        }

        s.close();
    }
}
