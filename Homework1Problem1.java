import java.io.*;
import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int arraySize = 4;
        int nums[] = {2, 7, 11, 15};
        int target = 26;
        int results[] = {-1, -1};
        boolean foundTarget = false;

        //Iterate here
        for (int i = 0; i < arraySize; i++) {
            for(int j = 0; j < arraySize; j++){
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                    foundTarget = true;
                }
            }
        }

        if (foundTarget)
            System.out.println(Arrays.toString(results));
        else
            System.out.println("No result");

    }
}
