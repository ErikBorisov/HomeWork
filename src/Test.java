public class Test {
    public static void main(String[] args) {
        ArrayUtil ar = new ArrayUtil();
        System.out.println(ar.minElement(new int[]{12,3,45,75,900}));
        System.out.println(ar.minElementIndex(new int[]{12,3,45,75,900}));
        System.out.println(ar.maxElement(new int[]{12,3,45,75,900}));
        System.out.println(ar.maxElementIndex(new int[]{12,3,45,75,900}));
        System.out.println(ar.sum(new int[]{12,3,45,75,900}));
        System.out.println(ar.average(new int[]{12,3,45,75,900}));
        System.out.println(ar.product(new int[]{12,3,45,75,900}));
        System.out.println(ar.productOfOddIndex(new int[]{12,3,45,75,900}));
    }
}
