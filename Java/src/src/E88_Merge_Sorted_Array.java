package src;

/**
88. Merge Sorted Array

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

 

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
 

Constraints:
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[i] <= 109
 */

public class E88_Merge_Sorted_Array {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m-1;
        int i2 = n-1;
        
        for (int i=m+n-1; i>=0; i--) {
            if (i1 < 0) {
                nums1[i] = nums2[i2];
                i2--;
            }
            else if (i2 < 0) {
                nums1[i] = nums1[i1];
                i1--;
            }
            else if (nums1[i1] >= nums2[i2]) {
                nums1[i] = nums1[i1];
                i1--;
            }
            else {
                nums1[i] = nums2[i2];
                i2--;
            }
        }
    }
	
    public static void main(String[] args) {

	}
}
