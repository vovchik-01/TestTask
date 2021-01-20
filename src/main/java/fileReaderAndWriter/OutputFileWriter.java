package fileReaderAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFileWriter {

    private final String outputFileName = "./src/main/resources/output.txt";


    public void writeOutputFile(List<String> dataForWrite) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String line : dataForWrite) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
