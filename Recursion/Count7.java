public int count7(int n) {
  
  int count = 0;
  
  
  /*
   count7(717) => count(17) ==> count(7)
  */

   if(n==0){
     return 0;
   } 
   
   if(n%10 == 7){
    return 1 + count7(n/10); 
   }
   else{
    return count7(n/10);
   }
}


// Source: https://codingbat.com/prob/p101409
