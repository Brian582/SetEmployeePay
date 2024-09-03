
/**
 * This class is used for information about team leader
 */
public class TeamLeader extends ProductionWorker
{
    private double MB;//monthly bonus
    private int RTH;//required training hours
    private int TH;//training Hours
    private String employeeInfo;
    private double months;
    private boolean monthlyBonus;
    private double employeePay;

    public TeamLeader()
    {
        MB=500;//Monthly bonus $500
        RTH=20;
        TH=0;
        this.employeeInfo="";
        this.months=0;
        this.monthlyBonus=false;
        this.employeePay=0;
    }

    public void setTrainingHours(int h)
    {
        TH=h;
    }
    
    //sets the employee's pay
    public void setEmployeePay()
    {
        int hours=getHours();
        months=Math.floor(hours/160);//160 hours will be 1 month worked
        
        if(months>=1)  
        {
            monthlyBonus=true;//these employees get a monthly bonus
            employeePay=(months*getHourlyPay() )+ (months*MB);
        }
        
        else
            employeePay=(months*getHourlyPay() )+ (months*MB);
        
    }
    
    public int getTrainingHours()
    {
        return TH;
    }
    
    public int getRequiredTrainingHours()
    {
        return RTH;
    }
    
    //checks if team leader attended required training hours and then displays a message
    public void getMessage()
    {
        if( TH > RTH)
            System.out.println("You attended the minimum hours of training this year.");
            
        else
        {
            System.out.println("You didn't finish your hours of training this year.");
            System.out.println("You have " + (RTH-TH) + " hours left to finish.");
        }
    }
    
    public String toString()
    {
        employeeInfo= super.toString();
        
        
        if( monthlyBonus==true)
        return employeeInfo + 
                "\nRequired number of training hour to attend this year: " + RTH + 
                "\nEmployee's training hours this year: " + TH +
                "\nEmployee's monthly bonus: " + MB;
        else
            return employeeInfo + 
                "\nRequired number of training hour to attend this year: " + RTH + 
                "\nEmployee's training hours this year: " + TH;       
    }
}
