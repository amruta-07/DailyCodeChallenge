class Solution {
    // TC= O(nlogn)
    // SC= O(n)
    public int minSetSize(int[] arr) {
        int n=arr.length;
        //element, freq
        Map<Integer, Integer>map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
            
        }
        List<Integer>freqs = new ArrayList<>(map.values());
        Collections.sort(freqs, Collections.reverseOrder());
        
        int count = 0;
        int totalEl = n;
        int i = 0;
        while(totalEl>n/2){
            totalEl = totalEl - freqs.get(i);
            i++;
            count++;
        }
        return count;
        
        
        
    }
}