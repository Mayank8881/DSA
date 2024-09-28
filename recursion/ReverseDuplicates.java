
public class ReverseDuplicates {

    public static void findDuplicate(String str, int i, int flag, StringBuilder s1) {
        if (i == str.length()) {
            System.out.println(s1);
            return;
        }
        char c = str.charAt(i);
        for (int j = i + 1; j < str.length(); j++) {
            if (c == str.charAt(j)) {
                return;
            } else {
                s1.append(str.charAt(i));
            }
        }
        findDuplicate(str, i + 1, 0, s1);

    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        String str = "abcde";
        findDuplicate(str, 0, 0, s1);
    }
}
