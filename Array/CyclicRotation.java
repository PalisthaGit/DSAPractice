// Given an array, rotate the array by one position in clock-wise direction.
 

// Example 1:

// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 5 1 2 3 4
 

// Example 2:

// Input:
// N = 8
// A[] = {9, 8, 7, 6, 4, 2, 1, 3}
// Output:
// 3 9 8 7 6 4 2 1

public class CyclicRotation {
    public static void rotate(int arr[], int n)
    {
        int lastValue = arr[arr.length-1];
        for(int i = arr.length-1; i >0; i-- ) {
            arr[i]= arr[i-1];
        }
        arr[0] = lastValue;
        for(int i = 0; i <= arr.length-1 ; i++ ) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        rotate(array, array.length-1);

    }
    
}
