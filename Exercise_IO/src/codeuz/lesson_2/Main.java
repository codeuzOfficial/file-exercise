package codeuz.lesson_2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Exercise 2: a.txt va b.txt   dan malumotlar bitta  qatordan o'qib olinsin va c.txt ga yozilsin.
        // shu jarayot a va b fayllar tugagunigacha davom etsin.


        // c.txt
        PrintWriter printWriter = new PrintWriter("test/c.txt");
//        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("test/c.txt", true)));

        // a/b
        BufferedReader bufferedReader_a = new BufferedReader(new FileReader("test/a.txt"));
        BufferedReader bufferedReader_b = new BufferedReader(new FileReader("test/b.txt"));


        String lineA = bufferedReader_a.readLine();
        String lineB = bufferedReader_b.readLine();

        while (lineA != null || lineB != null) {

            if (lineA != null) {
                printWriter.println(lineA);
                lineA = bufferedReader_a.readLine();
            }

            if (lineB != null) {
                printWriter.println(lineB);
                lineB = bufferedReader_b.readLine();
            }
        }


        printWriter.flush();
        printWriter.close();

        bufferedReader_a.close();
        bufferedReader_b.close();

    }
}
