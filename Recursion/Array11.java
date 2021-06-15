public int array11(int[] nums, int index) {
  
  /*
  
  array11(nums, 0) => array11(nums, 1) 
  */
  if(index==nums.length){
    return 0;
  }
  if(nums[index]==11){
    return 1 + array11(nums, index+1);
  }
  else{
    return array11(nums, index+1);
  }

  
}

// Source: https://codingbat.com/prob/p135988
