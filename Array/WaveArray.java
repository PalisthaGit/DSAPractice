//Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
//In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
//
//If there are multiple solutions, find the lexicographically smallest one.

//Example 1:
//
//Input:
//n = 5
//arr[] = {1,2,3,4,5}
//Output: 2 1 4 3 5
//Explanation: Array elements after 
//sorting it in wave form are 
//2 1 4 3 5.
//Example 2:
//
//Input:
//n = 6
//arr[] = {2,4,7,8,9,10}
//Output: 4 2 8 7 10 9
//Explanation: Array elements after 
//sorting it in wave form are 
//4 2 8 7 10 9.

// Question Link : https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1/?page=1&difficulty[]=0&category[]=Arrays&curated[]=8&sortBy=submissions#

public class WaveArray {

    public static void convertToWave(int n, int[] a) {

        for (int i = 0; i <= a.length - 2; i += 2) {

            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
            
        }
    }

    public static void main(String[] args) {
        
        int array[] = {1,2,3,4,5};
        convertToWave(5, array);
        for(int i =0; i<=array.length-1; i++) {
            System.out.println(array[i]);
        }
    }

}
