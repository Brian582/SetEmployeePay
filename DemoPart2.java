import java.util.Scanner;

public class DemoPart2
{
    public static void main(String[] args) throws InvalidEmployeeNumber
    {
        ShiftSupervisor SS= new ShiftSupervisor();
        Scanner scan = new Scanner(System.in);
        String sInput = "";
        char ans= 'x';
        double pay=0;
        int years=0;
        
        System.out.print("Enter employee's name: ");
        sInput=scan.next();
        SS.setEmployeeName(sInput);
        
        System.out.print("Enter employee's number in format XXX-L (X for digits 0-9 and L for letters A-M): ");
        sInput=scan.next();
        SS.setEmployeeNumber(sInput);
        
        System.out.print("Enter employee's HireDate (MM-DD-YY): ");
        scan.nextLine();//this will get skipped
        sInput=scan.nextLine();//this was skipped
        SS.setHireDate(sInput);
        
       
        System.out.print("Enter employee's annual salary: ");
        pay=scan.nextDouble();
        SS.setAnnualSalary(pay);
        
        System.out.print("How many years did employee work?: ");
        years=scan.nextInt();
        SS.setYears(years);
        
        System.out.print("Did the shift supervisor meet production goals? (Y/N): ");
        ans=scan.next().charAt(0);
        SS.setBonus(ans);
        
        if(ans == 'Y' || ans == 'y') 
            SS.setBonus(ans);
        else
            SS.setEmployeePay();

        System.out.println();
        System.out.println(SS);
        System.out.println();

        scan.close();
        
    }
}
