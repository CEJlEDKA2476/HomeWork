package com.company.task14io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    private final static String PATH = "D:\\ASD";
    private final static String FILE_NAME = "ABC.txt";

    public static void main(String[] args) throws IOException {
        File directory = new File(PATH);
        File file = new File(directory, FILE_NAME);

        if (!file.exists()) {
            file.createNewFile();
        }

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();


//        FileOutputStream outputStream = null;
//        try {
//            outputStream = new FileOutputStream(file);
//            outputStream.write(text.getBytes(StandardCharsets.UTF_8));
//        } catch (IOException ex) {
//            System.out.println("Ошибка записи");
//        } finally {
//            if (outputStream != null)
//                outputStream.close();
//        }

        try(FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(text.getBytes(StandardCharsets.UTF_8));
        } catch (IOException ex) {
            System.out.println("Ошибка записи");
        }
    }
}

// абстрактные классы, интерфейсы, Object, другие streamы
// Приложение которое читает и записывает файл

//git commit -m "Comment"
//git add
//git push origin
//git status