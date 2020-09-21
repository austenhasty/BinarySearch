import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] first = new int[n];
        for (int i = 0; i < first.length; i++) {
            first[i] = s.nextInt();
        }
        int left = 0;
        int right = first.length - 1;
        int k = s.nextInt();
        int key;
        int[] second = new int[k];
        for (int i = 0; i < second.length; i++) {
            second[i] = s.nextInt();
            key = second[i];
            System.out.print(search(first, left, right, key) + " ");
        }
    }

    public static int search(int[] first, int left, int right, int key) {
        int mid = left + ((right - left) / 2);
        if (right < left) {
            return -1;
        }
        if (key == first[mid]) {
            return mid;
        } else if (key < first[mid]) {
            return search(first, left, mid - 1, key);
        } else if (key > first[mid]){
            return search(first, mid + 1, right, key);
        } else {
            return -1;
        }
    }

}
