import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Elf(){
    public int index;
    public int cals;

    public Elf(int index, int cals){
        self.index = index;
        self.cals = cals;
    }
}

public class Main{

    public static void main(){

        System.out.println("Hello world!");

        try{
            File calFile = new File("calories.txt");
            Scanner = new Scanner(calFile);
            int totalCals = 0;

            while(scanner.hasNextLine()){
                String line = scanner.readLine();

                if(line.indexof("\n") != 0){
                    totalCals += (int)line;
                }
            }

        }

    }
}