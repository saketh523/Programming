public int count8(int n) {
  
  /*
   count8(8818) ==> count8(818) ==> count8(18) ==> count8(8)
  */
  
     if(n==0){
     return 0;
   } 

  
  int res = 0;
  if(n%100 == 88){
    return 2 + count8(n/10);
  }
  
  /*if((n%10 == 8) && ((n/10) %10 == 8)){
   return 2 +count8(n/10);
  } */
  
  
  if(n%10 == 8){
    
    return 1 + count8(n/10);
  }
  else{
   return count8(n/10);
  }
}

// Source: https://codingbat.com/prob/p192383
