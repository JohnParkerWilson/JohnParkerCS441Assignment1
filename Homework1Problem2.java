import java.io.*;
import java.util.Arrays;

class FirstAndLast {
    public static void main(String[] args) {
        int arraySize = 6;
        int nums[] = {5,7,7,8,8,8,8,10};
        int target = 8;
        int results[] = {-1,-1};

        results[0] = findFirst(nums, target);
        results[1] = findLast(nums, target);

        System.out.println(results[0]);
        System.out.println(results[1]);

    }

    public static int findFirst (int nums[], int target) {
        int result = -1;
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int mid = (first + last)/2;
            if (nums[mid] == target)
                result = mid;
            if (nums[mid] >= target)
                last = mid - 1;
            else
                first = mid + 1;
        }

        return result;
    }

    public static int findLast (int nums[], int target) {
        int result = -1;
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int mid = (first + last)/2;
            if (nums[mid] == target)
                result = mid;
            if (nums[mid] <= target)
                first = mid + 1;
            else
                last = mid - 1;
        }

        return result;
    }
}
