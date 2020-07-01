package codeuz.lesson_4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        // Exercise 4: a.txt fayldan b.txt da bor bo'lgan qatorlatni o'chiring.


        // b.txt
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test/b.txt"));

        String line;
        Set<String> containerSet = new HashSet<>();

        while ((line = bufferedReader.readLine()) != null) {
            containerSet.add(line);
        }
        bufferedReader.close();

        //a.txt
        File file = new File("test/a.txt");

        Set<String> resultSet = new HashSet<>();
        bufferedReader = new BufferedReader(new FileReader(file));

        while ((line = bufferedReader.readLine()) != null) {
            if (!containerSet.contains(line)) {
                resultSet.add(line);
            }
        }

        bufferedReader.close();


        PrintWriter printWriter = new PrintWriter(file);
        for (String s : resultSet) {
            printWriter.println(s);
        }

        printWriter.flush();
        printWriter.close();

    }
}
