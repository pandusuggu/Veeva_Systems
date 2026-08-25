class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length();
        int l2=t.length();

        int st=0;
        char[] a=t.toCharArray();
        for(int i=0;i<l2 && st<l1;i++){
            if(s.charAt(st)==a[i]){
                st++;
            }
        }
        if(st==l1){
            return true;
        }
        return false;
    }
}