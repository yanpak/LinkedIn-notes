public class StringExchanger {

    static String a = "aaa";
    static String b = "bbbb";

    public static void main(String[] args) {
        //a=a.concat(b).split("\\b"+(a.substring(0,(b=a).length())))[1]; //Alright!
        a=a.concat(b).substring((b=a).length()); // My new variant is more neat )
        System.out.printf("%s %s",a,b);
    }

}