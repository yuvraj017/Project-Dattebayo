class AddBinary
{
 public static void main(String...arg)
 {
  int a[]={0,1,0,1,1};
  int b[]={1,1,0,1,0};
  int c[]=new int[a.length+1];
 
  int carray=0;
  for(int i=a.length-1;i>=0;i--)
  {
   c[i+1]=(a[i]+b[i]+carray)%2;
   if(a[i]+b[i]+carray>=2)
    carray=1;
   else
    carray=0;
  }
  c[0]=carray;

  System.out.printf("\nA :   ");
  for(int i=0;i<a.length;i++)
   System.out.printf("%d ",a[i]);

  System.out.printf("\nB :   ");
  for(int i=0;i<b.length;i++)
   System.out.printf("%d ",b[i]);

  System.out.printf("\nC : ");
  for(int i=0;i<c.length;i++)
   System.out.printf("%d ",c[i]);
 }
}