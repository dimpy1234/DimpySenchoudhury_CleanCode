package cleancode;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.Math.pow;

public class InterestCalculation{
    private float principal; // stores the principal amount
    private float rate;     //stores the rate of interest
    private float years;    //stores the no. of years
    public InterestCalculation(){
        Scanner sc = new Scanner(System.in);
        PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        obj.print("Enter the principal amount = ");
        this.principal = sc.nextFloat();
        obj.print("Enter the rate = ");
        this.rate = sc.nextFloat();
        obj.print("Enter the years (decimal value possible) = ");
        this.years = sc.nextFloat();
    }
    //formula for simple interest (P*r*t/100)
    void simple_interest(){
        PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        obj.print("The Simple Interest = "+((this.principal*this.rate*this.years)/100)+"\n");
    }
    //formula for compound interest (p*(1+r/100)^t)
    void compound_interest() {
        PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        obj.print("The compound interest = " + (this.principal * pow((1 + (this.rate / 100)), this.years))+"\n");
    }
    void calculate(){
        Scanner sc = new Scanner(System.in);
        PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        obj.print("Press 1 to calculate simple interest \n");
        obj.print("Press 2 to calculate compound interest \n");
        obj.print("Enter your choice = ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:this.simple_interest();
                    break;
            case 2: this.compound_interest();
                    break;
            default: obj.print("Wrong choice\n");
        }
    }
}