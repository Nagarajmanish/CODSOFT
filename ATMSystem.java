import java.util.*;
class ATM
    {
        public double amount = 50000.0;
        public void withdraw(double amount)
        {
            this.amount-=amount;
            balance();
        }
        public void deposit(double amount)
        {
            this.amount+=amount;
            balance();
        }
        public void balance()
        {
            System.out.println("Balance Amount is: "+amount+" INR");
        }
    }
class Main{
    public static void main(String args[])
    {
        System.out.println("Welcome to ATM System\n");
        System.out.println("You can choose any one of the transaction");
        ATM obj = new ATM();
        Scanner s = new Scanner(System.in);
        System.out.println("\n 1.withdraw \n 2.Deposit \n 3.Balance \n");
        System.out.println("enter your choice:");
        int choice = s.nextINT();
        do
            {
                switch(choice)
                    {
                        case 1:
                            System.out.println("Enter the amount to withdraw:");
                            double Withdrawamount = s.nextDouble();
                            obj.withdraw(withdrawamount);
                            break;
                        case 2:
                            System.out.println("Enter the amount to Deposit:");
                            double depositamount = s.nextDouble();
                            obj.deposit(depositamount);
                            break;
                        case 3:
                            System.out.println("Processing Details");
                            obj.balance();
                            break;
                        case 4:
                            System.exit(0);
                    }
            }
            while(choice<=4);
    }
}
