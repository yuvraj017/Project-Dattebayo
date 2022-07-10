import java.util.*;
import static java.lang.System.*;


class LinSearch
{

/*-----------------Solution Function---------------------*/

 static int linSearch(int []arr,int val)
 {
  int i=-1;
  for(int j=0;j<arr.length;j++)
   if(arr[j]==val)
   {
    i=j;
    break;
   }
  return i;
 }

/*----------------Main Function--------------------------*/

 public static void main(String...arg)
 {
  int arr[]={5,6,2,4,10};

  out.print("Enter Item to find : ");
  Scanner sc=new Scanner(System.in);
  int val=sc.nextInt();

  int i=linSearch(arr,val);
  if(i==-1)
  out.println("Item Not Found..");
  else
  out.printf("Item found at : %d\n",i+1);
 }
}