public class StringExchanger {

    static String a = "aaa";
    static String b = "bbbb";

    public static void main(String[] args) {
        a=a.concat(b).split(a.substring(0,(b=a).length()))[1]; //Alright!
        System.out.printf("%s %s",a,b);
    }

}