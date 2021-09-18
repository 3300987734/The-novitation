package arrange;

import java.util.Arrays;

public class merge {
	public static void mergeSortInplace(int[] a) {
        int start = 0;
        int end = a.length-1;
        int mid = (end - start) / 2 + start;
        // 将数组分为两部分
        int i = start;
        int j = mid + 1;
        int[] temp = new int[end+1];
        for (int k = start; k <= end; k++) {
            temp[k] = a[k];
        }
        for (int k = start; k <= end; k++) {
            if (i > mid) {
                a[k] = temp[j++];
            } else if (j > end) {
                a[k] = temp[i++];
            } else if (less(temp[j], temp[i])) {
                a[k] = temp[j++];
            } else {
                a[k] = temp[i++];
            }
        }
    }
    private static boolean less(Comparable v, Comparable w) {
        // 若 v 小于 w 则返回负数
        return v.compareTo(w) < 0;
    }

    public static void main(String[] args) {
        // 归并排序是指将两个有序的部分数组排序成整体有序的数组
        int[] array = {13,56,-10,89,65,45,32,15};
        mergeSortInplace(array);
        System.out.println("该数列从小到大排序为：\n"+Arrays.toString(array));

    }
}
