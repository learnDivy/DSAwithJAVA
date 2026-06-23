public class Sorting {
    public static void bubblesort (int arr[] , int n ) {
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[] , int n) {
        for(int i = 0 ; i < n ; i++) {
            int min = i;
            for(int j = i+1 ; j < n ; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void mergesort(int arr[] , int l , int r) {
        if(l < r) {
            int mid = (l+r)/2;
            mergesort(arr , l , mid);
            mergesort(arr , mid+1 , r);
            merge(arr , l , mid , r);
        }
    }

    public static void merge(int arr[] , int l , int mid , int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i = 0 ; i < n1 ; i++) {
            L[i] = arr[l+i];
        }
        for(int j = 0 ; j < n2 ; j++) {
            R[j] = arr[mid+1+j];
        }
        int i = 0 , j = 0;
        int k = l;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void quicksort(int arr[] , int low , int high) {
        if(low < high) {
            int pi = partition(arr , low , high);
            quicksort(arr , low , pi-1);
            quicksort(arr , pi+1 , high);
        }
    }

    public static int partition(int arr[] , int low , int high) {
        int pivot = arr[high];
        int i = (low-1);
        for(int j = low ; j < high ; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    } 
     
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubblesort(arr , n);
        System.out.println("Sorted array using Bubble Sort: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionsort(arr , n);
        System.out.println("Sorted array using Selection Sort: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergesort(arr , 0 , n-1);
        System.out.println("Sorted array using Merge Sort: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quicksort(arr , 0 , n-1);
        System.out.println("Sorted array using Quick Sort: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
