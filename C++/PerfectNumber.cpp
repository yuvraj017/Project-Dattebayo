// Program to check for Perfect Number

/*
  A number is a perfect number if it is 
  equal to sum of its positive divisors
  excluding the number itself.
*/

#include<iostream>

using namespace std;

int main()
{
 int num;
 cout<<"Enter a Number : ";
 cin>>num;
 
 int i=1,sum=0;
 while(i<num)
 {
  if(num%i==0)
   sum+=i;
  
  i++;
 }
 

 if(sum==num)
  cout<<i<<" is a Perfect Number\n"; 
 else
  cout<<i<<" is not a Perfect Number\n";
}
