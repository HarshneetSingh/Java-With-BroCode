package brocodeAter28._38_fileReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("C:\\Users\\harsh\\OneDrive\\Desktop\\StudyDiary.txt");
        int data=fileReader.read();

        while(data!=-1){
            System.out.print((char) data );
            data=fileReader.read();
        }
        fileReader.close();
    }
}
