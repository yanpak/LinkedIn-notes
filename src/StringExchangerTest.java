public class StringExchangerTest {

    static String a, b;

    public static void main(String[] arg) {

        long m_start = Runtime.getRuntime().freeMemory();
        long t_start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            a = String.valueOf(i);
            b = String.valueOf(i + 10);

            //b = (a+b).replaceAll((a=b), ""); //- this variant was suggested by group's discussant
            //a = a.concat(b).substring((b=a).length()); //- this is my other variant for exchanging
            a = new String[]{b, b=a}[0]; // - this variant is invented by me and totally awesome!
        }

        System.out.println("required memory is "+(m_start - Runtime.getRuntime().freeMemory())+" bytes");
        System.out.println("required time is "+ (System.currentTimeMillis()-t_start)+ " ms");
    }
}

