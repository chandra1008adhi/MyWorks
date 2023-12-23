package sample;

import java.util.Scanner;

public class PalidromeNextToPrime {
    boolean isPlaindrome(int x){
        int y=x;
        int rev=0;
        while(y!=0){
            int r= y%10;
            rev=rev*10+r;
            y=y/10;
        }
        if(x==rev)
            return true;
        else
            return false;
    }
    boolean isPrime(int x){
        int flag=0;
        for(int i=2;i<x;i++){
            if(x%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public static void main(String [] a){
        PalidromeNextToPrime ob=new PalidromeNextToPrime();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Element");
        int n=sc.nextInt();
        if(ob.isPrime(n)){
            while(!ob.isPlaindrome(++n));
            System.out.println(n);
        }
        else
            System.out.println("Not prime");
        sc.close();
    }
}
