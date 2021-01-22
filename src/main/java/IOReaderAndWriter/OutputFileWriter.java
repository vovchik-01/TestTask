package IOReaderAndWriter;

import repository.FileWriterInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFileWriter implements FileWriterInterface {

    private static final String OUTPUT_FILE_NAME = "./src/main/resources/output.txt";

    @Override
    public void writeOutputFile(List<String> dataForWrite) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME))) {
            for (String line : dataForWrite) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
