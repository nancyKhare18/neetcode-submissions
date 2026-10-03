class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character, Integer> map1 = new HashMap<>();
      HashMap<Character, Integer> map2 = new HashMap<>();
      char[] char1 = s.toCharArray();
      char[] char2 = t.toCharArray();

      if(s.length() != t.length())
      return false;
      
      for(int i = 0; i < char1.length; i++)
      {
        map1.put(char1[i] , map1.getOrDefault(char1[i],0)+1);
      }

      for(int i = 0; i < char2.length; i++)
      {
        map2.put(char2[i] , map2.getOrDefault(char2[i],0)+1);
      }

      if (map1.equals(map2)) 
      return true;

      return false;
    }
}
