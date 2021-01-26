
//Making main class StaffHire with three attributes.
public class StaffHire{
    public int vacancyNumber;
    public String designation;
    public String jobType;

    //Making Constructors and Assigning value of the Constructor's Parameters.
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType= jobType;

    }
 
    // Using getter method.
    public int getVacancyNumber(){
        return vacancyNumber;
    }

    public String getDesignation(){
        return designation;
    }

    public String getJobType(){
        return jobType;
    }

    //Using setter method.
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber = vacancyNumber;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setJobType(String JobType){
        this.jobType = jobType;
    }

    //Using Display method.
    public void displayDetails(){
        System.out.println("The Number of Vacancy Number is: " +getVacancyNumber());
        System.out.println("The Designation of Staff is: " +getDesignation());
        System.out.println("The Job Type of Staff is: " +getJobType());
    }
}

