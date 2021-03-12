 /* Java program for Merge Sort */
package merge;
/**
 * 
 * @author Phan Thai
 */

public class Merge 
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void mergeSort(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            mergeSort(arr, l, m, r);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 25, 30, 45, 6, 11, 90, 1,2,3, 3,};
             /**5, 5, 2, 6, 7, 8, 9, 33, 33, 22, 11, 22,
            21, 34, 54, 65, 76, 77, 78, 12, 15, 13, 14, 111, 113, 115, 120, 66, 79, 24, 26,}; 
            /**38, 35, 18, 23, 122, 129, 128, 127, 126, 129, 149 , 130, 43, 44, 46, 49, 50, 60, 70, 80, 
            90, 100, 110, 120, 130, 150, 140, 180, 190, 170, 171, 179, 175, 189, 188, 184, 195, 196,
            197, 136, 135, 131, 200, 300, 400, 500, 600, 700, 800, 900, 999, 994 ,445, 995, 446, 
            996, 884, 854, 864, 877, 842, 834, 839, 811, 812, 819, 817, 815, 816, 819, 821, 829, 
            837, 839, 844, 455, 866, 877, 888, 889, 221, 222, 223, 224, 225, 226, 227, 228, 229,
            230, 240, 250, 260, 270, 280, 290, 813, 823, 833, 843, 853, 863,995, 994, 993, 992, 991, 989, 988, 
            987, 986, 985, 984, 983, 982, 981, 979, 978, 976, 975, 974, 973, 972, 971, 969, 968, 967, 
            966, 965, 964, 964, 963, 962, 961, 959, 958, 957, 956, 955, 954, 953, 952, 951, 
            949, 948, 947, 946, 945, 944, 943, 942, 941, 939, 938, 937, 936, 935, 934, 933, 932, 931,
            929, 928, 927, 926, 925, 924, 923, 922, 921, 2000, 1999, 1998, 1997, 1996, 1995, 1994, 1993, 1992,
            1991, 1990, 1989, 1988, 1987, 1986, 1985, 1984, 1983, 1982, 1981, 1980, 1979, 1978, 1977, 1976, 1975,
            1974, 1973, 1972, 1971, 1970, 1969, 1968, 1967, 1966, 1965 , 1964 ,1963, 1962, 1961, 1960, 1959,
            1958, 1957, 1956, 1955};*/
 
        System.out.println("Given Array");
        printArray(arr);
 
        Merge ob = new Merge();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra */