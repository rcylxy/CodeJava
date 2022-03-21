package FileTest;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\homework\\java.txt");
        f1.createNewFile();
    }
}
