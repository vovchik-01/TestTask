package repository;

import java.util.List;

public interface FileWriterInterface {

    String OUTPUT_FILE_NAME = "./src/main/resources/output.txt";

    void writeOutputFile(List<String> dataForWrite);
}
