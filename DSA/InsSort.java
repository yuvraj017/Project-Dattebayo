import java.util.*;
import static java.lang.System.*;

class InsSort
{
 public static void main(String...arg)
 {
  int size=5;
  int arr[]=new int[size];

  out.print("Enter 5 Elements (Seperated by 'space') : ");
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<size;i++)
   arr[i]=sc.nextInt();

  /*---------------InsSort Logic---------------*/

  for(int j=1;j<size;j++)
  {
   int key=arr[j];                          //Find suitable position for "Key" towards lefts..
   int i=j-1;

   while(i>=0 && arr[i]>key)                //Transfer values smaller than "Key" towards right..
   {
    arr[i+1]=arr[i];
    i--;
   }
   arr[i+1]=key;
  }

  out.print("Sorted Array   : ");
  for(int i=0;i<size;i++)
   out.printf("%d ",arr[i]);
 }
}
