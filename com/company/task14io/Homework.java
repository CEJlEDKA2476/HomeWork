package com.company.task14io;

import java.io.File;
import java.io.IOException;

public class Homework {
    private final static String PATH = "D:\\ASD";
    private final static String FILE_NAME = "ASC.txt";

    public static void main(String[] args) throws IOException {
        SubHomework subHomework = new SubHomework();
        File directory = new File(PATH);
        File file = new File(directory, FILE_NAME);

        if (!file.exists()) {
            file.createNewFile();
        }

        subHomework.read(file);

        subHomework.write(file);
    }
}
