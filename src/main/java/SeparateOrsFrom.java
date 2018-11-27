import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class SeparateOrsFrom {
    public static void main(String[] args) {
        separateOrs("a+b+c|dw|x+q");
        separateOrs("");
    }

    public static List<String> separateOrs(final String input) {
        List<String> res = new ArrayList<>();

        getPermutatedString(res, input, new StringBuilder(), 0);
        System.out.println(res);
        return null;
    }

    private static void getPermutatedString(List<String> result, String inputString, StringBuilder partialString, int scanPosition) {
        int prevPlusPos = scanPosition;
        int preORPos = 0;
        StringBuilder stringBuilder = new StringBuilder(partialString);
        System.out.println(partialString);
        for (int i = scanPosition; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '+') {
                stringBuilder.append(inputString.substring(prevPlusPos, i));
                prevPlusPos = i;
            }
            if (inputString.charAt(i) == '|') {
                if (preORPos == 0) {
                    partialString = new StringBuilder(stringBuilder);
                    stringBuilder.append(inputString.substring(prevPlusPos, i));
                    preORPos = i;
                } else {
                    stringBuilder.append("+");
                    stringBuilder.append(inputString.substring(preORPos + 1, i ));
                    preORPos = i;
                }
                if (preORPos < i) {
                    String pp = inputString.substring(preORPos + 1, i);
                    stringBuilder.append(pp);
                }
                for (int j = i; j < inputString.length(); j++) {
                    if (inputString.charAt(j) == '+') {
                        scanPosition = j;
                        break;
                    }
                }
                getPermutatedString(result, inputString, stringBuilder, scanPosition);
                stringBuilder = new StringBuilder(partialString);
            }
            if (scanPosition > 0 && inputString.charAt(i - 1) == '|') {

            }
        }
        stringBuilder.append(inputString.substring(prevPlusPos, inputString.length()));
        result.add(stringBuilder.toString());
    }
}

