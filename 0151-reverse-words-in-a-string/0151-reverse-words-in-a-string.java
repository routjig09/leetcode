class Solution {

    public String reverseWords(String s) {

        char[] arr = s.toCharArray();
        int n = arr.length;

        char[] result = new char[n];
        int k = 0;

        int i = n - 1;

        while (i >= 0) {

            while (i >= 0 && arr[i] == ' ')
                i--;

            if (i < 0)
                break;

            int end = i;
            while (i >= 0 && arr[i] != ' ')
                i--;

            int start = i + 1;

            if (k != 0)
                result[k++] = ' ';
            for (int j = start; j <= end; j++) {
                result[k++] = arr[j];
            }
        }

        return new String(result, 0, k);
    }
}