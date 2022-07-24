/*---------------------------Main() Class---------------------------*/

public class SimpleDotComTestDrive
{
 public static void main(String...arg)
 {
  SimpleDotCom dot=new SimpleDotCom();

  int[] loc={2,3,4};
  
  dot.setLocationCells(loc);
  
  String userGuess="3";
  String result=dot.checkYourself(userGuess);
 }
}

/*---------------------------Problem Class---------------------------*/

class SimpleDotCom
{
 int[] locCells;
 int numOfHits=0;
 
 public void setLocationCells(int[] loc)
 {
  locCells=loc;
 }
 
 public String checkYourself(String stringGuess)
 {
  int guess=Integer.parseInt(stringGuess);          //convert String to Int...
  String result="miss";
  
  for(int cell : locCells)
  {
   if(guess==cell)
   {
    result="hit";
    numOfHits++;
    break;
   }
  }

  if(numOfHits==locCells.length)
  result="kill";

  System.out.println(result);
  return result;
 }
}
