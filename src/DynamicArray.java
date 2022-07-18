public class DynamicArray {
    // սա մասիվն է, որը միայն ներքին օգտագործման համար է, և որը հետո extend մեթոդի մեջ մեծանալու է
    private int[] array = new int[5];
    //սա մասիվի մեջի էլեմենտների քանակն է․ սկզբից 0 է, հետո ամեն անգամ երբ կանչենք add մեթոդը, պիտի size-ը մեծանա մեկով
    private int size = 0;


    //այս մեթոդը նախատեսված է մասիվի մեջ ավելացնել ընդունող value-ն; ամեն անգամ ավելացնելուց առաջ պետք է ստուգել
    //արդյոք մասիվի մեջ տեղ կա թե ոչ? եթե չկա, կանչել extend մեթոդը
    public void add(int element) {
        if (size > array.length - 1) {
            extend();
        }
        array[size] = element;
        size++;
    }


    //այս մեթոդի նպատակն է ստեղծել նոր մասիվ, որը կլինի array-ի նախքին չափս + 4 էլեմենտանի, հետո ցիկլով կազմակերպել
    //հին մասիվի էլեմենտների վերագրումը նոր մասիվին, և վերջում հին մասիվին վերագրել նոր մասիվը։
    private void extend() {
        int[] newArray = new int[array.length + 4];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
//        Arrays.copyOf(array, array.length + 4);
        array = newArray;
    }


    //Այս մեթոդը վերադարձնում է մասիվի -iրդ էլեմենտը
    public int get(int i) {
        if (i < 0 || i >= size) {
            System.out.println("bad i value");
            return 0;
        }
        return array[i];
    }

    // սա ուղղակի տպում է array մասիվի էլեմենտները։
    public void print() {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");


        }
    }
}
