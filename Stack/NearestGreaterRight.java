package com.company.randomcode;

import java.io.*;
import java.util.*;
public class NGR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s  = new Stack<>();

        // Perform right to left traversal of the array

        for(int i=n-1; i>=0; i--){

            // if stack is empty, add -1 to the ArrayList
            if(s.size() == 0){
                v.add(-1);
            }
            // if stack's top element is > array[i] and the size of the stack is greater than 0, then add top element of the stack to the ArrayList.
            else if(s.size() > 0 && s.peek() > arr[i]){
                v.add(s.peek());
            }
            // if stack's top element is less than array[i] and size of stack is > 0, then iterate and pop the stack until the top element is more or not found
            else if(s.size() > 0 && s.peek() <= arr[i]){
                while(s.size() > 0 && s.peek() <= arr[i]){
                        s.pop();
                }
                if(s.size() == 0){
                    v.add(-1);
                }
                else{
                    v.add(s.peek());
                }
            }
            s.push(arr[i]);
        }

        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = v.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revArrayList.add(v.get(i));
        }
        for(int x: revArrayList){
            System.out.print(x + " ");
        }
    }
}
