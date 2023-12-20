package q17093;

import java.util.*;

public class CTJ17093 {

public static boolean binary(int a[], int key)

{

int 1b=0 ub-a.length-1,mid=0; while(lb<=ub)

{ mid=(lb+ub)/2; if(key==a[mid])

return true;

}

else if(a[mid]<key) lb=mid+1;

else ub=mid-1;

}

return false;

} public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

String in=sc.nextLine();

String[] input=in.split(" ");

int n=input.length;

int[] a=new int[input.length];

int[] b=new int[input.length];

for(int i=0;i<input.length;i++)

{ a[i]=Integer.parseInt(input[i]); b[i]=Integer.parseInt(input[i]);

}

int key=sc.nextInt();

for(int i=0;i<n-1;i++)

for(int j=\theta;j<n-1;j++)

{

if(a[j]>a[j+1])

{

int t=a[j];

a[j]=a[j+1] ;

a[j+1]=t ;
}}boolean pos binary(a, key);

if (pos)

{

for(int i=0 i<input.length;i++)

{

if(b[i]==key)

{

System.out.println(i);

break;
}

else

System.out.println("Not found");

}

}
