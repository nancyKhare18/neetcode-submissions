class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> map = new HashMap<>();
        
          int[] ans = new int[k];
          int count =0;
        
        for(int i=0; i< nums.length ;i++)
        {
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)-> b.getValue() - a.getValue());
        for(int i= 0; i<k ;i++)
        {
          ans[i] = list.get(i).getKey();
        }

         return ans;
       
    }
}
