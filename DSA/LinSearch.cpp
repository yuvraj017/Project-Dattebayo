// Linear Search

#include<iostream>
using namespace std;

int LinSearch(int arr[],int size,int val)
{
 int i=-1;
 for(int j=0;j<size;j++)
  if(arr[j]==val)
  {
   i=j;
   return i;
  }
 return i;
}

int main()
{
 int arr[5];
 for(int i=0;i<5;i++)
 {
  cout<<"Enter Item["<<i+1<<"] : ";
  cin>>arr[i];
 }

 int val;
 cout<<"\nEnter Item to find : ";
 cin>>val;

 int i=LinSearch(arr,5,val);
 if(i==-1)
  cout<<"\nItem Not Found..";
 else
  cout<<"\nItem found at : "<<i+1;
}
