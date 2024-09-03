import java.util.Scanner;

public class DemoPart1
{
    public static void main(String[] args) throws InvalidEmployeeNumber,InvalidShift,InvalidPayRate
    {
        ProductionWorker PW = new ProductionWorker();
        Scanner scan = new Scanner(System.in);
        String sInput = "";
        int num=0;
        double pay=0;
        int hours=0;
        
        System.out.print("Enter employee's name: ");
        sInput=scan.nextLine();
        PW.setEmployeeName(sInput);
        
        System.out.print("Enter employee's number in format XXX-L (X for digits 0-9 and L for letters A-M): ");
        sInput=scan.next();
        PW.setEmployeeNumber(sInput);
        
        System.out.print("Enter employees HireDate (MM-DD-YY): ");
        scan.nextLine();//this will get skipped
        sInput=scan.nextLine();
        PW.setHireDate(sInput);
        
        System.out.print("Enter employee's shift (1 for day shift, 2 for night shift): ");
        num=scan.nextInt();
        PW.setShift(num);
        
        System.out.print("Enter employee's hours worked: ");
        hours=scan.nextInt();
        PW.setHours(hours);
        
        System.out.print("Enter employee's hourly pay: ");
        pay=scan.nextDouble();
        PW.setHourlyPay(pay);
        
        System.out.println();
        System.out.println(PW);
        System.out.println();

        scan.close();
    }
}
