class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if(!map.containsKey(key))
            {
                ArrayList<String> list = new ArrayList<>();
                map.put(key,list);
            }
          map.get(key).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String>list : map.values())
        {
            result.add(list);
        }
        return result;
    }
}
