import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={4,2,5,6,8,45,0,23,100,67,34,62,77};
        int target=852;
        Arrays.sort(arr);
        for (int i:arr
             ) {
            System.out.println(i);

        }
        int start=0;
        int end=arr.length-1;

        search(arr,start,end,target);
    }

    private static void search(int[] arr, int start, int end,int target) {
        if(end>=start) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("element found at index " + mid);
            } else if (target < arr[mid]) {
                search(arr, start, mid - 1, target);
            } else {
                search(arr, mid + 1, end, target);
            }
        }
        else{
            System.out.println("not found");
        }
    }
}
