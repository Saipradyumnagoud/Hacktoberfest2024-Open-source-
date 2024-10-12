class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sArr = new int[127];
        int[] tArr = new int[127];

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(sArr[c1] != tArr[c2]) return false;

            sArr[c1] = i + 1;
            tArr[c2] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "egg";
        String t1 = "add";
        System.out.println("Isomorphic check for 'egg' and 'add': " + solution.isIsomorphic(s1, t1));  // true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Isomorphic check for 'foo' and 'bar': " + solution.isIsomorphic(s2, t2));  // false

        String s3 = "paper";
        String t3 = "title";
        System.out.println("Isomorphic check for 'paper' and 'title': " + solution.isIsomorphic(s3, t3));  // true
    }
}
