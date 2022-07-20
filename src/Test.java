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

        ArrayUtil ar = new ArrayUtil();
        System.out.println(ar.minElement(new int[]{12,3,45,75,900}));
        System.out.println(ar.minElementIndex(new int[]{12,3,45,75,900}));
        System.out.println(ar.maxElement(new int[]{12,3,45,75,900}));
        System.out.println(ar.maxElementIndex(new int[]{12,3,45,75,900}));
        System.out.println(ar.sum(new int[]{12,3,45,75,900}));
        System.out.println(ar.average(new int[]{12,3,45,75,900}));
        System.out.println(ar.product(new int[]{12,3,45,75,900}));
        System.out.println(ar.productOfOddIndex(new int[]{12,3,45,75,900}));
        StringUtil ob = new StringUtil();
        System.out.println(ob.trim("   Hello  World   "));
        System.out.println(ob.getCountBySymbol("getCountBySymbol",'y'));
        System.out.println(ob.middleTwo("beautiful"));
        System.out.println(ob.endsLy("slowly"));
        System.out.println(ob.endsLy("slow"));
        System.out.println(ob.theEndOrFront("life",false));
        System.out.println(ob.hasBad("xbadxx"));
        System.out.println(ob.firstTwo("Hello"));
        System.out.println(ob.bobThere("b9xxb8bx"));
        System.out.println(ob.repeatEnd("Hello",3));
        System.out.println(ob.mixString("abc","xyz"));
        System.out.println(ob.reverse("Hello"));
    }
}
