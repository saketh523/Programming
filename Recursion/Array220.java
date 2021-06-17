
//Source: https://codingbat.com/prob/p173469

public boolean array220(int[] nums, int index) {
  
  /*
  
  array220(arr, 0 ) ==> array220(arr, 1)
  
  {1,2,23,10,5} = true
  */
  
  boolean b = false;
  if(index == nums.length){
    return false;
  }
  
  for(int i = index; i< nums.length; i++){
    if(nums[index] * 10 == nums[i]){
      b = true;
      break;
    }
  }

 return b==true ? true: array220(nums, index+1); 
  
}
