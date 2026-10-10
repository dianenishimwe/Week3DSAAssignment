
public class ArrayStringAlgorithms {

    // Part 3.1: Rotate an array right in place
    // Time: O(n), Auxiliary space: O(1)
    public static void rotateRight(int[] a, int k) {
        if (a == null || a.length == 0) {
            return;

        }

        int n = a.length;
        k = k % n;

        if (k < 0) {
            k += n;
        }

        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
    }

    // Helper method to reverse part of an array
    private static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;





        }
    }
    // Part 3.2: Check whether two strings are anagrams
    // Assumes lowercase English letters a-z
    // Time: O(n), Auxiliary space: O(1)
    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            return a == b;
        }

        if (a.length() != b.length()) {
            return false;
        }

        int[] counts = new int[26];

        for (int i = 0; i < a.length(); i++) {
            char first = a.charAt(i);
            char second = b.charAt(i);

            if (first < 'a' || first > 'z'
                    || second < 'a' || second > 'z') {
                throw new IllegalArgumentException(
                        "Use lowercase English letters only"
                );
            }

            counts[first - 'a']++;
            counts[second - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // Part 3.3: Find two indices in a sorted array
    // Returns {-1, -1} if no pair exists
    // Time: O(n), Auxiliary space: O(1)
    public static int[] twoSumSorted(int[] a, int target) {
        if (a == null || a.length < 2) {
            return new int[]{-1, -1};
        }

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            long sum = (long) a[left] + a[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }



}
