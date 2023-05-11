package greeedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMinCandy {


    public static  void main(String[] args){

        int N=4;
        int k=2;
        int[] candies={3,2,1,4};
        ArrayList<Integer> sol= candyStore(candies,N,k);
        System.out.println(Arrays.toString(sol.toArray()));
    }


        static ArrayList<Integer> candyStore(int candies[], int N, int K){
            Arrays.sort(candies);
            int f=0;
            int l=candies.length-1;

           Integer max= findMax(candies,N,K);
           Integer min= findMin(candies,N,K);
            ArrayList<Integer> ll= new ArrayList<>();
            ll.add(max);
            ll.add(min);

            return  ll;

        }

    private static Integer findMax(int[] candies, int n, int k) {
        int f=0;
        int l=candies.length-1;
        int max=0;
        while(f<=l ){
            max+=candies[f];
            f++;
            l-=k;
        }
        return max;
    }

    private static Integer findMin(int[] candies, int n, int k) {
        int f=0;
        int l=candies.length-1;
        int max=0;
        while(f<=l ){
            max+=candies[l];
           l--;
           f+=k;

        }
        return max;
    }

}
