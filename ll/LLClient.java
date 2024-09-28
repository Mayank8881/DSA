package ll;

// import java.lang.classfile.components.ClassPrinter;
public class LLClient {

    public static void main(String[] args) {
        LinkedListt l1 = new LinkedListt();
        l1.addLast(2);
        l1.addLast(8);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.addLast(1);
        System.out.println("yoooooo" + l1.deleteVal(5));
        // l1.addLast(4);
        // l1.addLast(3);
        // l1.addLast(2);
        // l1.addMiddle(6, 1);
        l1.display();
        // l1.deleteBeg();
        // l1.deleteLast();
        // l1.deleteMid(0);
        // l1.reverse();
        System.out.println();
        // l1.display();
        // System.out.println(l1.palindrom());
        // System.out.println(l1.Cycle());
        l1.breaklist();
        l1.display();

    }

}
