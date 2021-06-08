public class TwoElements {
    public static void main(String[] args) {
        int[] arr = {5,1,2,3,1,5,4,4};
        int res = 0;
        int temp = 0;
        int element1 = 0;
        int element2 = 0;

        for(int i = 0 ; i< arr.length;i++) {
            // Perform XOR for the elements in the array.
            // res will contain the elements which are only once.
            // In this case, 3^2
            res = res ^ arr[i];
        }
        // Find the rightmost set bit.
            res = res & -res;

        for(int i = 0 ; i< arr.length; i++){
            if((arr[i] & res) > 0){
                // Only those elements whose & result is not zero
                element1 = (arr[i] ^ element1);

            }
            else{
                // Only those elements whose & result is zero
                element2 = (arr[i] ^ element2);
            }
        }
        System.out.println(element1 + " " + element2);
        }
    }
