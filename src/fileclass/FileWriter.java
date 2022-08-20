package fileclass;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args)throws IOException  {
        java.io.FileWriter fileWriter =new java.io.FileWriter("C:\\Users\\priyanka\\Documents\\notepad\\New Text Document.txt ") ;
        fileWriter .write("mechanical engineer");
        fileWriter .close() ;
    }
}
