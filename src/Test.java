import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileUtil file = new FileUtil();
        file.createFolder("test1");
        file.createFile("testFile1");
        file.writeToFile("C:\\Users\\Public\\HomeWork\\src\\testFile1","Hello world",true);
        file.txtContent("C:\\Users\\Public\\HomeWork\\src\\testFile1");
        try {
            file.copyTo("C:\\Users\\Public\\HomeWork\\src\\testFile1","C:\\Users\\Public\\HomeWork\\src\\testFile2");
        } catch (IOException e) {
            System.out.println("File is already copy");
        }

    }
}
