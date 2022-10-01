import java.util.Arrays;

public class ArrayTwoSum {

    public static void main(String[] args) {
       int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int target = 15;
        System.out.println(Arrays.toString(TwoSum(num, target)));
    }
    public static int[] TwoSum(int[] num , int target){

        int[] result = new int[2];

        for (int i = 0; i < num.length; i++)
        {
            for (int j = i+1; j < num.length; j++)
            {
                if(num[i] + num[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
