
/**
 *This class holds information about employee's shift and hourly Pay
 */
public class ProductionWorker extends Employee
{
    private String shift;
    private double HourlyPay;
    private String employeeInfo;
    private int hours;
    private double pay;

    public ProductionWorker()
    {
        this.shift="";
        this.HourlyPay=0;
        this.employeeInfo="";
        this.hours=0;
        this.pay=0;
    }

    //sets shift to Day shift or Night shift
    public void setShift(int shiftNumber) throws InvalidShift
    {
        if(checkShift(shiftNumber)==false)
            throw new InvalidShift();
            
        if(shiftNumber==1)
            shift="Day";
  
        else
            shift="Night";
    }
    
    //checks if ShiftNumber is valid
    public boolean checkShift(int shiftNumber)
    {
        if(shiftNumber==1 || shiftNumber==2)//checks if shift equals 1 or 2
            return true;
            
        else
            return false;
    }
    
    //sets employee's hours
    public void setHours(int hours)
    {
        this.hours=hours; 
    }
    
    //returns employee's pay
    public double getEmployeePay()
    {
        pay = hours*HourlyPay;
        
        return pay;
    }
    
    //sets hourlyPay
    public void setHourlyPay(double pay) throws InvalidPayRate
    {
        if(pay<0)//checks if pay is negative
            throw new InvalidPayRate();
        
        else 
            HourlyPay=pay;
    }
    
    //returns employee's hours
    public int getHours()
    {
        return hours;
    }
    
    //returns the hourly pay
    public double getHourlyPay()
    {
        return HourlyPay;
    }
    
    public String toString()
    {
        employeeInfo= super.toString();
        
        return employeeInfo + 
                "\nEmployee's Shift: " + shift + 
                "\nEmployee's hours worked: " + hours + 
               "\nEmployee's hourly Pay: $" + HourlyPay +
               "\nEmployee's Pay: $" + getEmployeePay(); 
        
    }
    
}
