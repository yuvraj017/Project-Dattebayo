import java.util.*;

class MergeSort
{
/*-----------------------mergeSort()------------------------*/
 static int[] mergeSort(int x[],int y[])
 {
  int z[]=new int[x.length+y.length];

  Arrays.sort(x);
  Arrays.sort(y);

  int i,j,k;
  i=j=k=0;

  while(i<x.length && j<y.length)
  {
   if(x[i]<y[j])
    z[k++]=x[i++];
   else
    z[k++]=y[j++];
  }

  while(i<x.length) z[k++]=x[i++];
  while(j<y.length) z[k++]=y[j++];

  return z;
 }

/*-----------------------Main method-----------------------*/
 public static void main(String...arg)
 {
  int x[]={2,4,10,8,6};
  int y[]={11,1,3,9,7,5,13};

  int z[];

  z=mergeSort(x,y);

  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println("y : "+Arrays.toString(y));
  System.out.println("z : "+Arrays.toString(z));
  System.out.println();
 }
}
