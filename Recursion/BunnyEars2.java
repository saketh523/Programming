public int bunnyEars2(int bunnies) {
  /*
  
  odd - 2
  
  even - 3
  
  */
  
  if(bunnies == 0){
    return 0;
  }
  if(bunnies%2 ==0){
    return 3 + bunnyEars2(bunnies-1);
  }
  else{
    return 2 + bunnyEars2(bunnies-1);
  }
}

// Source: https://codingbat.com/prob/p107330
