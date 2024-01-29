import java.util.*;
class guessnumber
  {
    public static void main(String args[])
    {
      int number=98;
      System.out.println("Welcome to Number Game ");
      System.out.println("You have 3 choices to guess the correct number");
      int count=3;
      while(count>0)
        {
          System.out.println("choose a number between 1 to 100");
          Scanner s = new Scanner(System.in);
          int guessnum = s.nextINT();

      if(guessnum < number)
      {
        System.out.println("your guess is small");
        int rem1= count-1;
        System.out.println("you have remaining " +rem1+" chances left");
      }
        else  if(guessnum  >number)
      {
        System.out.println("your guess is large");
        int rem2= count-1;
        System.out.println("you have remaining " +rem2+" chances left");
      }
       else  if(guessnum == number && count==3)
      {
        System.out.println(" Excellent!your have guessed the number in the first attempt");
      }
        else  if(guessnum == number && count==2)
      {
        System.out.println(" Good!your have guessed the number in the Second attempt");
      }
          else if(guessnum == number && count==1)
      {
        System.out.println(" Not Bad!your have guessed the number in the last attempt");
      }
          count--;
        }
      if(count<0)
      {
        System.out.println("Sorry! You have failed to guess the correct number\n ");
        System.out.println("The number is:" +number"\n");
        System.out.println("Better luck next time");
      }
    }
  }
          
          
          
          
          
