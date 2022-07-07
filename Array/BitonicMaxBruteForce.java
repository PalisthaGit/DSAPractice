
public class BitonicMaxBruteForce {

   static int findMaximum(int arr[], int n) {
	    // code here
	    int maximum = 0;
	    if(arr[n - 1] > arr[n - 2]) {
	        maximum = arr[n-1];
	        return maximum;
	    }
	    for(int i = 0; i <= n-2; i++) {
	        if(arr[i]> arr[i+1]) {
	            maximum = arr[i];
	            break;
	        }
	    }
	    return maximum;
	    
	}

    public static void main(String[] args) {
        int n = 9;
        int arr[] = { 1, 15, 25, 45, 42, 21, 17, 12, 11 };
        
       int num = findMaximum(arr, n);
        System.out.println(num);

    }

}

// Time Complexity: O(n)