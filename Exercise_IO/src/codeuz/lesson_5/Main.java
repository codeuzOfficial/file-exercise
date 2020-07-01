package codeuz.lesson_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Exercise 5 : test folderdagi fayl va folderlar daraxtini tuzing va uni  result.txt ga yozing.

        PrintWriter printWriter = new PrintWriter("result.txt");

        makeTree(new File("test"), 0, printWriter);

        printWriter.flush();
        printWriter.close();
    }

    private static void makeTree(File parent, int space, PrintWriter printWriter) {
        String[] list = parent.list();

        for (String s : list) {

            for (int i = 0; i < space; i++) {
                System.out.print("  ");
                printWriter.print("  ");
            }

            System.out.println(s);
            printWriter.println(s);

            File subFile = new File(parent, s);
            if (subFile.isDirectory()) {
                makeTree(subFile, space + 1, printWriter);
            }
        }

    }
}
