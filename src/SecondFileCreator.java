import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SecondFileCreator {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "resultOfActions.txt";
        File file = new File(fileName);

        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String numbers = scan.nextLine();
            System.out.println(numbers);
        }
    }
}

