
/**
 * This class is used for information about a shift supervisor employee
 */
public class ShiftSupervisor extends Employee
{
    private double annualSalary;
    private double annualProductionBonus;
    private boolean bonus;
    private String employeeInfo;
    private int years;
    private double yearBonus;
    private double EmployeePay;

    /**
     * Constructor for objects of class ShiftSupervisor
     */
    public ShiftSupervisor()
    {
        this.annualSalary=0;
        this.annualProductionBonus=2000;//bonus is $2000
        this.bonus=false;
        this.employeeInfo="";
        this.years=0;
        this.yearBonus=0;
        this.EmployeePay=0;
    }

    //sets annual salary
    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary=annualSalary;
    }
    
    //sets employee's worked years
    public void setYears(int years)
    {
        this.years=years;
    }
    
    //calculates employee's pay
    public void setEmployeePay()
    {
        EmployeePay=(years*annualSalary);
    }
    
    //returns employee's annual salary
    public double getAnnualSalary()
    {
        return annualSalary;
    }
    
    //returns employee's production bonus
    public double getAnnualProductionBonus()
    {
        return annualProductionBonus;
    }
   
    //sets bonus to employee if they earned it
    public void setBonus(char answer)
    {
        if(answer == 'Y' || answer == 'y') 
        {
            bonus=true;
            setEmployeePay();//calculates EmployeePay;
            yearBonus=(years*annualProductionBonus);
            EmployeePay+=yearBonus;
        }
        
    }
   
    public String toString()
    {
        employeeInfo= super.toString();
        
        employeeInfo+= "\nEmployee's years worked: " + years;
                
        if(bonus==true)
        {
            return employeeInfo +
                "\nEmployee's yearly bonus: $" + annualProductionBonus +  
                "\nEmployee's Pay with bonus: $" + EmployeePay;
        }
            
        else
            return employeeInfo + 
            "\nEmployee's Pay: $" + EmployeePay;
        
    }
}
