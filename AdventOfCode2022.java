import AdventOfCode2022.Day1.CalorieCounting.CalorieCounting;

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
        }

        s.close();
    }
}
