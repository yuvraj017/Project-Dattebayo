// Factors of a Number

#include<iostream>

using namespace std;

int main()
{
 int num;
 cout<<"\nEnter the Number : ";
 cin>>num;

 int i;
 cout<<"Factors of "<<num<<"  : ";
 
 for(i=1;i<=num;i++)
  if(num%i==0)
   cout<<i<<" ";

 return 0;
}
