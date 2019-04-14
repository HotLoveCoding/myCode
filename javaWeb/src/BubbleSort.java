import java.util.Arrays;

/**
 * @author shkstart
 * @create 2019-04-12 20:10
 */
public class BubbleSort {

    public static void main(String[] arg) {

        int[] arr = {12,6,8,10,14,22,35,19};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {

        int temp;

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
