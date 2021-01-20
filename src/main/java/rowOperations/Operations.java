package rowOperations;

import fileReaderAndWriter.InputFileReader;
import fileReaderAndWriter.OutputFileWriter;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    public static void main(String[] args) {

        OutputFileWriter outputFileWriter = new OutputFileWriter();
        outputFileWriter.writeOutputFile(checkFileAndWriteLinesToList());
    }


    /**
     * Using a regular expression, select a number from a string and convert it to Integer
     */
    public static int getNumberFromLine(String line) {
        return Integer.parseInt(line.replaceAll("[^0-9]+", ""));
    }


    /**
     * Generate an array of Fibonacci numbers with the specified upper bound.
     */
    public static List<Integer> getSequenceFibonacci(int upperNumber) {

        List<Integer> sequenceFibonacci = new ArrayList<>();
        sequenceFibonacci.add(0, 0);
        sequenceFibonacci.add(1, 1);

        for (int i = 2; i < upperNumber; i++) {
            sequenceFibonacci.add(i, sequenceFibonacci.get((i - 1)) + sequenceFibonacci.get((i - 2)));
        }
        return sequenceFibonacci;
    }


    /**
     * Expand the line in the opposite direction
     */
    public static String reverseLine(String line) {
        char[] charArray = line.toCharArray();
        String resultString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString += charArray[i];
        }
        return resultString;
    }


    /**
     * In this method, we read the file and check for matches with the Fibonacci numbers.
     */
    public static List<String> checkFileAndWriteLinesToList() {
        List<String> result = new ArrayList<>();
        int numberFromLine;
        List<Integer> fibonacci = getSequenceFibonacci(50);

        for (String line : InputFileReader.readInputFile()) {
            numberFromLine = getNumberFromLine(line);

            if (fibonacci.contains(numberFromLine))
                result.add(reverseLine(line));
        }
        return result;
    }

}
