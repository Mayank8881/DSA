
import java.util.*;

public class sample {

    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int data = list.remove(list.size() - 1);
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        sample s = new sample();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
    }

}
