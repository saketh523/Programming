public boolean array6(int[] nums, int index) {
  
  /*
   array6(nums, 0) ==> array6(nums, 1)
   
   {1,2,5,7,9,6}
   
  */
  
  if(index == nums.length){
    return false;
  }
  if(nums[index] == 6){
    return true;
  }
  return array6(nums, index+1);
}
