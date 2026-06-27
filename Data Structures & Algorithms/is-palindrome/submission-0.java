class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        char[] sen = s.toCharArray();

        for(char c : sen)
        {
            if(Character.isLetterOrDigit(c))
            {
                sb.append(Character.toLowerCase(c));
            }
        }

        String trans = sb.toString();

        int i =0 ;
        int j = trans.length() - 1;
        
        while(i< j)
        {
            if(trans.charAt(i) != trans.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
