package cleancode;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Application {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        PrintStream obj = new PrintStream(new FileOutputStream(FileDescriptor.out));
        int con = 1;
        do {
            obj.print("Press 1 to calculate simple & compound interest:\n");
            obj.print("Press 2 to estimate house construction cost:\n");
            obj.print("Enter your choice = ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    InterestCalculation obj1 = new InterestCalculation ();
                    obj1.calculate();
                    break;
                case 2:
                    ConstructionCost obj2 = new ConstructionCost();
                    obj2.calculate();
                    break;
                default:
                    obj.print("Wrong choice\n");
            }
            obj.print("Press 0 to stop\n");
            con = sc.nextInt();
        }while (con!=0);
    }
}
