class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      int longest =0;
      for(int i=0; i< nums.length;i++)
      {
        set.add(nums[i]);
      }
   //2,10,4,3,5
      for(int num : set)
      {
        if(!set.contains(num-1))
        {
            int count =1;
            int present = num;
          while(set.contains(present + 1))
          {
            count++;
            present++;
          }
          longest = Math.max(longest,count);
        }
      }
  return longest;
        
    }
}
