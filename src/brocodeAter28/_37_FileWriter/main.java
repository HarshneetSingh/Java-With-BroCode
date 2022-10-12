package brocodeAter28._37_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("DIARY.txt");
        fileWriter.write("hello im harshneet singh ");
        fileWriter.append(".sup?");
        fileWriter.close();

    }
}
