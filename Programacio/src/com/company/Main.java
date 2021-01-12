package com.company;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws Exception{

        File myFile = new File("file.txt");
        readFile(myFile);

    }

    public static void readFile(File file) throws IOException {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }


}
