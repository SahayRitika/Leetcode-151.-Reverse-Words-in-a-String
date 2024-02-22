class Solution {
    public String reverseWords(String s) {
        String[] strarr=s.trim().split("\\s+");
        StringBuilder rev= new StringBuilder();
        for(int i=strarr.length-1;i>=0;i--){
            rev.append(strarr[i]);
            if(i>0){
                rev.append(" ");
            }
        }
        return rev.toString();
    }
}
