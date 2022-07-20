import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(12);
        array.add(23);
        array.add(33);
        array.add(55);
        array.add(66);
        System.out.println(array.get(2));
        array.print();
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
