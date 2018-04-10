import com.sun.javaws.exceptions.UnsignedAccessViolationException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Abhijeet Gulve
 */
public class Solution {

    public static void solve(int array[], int num) {
        int cont = 999999999;
        // O(n^2) apporach
        int arrayInitLength = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                array[i] = cont;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != cont) {
                list.add((int) array[i]);
            }
        }
        for (int i = 0; i < (arrayInitLength - list.size() + 1); i++) {
            list.add(0, 1);
        }
        list.stream().forEach(t->System.out.print(t + " "));

    }

    public static void main(String[] args) {
         char ch=0;
         int count=0;
         while (++ch<=255) {
             count++;
             System.out.print(count);
         }
    }


}
