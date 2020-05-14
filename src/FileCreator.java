import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName= "numbersFile.txt";
        File file = new File(fileName);
        Scanner scan = new Scanner(file);

        int line =0;
        while (scan.hasNextLine()) {
            String numbers = scan.nextLine();
            System.out.println(numbers);
            line++;

        }
        System.out.println("Liczba wierszy w pliku:" + line);
        scan.close();
    }
}
