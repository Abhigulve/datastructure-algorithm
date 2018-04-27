package bitmanipulation;

/**
 * @author Abhijeet Gulve
 */
public class SubsetsOfSet {
    public static void main(String[] args) {
        findSubsets(new int[]{1, 2});
    }

    private static void findSubsets(int array[]) {
        int numOfSubsets = 1 << array.length;
        for (int i = 0; i < numOfSubsets; ++i) {
            int pos = array.length - 1;
            int bitmask = i;
            while (bitmask > 0) {
                if ((bitmask & 1) == 1) {
                    System.out.print(array[pos] + " ");
                }
                //this will shift this number to left so one bit will be remove
                bitmask >>= 1;
                pos--;
            }if(i!=0)
            System.out.println();
        }

    }
}
