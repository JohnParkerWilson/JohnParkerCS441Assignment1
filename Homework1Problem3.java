import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};

        System.out.println(MedianOfTwoSortedArrays(nums1, nums2));

    }

    public static double MedianOfTwoSortedArrays (int [] array1, int [] array2) {
        //len1 is the smaller array, len2 is the larger
        int len1 = 0, len2 = 0;

        if (array1.length <= array2.length) {
            len1 = array1.length;
            len2 = array2.length;
        }
        else {
            len2 = array1.length;
            len1 = array2.length;
        }

        int min = 0;
        int max = len1;
        //Get medians of both arrays
        while (min <= max) {
            //Cut the arrays get new mid
            int mid1 = (min + max) / 2;
            int mid2 = (len1 + len2 + 1) / 2 - mid1;

            //Get the min and max of each array
            int min1 = (mid1 == 0) ? Integer.MIN_VALUE : array1[mid1-1];
            int max1 = (mid1 == len1) ? Integer.MAX_VALUE : array1[mid1];
            int min2 = (mid2 == 0) ? Integer.MIN_VALUE : array2[mid2-1];
            int max2 = (mid2 == len2) ? Integer.MAX_VALUE : array2[mid2];

            if(min1 <= max2 && min2 <= max1) {
                //if odd length
                if ((len1+len2) % 2 == 1) {
                    return (double)Math.max(min1, min2);
                }
                //even length
                else {
                    return ((double)Math.max(min1,min2) + (double)Math.min(max1,max2))/2;
                }
            }
            else if (min1 > max2) { //if no median found, cut again
                max = mid1 - 1;
            }
            else {
                min = mid1 + 1;
            }
        }

        return 0;
    }

}
