class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs)
        {
            char[] currentString = s.toCharArray();
            Arrays.sort(currentString);
            String sortedS = new String(currentString);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);

        }

        return new ArrayList<>(map.values());
    }
}
