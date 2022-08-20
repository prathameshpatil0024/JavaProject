package fileclass;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\priyanka\\Documents\\notepad\\New Text Document.txt ");
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.toURI());
        System.out.println(file.canWrite());
    }

}

