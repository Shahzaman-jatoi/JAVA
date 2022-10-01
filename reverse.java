import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {12, 25, 99, 32, 12, 40};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] array, int i1, int i2 )
    {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    static void rev(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }


}
