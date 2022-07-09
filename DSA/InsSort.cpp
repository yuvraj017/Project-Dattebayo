// Insertion Sort

#include<iostream>
using namespace std;

int main()
{
 int arr[]={5,2,4,6,3,1};
 
 cout<<"\nUnsorted Array : ";
 for(int i=0;i<6;i++)
  cout<<arr[i]<<" ";

 for(int j=1;j<6;j++)
 {
  int key=arr[j];                    //Find suitable position for "Key" towards lefts..
  int i=j-1;

  while(i>=0 && arr[i]>key)          //Transfer values smaller than "Key" towards right..
  {
   arr[i+1]=arr[i];
   i--;
  }
  arr[i+1]=key;
 }

 cout<<"\nSorted Array   : ";
 for(int i=0;i<6;i++)
  cout<<arr[i]<<" ";
}
