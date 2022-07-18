public class Test {
    public static void main(String[] args) {
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
