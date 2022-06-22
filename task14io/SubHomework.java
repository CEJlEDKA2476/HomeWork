package com.company.task14io;

import java.io.*;

public class SubHomework {
    protected void read(File file) {
        String s;
        System.out.println("Содержание файла:");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка записи" + ex);
        }
    }

    protected void write(File file) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Окончание записи - 'stop'");

        try (FileWriter fw = new FileWriter(file)) {
            do {
                System.out.println("*Запись*");
                str = br.readLine();

                if (str.compareTo("stop") == 0) {
                    break;
                }
                str = str + "\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException ex) {
            System.out.println("Ошибка записи" + ex);
        }
    }
}
