package example;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class WorkInFile {

    public static void main(String[] args) throws FileNotFoundException {

        String inFileName = args[0];
        String outFileName = args[1];

        String[] fromFile = FileWorker.read(inFileName);
        LinkedList<String> resultList = FileChecker.check(fromFile);
        FileWorker.write(outFileName, resultList);
    }

}
