public class BinarySearch {
    public static int BinarySearch(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;//设置指针和初始值
        while (i <= j) {//目标在范围内
            int m = (i + j) >>> 1;
            //用/2可能会超出整数范围，用>>>1无符号右移（除以二取整）比较好
            if (a[m] < target) {//目标值在右边
                i = m + 1;
            } else if (target < a[m]) {//目标值在左边
                j = m - 1;
            } else {//找到目标值
                return m;
            }
        }
        return -1;//未找到返回-1
    }
    public static int BinarySearch_1(int[] a, int target) {
        int i = 0;
        int j = a.length;//设置指针和初始值
        while (i < j) {//目标在范围内
            int m = (i + j) >>> 1;
            //用/2可能会超出整数范围，用>>>1无符号右移（除以二取整）比较好
            if (a[m] < target) {//目标值在右边
                i = m + 1;
            } else if (target < a[m]) {//目标值在左边
                j = m;//j为边界，一定不是查找目标
            } else {//找到目标值
                return m;
            }
        }
        return -1;//未找到返回-1
    }
}
