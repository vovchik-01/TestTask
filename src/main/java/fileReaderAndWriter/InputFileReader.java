package fileReaderAndWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFileReader {

    private static String inputFileName = "./src/main/resources/source.txt";


    public static List<String> readInputFile() {

        List<String> arrayOfLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                arrayOfLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayOfLines;
    }
}
