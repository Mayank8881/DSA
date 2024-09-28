
import java.util.*;

public class multiArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int k = 0; k < 3; k++) {
            list.add(new ArrayList<>());

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        //////////////////////////////////
        // System.out.println("Mayank "+list+new Integer(66));
        System.out.println(list);
    }
}
