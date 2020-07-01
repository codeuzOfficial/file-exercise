package codeuz.lesson_3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Exercise 3 : test folder dagi file lardagi malumotlarni o'qib output.txt ga yozing

        PrintWriter printWriter = new PrintWriter("output.txt");

        File file = new File("test");

        String[] fileList = file.list();

        for (String s : fileList) {
//            File subFile = new File("test/" + s);
            File subFile = new File(file, s);
            if (subFile.isFile()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(subFile));

                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    printWriter.println(line);
                }

                bufferedReader.close();

            }
        }

        printWriter.flush();
        printWriter.close();

    }
}
