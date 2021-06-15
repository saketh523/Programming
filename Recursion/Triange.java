public int triangle(int rows) {
  
  /*
      0 -0
      1- 1
      2 -3
      3- 6
      4 -10
  */
  if(rows ==0){
    return 0;
  }

  
return triangle(rows-1) + rows ;

}

// Source: https://codingbat.com/prob/p194781
