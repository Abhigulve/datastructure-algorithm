/**
 * @author Abhijeet Gulve
 */
package tree;

import java.util.ArrayList;

public class Allpaths {

    void getAllPaths(ArrayList<ArrayList<Integer>> list, int sum, TreeNode head, ArrayList<Integer> temp) {
        if (head == null) {
            return;
        }
        sum = sum - head.val;
        temp.add(head.val);
        if (sum == 0 && head.left == null && head.right == null) {
            list.add(new ArrayList<>(temp));
        }
        if (head.left != null) {
            getAllPaths(list, sum, head.left, temp);
        }
        if (head.right != null) {
            getAllPaths(list, sum, head.right, temp);
        }
        temp.remove(temp.size() - 1);

    }


    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        getAllPaths(list, B, A, temp);
        return list;
    }
}


