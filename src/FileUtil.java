import java.io.*;

public class FileUtil {
    public boolean createFolder(final String path) {
//        try {
//            Path path1 = Paths.get(path);
//            Files.createDirectories(path1);
//            System.out.println("Directory is created!");
//        } catch (IOException e) {
//            System.out.println("Failed to create directory!" + e.getMessage());
//        }
        String path1 = "C:\\Users\\Public\\HomeWork\\src";
        File file = new File(path1, path);
        if (file.mkdirs())
            System.out.println("Directory is created");
        else System.out.println("Directory already exist");
        return false;
    }


    public boolean createFile(String filePath) {
        String path = "C:\\Users\\Public\\HomeWork\\src";
        File file = new File(path, filePath);
        try {
            if (file.createNewFile())
                System.out.println("File created");
            else System.out.println("File already exist");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    //if append true, text appended
    public boolean writeToFile(String filePath, String text, boolean append) {
        try {
            PrintWriter printWriter = new PrintWriter(filePath);
            printWriter.println(text);
            System.out.println("text appended");
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//            try (OutputStream outputStream2 = new FileOutputStream(filePath, append)) {
//            outputStream2.write(text.getBytes(StandardCharsets.UTF_8));
//            return true;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            FileWriter fileWriter = new FileWriter(filePath);
//            if(append){
//                fileWriter.write(text);
//                System.out.println("text appended");
//                fileWriter.close();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        return false;
    }

    //return all child files
    public File[] content(String path) {
        return null;
    }

    // copy source file to new path
    public boolean copyTo(String sourcePath, String toPath) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(sourcePath);
            fos = new FileOutputStream(toPath);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            System.out.println("copied the file successfully");
        } finally {
            if (fis != null)
                fis.close();
            if (fos != null)
                fos.close();
        }
//            File file1 = new File(sourcePath);
//            File file2 = new File(toPath);
//
//            Files.copy(file1.toPath(),file2.toPath());


        return true;
    }

    //վերադարձնել տվյալ հասցեով ֆայլի միջի պարունակությունը
    public String txtContent(String path) {
        BufferedReader bw = null;
        String test;
        try{
            bw = new BufferedReader(new FileReader("C:\\Users\\Public\\study\\src\\fileUtil\\testFile1"));
            while ((test = bw.readLine()) != null)
                System.out.println(test);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }return test;
//        int x = 0;
//        try {
//            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Public\\study\\src\\fileUtil\\testFile1");
//            while ((x = fileInputStream.read()) != -1)
//                System.out.print((char) x);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return null;

//        String content = null;
//        try {
//            byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\Public\\study\\src\\fileUtil\\testFile1"));
//            content = new String(bytes);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return content;
    }
}
