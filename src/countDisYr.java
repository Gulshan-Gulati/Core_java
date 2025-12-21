import java.util.*;
import java.util.regex.*;
public class countDisYr {
    public static void main(String[] args) {
        String data = "UN was established on 24-10-1945. India got freedom on 15-08-1949.";
        Pattern pattern = Pattern.compile("\\b\\d{2}-\\d{2}-(\\d{4})\\b");
        Matcher matcher = pattern.matcher(data);

        HashSet<Integer> set = new HashSet<>();

        while(matcher.find()){
            set.add(Integer.parseInt(matcher.group(1)));
        }
        System.out.println(set.size());
    }
}
