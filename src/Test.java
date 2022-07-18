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

    }
}
