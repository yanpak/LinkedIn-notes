public class StringExchanger {

    static String a = "aaa";
    static String b = "bbbbaaa";

    public static void main(String[] args) {
        a=a.concat(b).split("\\b"+(a.substring(0,(b=a).length())))[1]; //Alright!
        System.out.printf("%s %s",a,b);
    }

}