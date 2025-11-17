import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeFileReadingEfficiency {
    public static void main(String[] args) throws IOException {
        String filePath = "path_to_your_large_file.txt"; // Replace with your file path
        File file = new File(filePath);

        // FileReader
        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(file)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                // Process the character
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + " ms");

        // InputStreamReader
        startTime = System.currentTimeMillis();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
            int character;
            while ((character = inputStreamReader.read()) != -1) {
                // Process the character
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ms");
    }
}