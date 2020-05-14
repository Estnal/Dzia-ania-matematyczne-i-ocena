import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "numbersFile.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.newLine();
            writer.write("1 + 2 = 3");
            writer.newLine();
            writer.write("2 + 2 = 4");
            writer.newLine();
            writer.write("3 - 1 = 2");
            writer.newLine();
            writer.write("2 * 4 = 8");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
