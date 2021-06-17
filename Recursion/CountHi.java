// Source: https://codingbat.com/prob/p184029

public int countHi(String str) {
  
  // countHi("xxhixx") ==> countHi("xhixx")
  int val = 0;
  if(str.length() <2){
    return 0;
  }
  
  String s = str.substring(0,2);

if(s.equals("hi")){
 val = val+ 1 + countHi(str.substring(2));
}
else{
  val = val + countHi(str.substring(1));
}
return val;
}
