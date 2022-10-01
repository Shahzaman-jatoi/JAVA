import java.util.Arrays;

public class swapping {
    public static void main(String[] args) {

        int[] arr = {99, 25, 66, 77, 89, 46, 21};
        swap(arr, 0, 6);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] array, int i1, int i2){

        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }
}
