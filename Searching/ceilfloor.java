public class ceilfloor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int low=0;
      int high=a.length-1;
      int floor=-1;
      int ceil=-1;
      while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] <= x) {
                floor = a[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
      }
      low=0;
      high=a.length-1;
      while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] >= x) {
                ceil = a[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
      }

        int arr[]=new int[2];
        arr[0]=floor;
        arr[1]=ceil;
        return arr;
    }
    
}
