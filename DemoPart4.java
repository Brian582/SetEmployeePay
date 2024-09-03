import java.util.Scanner;

public class DemoPart4
{
    public static void main(String[] args)
    {
        System.out.println();
        
        ProductionWorker PW = new ProductionWorker();
        Scanner scan = new Scanner(System.in);
        String sInput = "";
        int num=0;
        double pay=0;
        
        try 
        {
            System.out.print("Enter Employee's name: ");
            sInput=scan.next();
            PW.setEmployeeName(sInput);
            
            System.out.print("Enter Employee's number in format XXX-L (X for digits 0-9 and L for letters A-M): ");
            sInput=scan.next();
            PW.setEmployeeNumber(sInput);
            
            System.out.print("Enter Employees HireDate (MM-DD-YY): ");
            scan.nextLine();//this will get skipped
            sInput=scan.nextLine();
            PW.setHireDate(sInput);
            
            System.out.print("Enter Employee's shift (1 for day shift, 2 for night shift): ");
            num=scan.nextInt();
            PW.setShift(num);
            
            System.out.print("Enter Employee's hourly pay: ");
            pay=scan.nextDouble();
            PW.setHourlyPay(pay);
            
            System.out.println();
            System.out.println(PW);            
            System.out.println();
        }
        
        catch(InvalidEmployeeNumber e)
        {
            System.out.println(e);
        }
        
        catch(InvalidShift e)
        {
            System.out.println(e);
        }
        
        catch(InvalidPayRate e)
        {
            System.out.println(e);
        }
        

        scan.close();
        
    }
}
