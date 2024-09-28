
public class Tiles {

    static int count = 0;

    public static void findTiles(int floorb) {
        if (floorb == 0) {
            count++;
            return;
        }
        if (floorb < 0) {
            return;
        }
        //vertically plot
        findTiles(floorb - 1);

        //horizontally plot
        findTiles(floorb - 2);

    }

    public static void main(String[] args) {
        findTiles(3);
        System.out.println(count);
    }
}
