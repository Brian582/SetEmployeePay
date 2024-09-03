import java.util.Scanner;

/**
 * The class gets information about an employee
 */
public class Employee
{
    private String EmployeeName;
    private String EmployeeNumber;
    private Date HireDate;
    
    private int year;
    private int month;
    private int day;
    
    private String employeeInfo;

    /**
     * Constructor for objects of class Employee
     */
    public Employee()
    {
        EmployeeName="";
        EmployeeNumber=""; 
        this.employeeInfo="";
    }

    //sets Employee Name
    public void setEmployeeName(String name)
    {
        EmployeeName=name;
    }
    
    //sets Employee Number
    public void setEmployeeNumber(String number) throws InvalidEmployeeNumber
    {
        if(checkEmployeeNumber(number)==true)
            EmployeeNumber=number;
    }
    
    //sets Employee Hire Date
    public void setHireDate(String date)//this needs to be fixed
    {
        Scanner dt=new Scanner(date);//the string would be in format "MM-DD-YY" (month-day-year)
        dt.useDelimiter("-");
        
        if(dt.hasNext())
        {
           month = Integer.parseInt(dt.next());
        }
        
        if(dt.hasNext())
        {
           day = Integer.parseInt(dt.next());
        }
        
        if(dt.hasNext())
        {
           year = Integer.parseInt(dt.next());
        }
        
        HireDate = new Date(month,day,year);

        dt.close();
    }
    
    //returns Employee Name
    public String getEmployeeName()
    {
        return EmployeeName;
    }
    
    //returns Employee Number
    public String getEmployeeNumber()
    {
        return EmployeeNumber;
    }

    //returns Employee Hire Date
    public Date getHireDate()
    {
        return HireDate;
    }
    
    //checks the employee number to see if its valid
    public boolean checkEmployeeNumber(String EN) throws InvalidEmployeeNumber
    {
        int digits=Integer.parseInt(EN.substring(0,3));//gets the first 3 digits of the employee number
        char dash=EN.charAt(3);//this would be the location of the dash in the employee number
        char letter=EN.charAt(4);//this would be the location of the letter in the employee number
        
        if( digits <0 || digits > 999)
        {
            throw new InvalidEmployeeNumber();
        }
        
        if(dash!='-')
        {
            throw new InvalidEmployeeNumber();
        }
        
        if( checkLetter(letter)==false )
        {
            throw new InvalidEmployeeNumber();
        }
        
        return true;
    }
    
    //checks if letter is between A to M in capital letters
    public boolean checkLetter(char letter)
    {
        if(letter>='A' && letter <='M')
            return true;
        
        return false;
    }
    
    public String toString()
    {
        this.employeeInfo="   Employee's Information" + 
                "\nEmployee's name: " + getEmployeeName() + 
                "\nEmployee's Number: " + getEmployeeNumber() + 
                "\nEmployee's Hire Date: " + getHireDate(); 
                
        return this.employeeInfo;
    }
    
}





