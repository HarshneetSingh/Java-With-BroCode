package brocodeAter28._36_fileClass;

import java.io.File;

public class Main {
//    file = an abstract representation of file and directory path names
    public static void main(String[] args) {
        File file =new File("hello.txt");

        if (file.exists()){
            System.out.println("file Exists");
            System.out.println(file.isFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            file.delete();
        }else {
            System.out.println("file does not exists");
        }
    }
}
