class Solution {
    public int[] sortedSquares(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        int l = 0, r = n - 1;
        int i = n - 1;

        while (l <= r) {
            if (Math.abs(a[l]) >= Math.abs(a[r])) {
                res[i] = a[l] * a[l];
                l++;
            } else {
                res[i] = a[r] * a[r];
                r--;
            }
            i--;
        }
        return res;
    }
}
