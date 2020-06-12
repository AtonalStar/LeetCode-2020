import java.util.*;

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<Integer>();
		
		//Construct countMap: store the nums element - element number entries in a HashMap.
		Map<Integer,Integer> countMap=new HashMap<Integer,Integer>();
		for(int i=0; i<nums.length;i++){
			if(!countMap.containsKey(nums[i])){
				countMap.put(nums[i], 1);
			}else{
				countMap.replace(nums[i], countMap.get(nums[i]), countMap.get(nums[i])+1);
			}
		}
		
		//Sort countMap: turn into the mapList, construct a Comparator and use Collections.sort(List, Comparator) method to sort
		List<Map.Entry<Integer, Integer>> mapList= new ArrayList<>();
		mapList.addAll(countMap.entrySet());
		
		Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer,Integer>>(){
			public int compare(Map.Entry<Integer, Integer> n1, Map.Entry<Integer, Integer> n2){
				return n1.getValue()>n2.getValue()? n1.getValue():n2.getValue();
			}
		};
		
		Collections.sort(mapList, comparator);
		
		//Select the top k frequent elements from the mapList
			int counter = 1;
			result.add(mapList.get(0).getKey());
			if(counter<=k){
				for(int j=1; j<mapList.size();j++){
					if(mapList.get(j).getValue()==mapList.get(j-1).getValue()){
						result.add(mapList.get(j).getKey());
					}else{
						counter++;
						if(counter<=k)result.add(mapList.get(j).getKey());
					}
				}
			}
		return result;
	}
    
}
