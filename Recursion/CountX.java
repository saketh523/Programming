public int countX(String str) {
  
  int value = 0;
  
  if(str.length() == 0){
    return 0;
  }
  
  char ch = str.charAt(0);
  String res = str.substring(1);
  int fres = countX(res);

  if(ch == 'x'){
    fres =  1 +  countX(res);    
  }

  return fres;
}

// Source: https://codingbat.com/prob/p170371
