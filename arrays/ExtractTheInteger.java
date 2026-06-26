package arrays;

import java.util.ArrayList;

public class ExtractTheInteger {

    static ArrayList<String> extractIntergerWords(String s) {

        ArrayList<String> result = new ArrayList<>();
        StringBuilder num = new StringBuilder();

        for (char ch : s.toCharArray()) {
            System.out.println("char :" + ch);
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() > 0) {
                    result.add(num.toString());
                    num.setLength(0);
                }
            }

        }

        if (num.length() > 0) {
            result.add(num.toString());
        }

        if (result.isEmpty()) {
            result.add("No integers");
        }
        return result;
    }

    public static void main(String[] args) {

        String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";
        ArrayList<String> result = extractIntergerWords(s);
        System.out.println(result);

    }
}
