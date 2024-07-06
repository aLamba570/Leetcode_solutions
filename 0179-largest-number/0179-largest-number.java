class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String c = a + b;
                String d = b + a;
                return d.compareTo(c); 
            }
        };

        Arrays.sort(arr, comp);

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}