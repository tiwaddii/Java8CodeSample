
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Use double backslash (\\) in Windows paths
    "D:\\folder\\file.txt"
   OR use forward slash (works fine in Java):
    "D:/folder/file.txt"
   Files.lines() → best for large files (streaming, memory efficient)
   readAllLines() → loads entire file (avoid for large data)
}*/

public class FileAccess {
    public static void main(String[] args) {
        String path = "\\D:\\alpha\\sample.txt"; //Windows Path

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}