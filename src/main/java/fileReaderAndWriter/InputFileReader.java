package fileReaderAndWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFileReader {

    private static final String INPUT_FILE_NAME = "./src/main/resources/source.txt";


    private InputFileReader() {
    }


    public static List<String> readInputFile() {

        List<String> arrayOfLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {
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
