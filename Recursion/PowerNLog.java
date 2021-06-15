public int powerN(int base, int n) {
  
  if(n==0){
    return 1;
  }
  
  int res = powerN(base, n/2) * powerN(base, n/2);
  
  if(n%2!=0){
    res  = res * base;
  }

  return res;
}

// Source: https://codingbat.com/prob/p158888
