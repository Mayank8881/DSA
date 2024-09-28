
public class Duplicate {

    public static void findDuplicate(StringBuilder str, int i) {
        int k = i + 1;
        if (i == str.length()) {
            System.out.println(str);
            return;
        }
        char c = str.charAt(i);
        char d = str.charAt(k);
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(j) == c) {
                str.deleteCharAt(j);
            }
        }
        findDuplicate(str, i + 1);

    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("oooooooooooooooooooooonnnnnnnnnnnnneeeeeeeeeeeeettttttttttaaaaaaaaaaaallllll");
        findDuplicate(s1, 0);
    }
}
