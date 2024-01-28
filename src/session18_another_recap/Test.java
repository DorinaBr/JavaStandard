package session18_another_recap;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        String inputString = getBufferReader();
        int count = getWordCount(inputString);
        System.out.println(count);
        String result = "" + count;
        writeTextToFile(result);
    }

    private static void writeTextToFile(String count) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("NewFile.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter.write(count);
            System.out.println("Success!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int getWordCount(String str) {
        return str.split(" ").length;
    }

    private static String getBufferReader() {
        File file = new File(
                "C:\\Users\\Dorina\\IdeaProjects\\itschool\\src\\session18_another_recap\\Text.txt");

        BufferedReader br
                = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String st;
        StringBuilder whatever = new StringBuilder();
        while (true) {
            try {
                if ((st = br.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            whatever.append(st);
        }
        return whatever.toString();
    }
}
