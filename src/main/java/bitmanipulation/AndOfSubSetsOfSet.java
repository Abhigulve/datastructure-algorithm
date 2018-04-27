package bitmanipulation;

/**
 * @author Abhijeet Gulve
 */
public class AndOfSubSetsOfSet {

    public static void main(String[] args) {
        //System.out.println(010);
        findSubsets(new int[]{1, 2,3});
    }

    private static void findSubsets(int array[]) {
        int numOfSubsets = 1 << array.length;
        int a = 0;
        for (int i = 0; i < numOfSubsets; i++) {
            int pos = array.length - 1;
            int bitmask = i;
            int temp = 0;
            int count = 0;
            while (bitmask > 0) {
                if ((bitmask & 1) == 1) {
                    if (count == 0) {
                        temp = array[pos];
                    } else
                        temp = array[pos] | temp;
                    count++;
                }
                //this will shift this number to left so one bit will be remove
                bitmask >>= 1;
                pos--;
            }
            count = 0;
            a += temp;
            temp = 0;
        }
        System.out.println(a);
    }
}
