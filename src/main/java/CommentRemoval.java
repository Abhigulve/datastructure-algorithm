import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class CommentRemoval {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("/* trtuireuy", "bghjsdgshjudf */ ", "test");
        System.out.println(removeComment(new LinkedList(strings)));
    }

    static LinkedList<String> removeComment(LinkedList<String> lines) {
        List<Integer> index = new ArrayList<>();
        boolean multiLineComment = false;
        for (int i = 0; i < lines.size(); i++) {

            if (lines.get(i).contains("/*") || multiLineComment) {
                multiLineComment = true;
                if (lines.get(i).contains("*/"))
                    multiLineComment = false;
                index.add(i);
            }
        }
        int count = 0;
        for (int i = 0; i < index.size(); i++) {
            lines.remove(i + count);
            count++;
        }
        return lines;
    }

}
