package codeuz.lesson_1;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Exercise 1:  a.txt va b.txt dagi malumotlarni c.txt ga ko'chirib yozing.


        // c.txt
        PrintWriter printWriter = new PrintWriter(new FileWriter("test/c.txt", true));

        //  a.txt
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("test/a.txt"));
//        String line; // = bufferedReader.readLine();
//        while ((line = bufferedReader.readLine()) != null) {
//            printWriter.println(line);
//        }
//        bufferedReader.close();

        writeToFile("test/a.txt", printWriter);
        writeToFile("test/b.txt", printWriter);


        printWriter.flush();
        printWriter.close();
    }


    private static void writeToFile(String fileName, PrintWriter printWriter) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            printWriter.println(line);
        }

        bufferedReader.close();
    }

}
