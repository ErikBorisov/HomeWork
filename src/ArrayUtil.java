public class ArrayUtil {
    public int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }


    public int maxElementIndex(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    //            վերադարձնել փոքրագույն  էլեմենտի ինդեքսը
    public int minElementIndex(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    //            գտնել մեծագույն էլէմենտը և վերադարձնել
    public int maxElement(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    //            հաշվել տրված մասիվի էլեմենտների գումարը և  վերադարձննել
    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //            վերադարձնել տրված զանգվածի էլեմենտների գումարի միջինը
    public int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    //            վերադարձնել տրված զագվածի դրական էլեմենտների արտադրյալը
    public int product(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                product *= arr[i];
        }
        return product;
    }

    //          վերադարձնել կենտ ինդեքս ունեցող էլեմենտների արտադրյալը
    public int productOfOddIndex(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1)
                product *= arr[i];
        }
        return product;
    }
}
