public int sumDigits(int n) {
  
  /*
      sumDigits(126) --> sumDigits(12) --> sumDigits(1);
      
                    n%10  +  sumDigits(n/10);
      
  */
  
  if(n==0){
    return 0;
  }
  
  return sumDigits(n/10) + n%10;
  
}

// Source: https://codingbat.com/prob/p163932
