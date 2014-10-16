import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingWordsUsingGiorgioSuggestion {
    static String input = "Red lorry, yellow lorry, red lorry, yellow lorry";

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        input = input.toLowerCase();
        int countOfDifferWords = 0;
        Pattern pat = Pattern.compile("\\w+");
        Matcher mat = pat.matcher(input);
        String curr = input;
        while (mat.find()) {
            countOfDifferWords++;
            System.out.print(mat.group() + " = ");
            String tmp = curr;
            int occurrences;
            // Below goes Giorgio suggestion with some my changes
            if ((occurrences = (curr.length() - (tmp = curr.replaceAll("\\b"+mat.group()+"\\b","")).length()) / mat.group().length()) > 0) {
                System.out.println(occurrences);
                mat = pat.matcher(curr = tmp);
            }
        }
        long alltime = System.currentTimeMillis()-start;
        System.out.println("\ncount of different words is "+countOfDifferWords);
        System.out.println("execution time: ~"+alltime+" ms");
    }
}
