class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length() != t.length())
        return false;
     char[] firstString = s.toCharArray();
     char[] secondString = t.toCharArray();

     Arrays.sort(firstString);
     Arrays.sort(secondString);

     int j = 0;

     for(char c : firstString)
     {
        if(c != secondString[j])
        {
            return false;
        }
        j++;
     }

     return true;
    }
}
