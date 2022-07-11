#include<iostream>
using namespace std;

int main()
{
 int a[]={0,1,0,1,1};
 int b[]={1,1,0,1,0};
 int c[6];

 int carray=0;
 for(int i=4;i>=0;i--)
 {
  c[i+1]=(a[i]+b[i]+carray)%2;
  if(a[i]+b[i]+carray>=2)
   carray=1;
  else
   carray=0;
 }
 c[0]=carray;

 printf("\nA :   ");
 for(int i=0;i<5;i++)
  printf("%d ",a[i]);

 printf("\nB :   ");
 for(int i=0;i<5;i++)
  printf("%d ",b[i]);

 printf("\nC : ");
 for(int i=0;i<6;i++)
  printf("%d ",c[i]);
}
