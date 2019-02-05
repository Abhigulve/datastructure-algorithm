package sorting;

/**
 * @author Abhijeet Gulve
 */
public class QuickSort {

    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 3, 7, 2};
        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] quickSort(int[] arr) {
        quickSort1(arr, 0, arr.length - 1);
        return arr;
    }

    static void quickSort1(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = (left + right) / 2;
        int start = 0, end = right;
        while (start <= end) {
            if (arr[pivot] < arr[start]) {
                if (arr[end] < arr[pivot]) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
        quickSort1(arr, left, start-1);
        quickSort1(arr, start, right);
    }

}
