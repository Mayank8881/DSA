import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder build=new StringBuilder();
        for(int i=0;i<26;i++){
            char c=(char)('a'+i);
            build.append(c);

        }
        System.out.println(build);
        build.reverse();
        System.out.println(build);
        String s="mayank";
        System.out.println(Arrays.toString(s.toCharArray()));
    }

}
