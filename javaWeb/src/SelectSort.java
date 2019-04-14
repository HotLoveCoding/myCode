import java.util.Arrays;

/**
 * @author shkstart
 * @create 2019-04-12 20:42
 */
public class SelectSort {
    public static void main(String[] args){

        int[] arr = {12,32,22,14,35,7,9,10};

        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectSort(int[] arr) {
        int minIndex, temp;

        for(int i = 0; i < arr.length - 1; i++) {
            minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[minIndex]) {
                   minIndex = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
