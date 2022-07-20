public class StringUtil {
    //Տրված տեքստից Ջնջում ենք սկզբի և վերջի բացատները(պռաբելները) և արդյունքը վերադարձնում ենք
    public String trim(String text) {
        while (text.startsWith(" ")){
            text = text.substring(1);

        }
        while (text.endsWith(" ")){
            text = text.substring(0,text.length()-1);

        }
        return text;
    }


    //chilyanavetis@gmail.com
    //Վերադարձնում ենք տրված տեքստի մեջ տրված սինվոլի քանակը․
    public int getCountBySymbol(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol)
                count++;



        }
        return count;
    }

    //Վերադարձնում է մեջտեղի 2 տառերը
    public String middleTwo(String str) {
        return str.substring(str.length()/2 -1,str.length()/2 + 1);
    }

    //Վերադարձնում է true եթե տրված տեքստը վերջանում է ly-ով, հակառակ դեպքում false
    public boolean endsLy(String str) {
        if (str.endsWith("ly"))
            return true;
        return false;
    }

    //Եթե front-փոփոխականը տանք true կվերադարձնի տրված str-ի առաջին տառը, հակառակ դեպքում վերջինը։
    public String theEndOrFront(String str, boolean front) {
        if (front == true)
            return str.substring(0,1);
        return str.substring(str.length()-1,str.length());
    }

    //վերադարձնում է true, եթե տրված տեքստը սկսվում է bad բառով,
    // կամ 2րդ տառից սկսած է պարունակում bad բառը։ օր․ xbadxx -> true, xxbadxx -> false
    public boolean hasBad(String str) {
        if (str.length() < 3)
            return false;
        else if (str.substring(0,3).equals("bad"))
            return true;
        else if (str.length() > 3)
            if (str.substring(1,4).equals("bad"))
                return true;
        return false;
    }

    //Վերադարձնում է առաջին 2 տառերը։ օր․ Hello-> He
    public String firstTwo(String str) {
        return str.substring(0,2);
    }

    //Հետաքրքիր է ։Ճ
    //Վերադարձնում է true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
    //օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;

        }
        return false;
    }

    //Վերադարձնում է տրված տեքստի վերջին n քանակի սինվոլները n անգամ
    //օր․ ("Hello", 3) → "llollollo", ("Hello", 2) → "lolo", ("Hello", 1) → "o"
    public String repeatEnd(String str, int n) {
        String word = "";
        for(int i =  0;i < n ;i++){
            word += str.substring(str.length() -n,str.length());
        }
        return word;
    }

    //Վերադարձնում է 2 ընդունող տեքստերի խառնուրդը))
    //օր․ ("abc", "xyz") → "axbycz",    ("Hi", "There") → "HTihere", ("xxxx", "There") → "xTxhxexre"
    public String mixString(String a, String b) {
        String word = "";
        for (int i = 0; i < a.length(); i++) {
            if (i<= a.length())
                word += a.substring(i,i+1);
            if (i <= b.length())
                word += b.substring(i,i+1);



        }

        return word;

    }
    //Վերադարձնում ենք տրված տեքստի revers եղած տարբերակը․
    public String reverse(String str){
        String a = "";
        for (int i = str.length()-1; i >= 0; --i) {
            a += str.charAt(i);

        }

        return  a;
    }
}

