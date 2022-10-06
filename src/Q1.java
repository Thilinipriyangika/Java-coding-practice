import java.util.Arrays;

public class Q1 {
    public static void main(String args[]) {
        int size;
        int[] numArr = {56, 34, 23, 11};
        size = numArr.length;
        Arrays.sort(numArr);

        System.out.println("Largest number of the array is: " + numArr[size - 1]);
    }
}
