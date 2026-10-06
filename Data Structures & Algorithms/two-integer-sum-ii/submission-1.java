class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        // number2 = target - numbers[i]

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length; i++)
        {
          int numbers2 = target - numbers[i];
          if(map.containsKey(numbers2))
           {
             return new int[] {map.get(numbers2),i+1};
           }
          map.put(numbers[i],i+1);
        }
        return new int[] {-1,-1};
        
    }
    //
}
