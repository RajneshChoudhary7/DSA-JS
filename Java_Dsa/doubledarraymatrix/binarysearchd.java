package Java_Dsa.doubledarraymatrix;

public class binarysearchd {
    public static boolean binarySearchRowWise(int[][] mat, int target) {
    for (int[] row : mat) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == target) return true;
            if (row[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
    }
    return false;
}
}
