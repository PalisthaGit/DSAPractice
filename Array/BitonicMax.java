
public class BitonicMax {

    static int findMaximum(int arr[], int n) {
        // code here
        int low = 0;
        int high = n - 1;
        int maximum = 0;
        while (low <= high) {

            // find mid value
            int mid = low + (high - low) / 2;
            if (mid > 0 && mid < n - 1) {
                if ((arr[mid] > arr[mid + 1]) && arr[mid] > arr[mid - 1]) {

                    maximum = mid;
                    return maximum;
                }

                else if (arr[mid] < arr[mid - 1]) {
                    high = mid - 1;

                } else {
                    low = mid + 1;
                }
            }

            else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return 0;

                } else {
                    return 1;
                }
            }

            else if (mid == high) {
                if (arr[n - 1] > arr[n - 2]) {
                    return n - 1;
                } else {
                    return n - 2;
                }
            }

        }

        return 0;

    }

    public static void main(String[] args) {
        int n = 9;
        int arr[] = { 1, 15, 25, 45, 42, 21, 17, 12, 11 };
        
       int num = findMaximum(arr, n);
        System.out.println(arr[num]);

    }

}


// Time complexity - O(log(n))