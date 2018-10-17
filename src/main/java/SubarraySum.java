import java.util.Arrays;

class SubarraySum {


    static void subArraySum(int arr[], int sum) {

        Arrays.sort(arr);
        int i = 0;
        int j = i + 1;
        int currentSum = arr[i];
        while (j < arr.length) {
            if (arr[i] == sum) {
                System.out.println(arr[i]);
                break;
            }
            if (currentSum < sum) {
                currentSum += arr[j];
                j++;
            }
            if (sum < currentSum) {
                i++;
                j++;
            }
        }

    }

    int subArraySum(int arr[], int n, int sum) {
        int curr_sum = arr[0], start = 0, i;


        for (i = 1; i <= n; i++) {
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];

        }

        System.out.println("No subarray found");
        return 0;
    }

    /*
     static int smallestSubWithSum(int arr[], int x) {
         // Initialize current sum and minimum length
         int n = arr.length;
         int curr_sum = 0, min_len = n + 1;

         int start = 0, end = 0;
         while (end < n) {

             while (curr_sum <= x && end < n)
                 curr_sum += arr[end++];

             while (curr_sum > x && start < n) {
                 if (end - start < min_len)
                     min_len = end - start;
                 curr_sum -= arr[start++];
             }
         }
         return min_len;
     }
 */
    public static void main(String[] args) {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = {10, 0, -1, 20, 25, 30};
        int sum = 29;
        System.out.println(arraysum.subArraySum(arr, arr.length, sum));

    }
}