import java.util.Scanner;


//Entity Class


class Calculator {
    private int a;
    private int b;
    public void setData(int x, int y)
    {
        a=x;
        b=y;
    }
    public void Add()
    {
        System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
    }
    public void Subtract()
    {
        System.out.println("Difference between "+a+" and "+b+" is: "+(a-b));
    }
    public void Product()
    {
        System.out.println("Product of "+a+" and "+b+" is: "+(a*b));
    }
    public void Divide()
    {
        System.out.println("Division of "+a+" and "+b+" is: "+(double)a/b);
    }
    public void Remainder()
    {
        System.out.println("Remainder of "+a+"/"+b+" is: "+(a%b));
    }
}


//Driver Class


import java.util.Scanner;

class useCalculator {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x=kb.nextInt();
        int y=kb.nextInt();
        System.out.println("Choose any of the following operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        int choice;
        Calculator obj=new Calculator();
        obj.setData(x, y);
        String more;
        do
        {
            System.out.println("Enter your Choice:");
            choice=kb.nextInt();
            switch(choice)
            {
                case 1:
                    obj.Add();
                    break;
                case 2:
                    obj.Subtract();
                    break;
                case 3:
                    obj.Product();
                    break;
                case 4:
                    obj.Divide();
                    break;
                case 5:
                    obj.Remainder();
                    break;
                default:
                    System.out.println("Please enter valid choice!!");
            }
            System.out.println("Do you want to perform more operations (Yes/No):");
            more=kb.next();
        }while(more.equalsIgnoreCase("Yes"));
    }
}
