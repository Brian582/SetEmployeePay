import java.util.Scanner;

public class DemoPart3
{
    public static void main(String[] args) throws InvalidEmployeeNumber,InvalidShift,InvalidPayRate
    {
        TeamLeader TL= new TeamLeader();
        Scanner scan = new Scanner(System.in);
        String sInput = "";
        int num=0;
        double pay=0;
        int hours=0;
        
        System.out.print("Enter employee's name: ");
        sInput=scan.next();
        TL.setEmployeeName(sInput);
        
        System.out.print("Enter employee's number in format XXX-L (X for digits 0-9 and L for letters A-M): ");
        sInput=scan.next();
        TL.setEmployeeNumber(sInput);
        
        System.out.print("Enter employee's HireDate (MM-DD-YY): ");
        scan.nextLine();//this will get skipped
        sInput=scan.nextLine();//this was skipped
        TL.setHireDate(sInput);
        
        System.out.print("Enter employee's shift (1 for day shift, 2 for night shift): ");
        num=scan.nextInt();
        TL.setShift(num);
        
        System.out.print("Enter employee's hours worked: ");
        hours=scan.nextInt();
        TL.setHours(hours);
       
        System.out.print("Enter employee's hourly pay: ");
        pay=scan.nextDouble();
        TL.setHourlyPay(pay);

        System.out.print("Enter employee's hours of training this year: ");
        hours=scan.nextInt();
        TL.setTrainingHours(hours);
        
        TL.setEmployeePay();
        
        System.out.println();
        System.out.println(TL);
        System.out.println();
        TL.getMessage();
        
        scan.close();
        
    }
}
