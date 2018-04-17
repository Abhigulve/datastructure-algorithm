/**
 * @author Abhijeet Gulve
 */
public class Permutations {
    public static void main(String[] args) {
        permutation("abc", 0, 2);
    }

    public static void permutation(String str, int l, int r) {

        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }

    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
