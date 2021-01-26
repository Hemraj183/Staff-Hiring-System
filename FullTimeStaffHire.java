//Making subclass FullTimeStaffHire which is inhireted from main class StaffHire.
public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
 
 //Making Constructor 
 public FullTimeStaffHire(int vacancyNumber, int salary, int workingHour, String designation, String jobType){
     super(vacancyNumber,designation,jobType);//using super class.
        this.salary= salary;
        this.workingHour= workingHour;
        this.staffName= "";
        this.joiningDate= "";
        this.qualification="";
        this.appointedBy= "";
        this.joined= false;
      
  }
 
 //using getter method.
 public int getSalary(){
      return salary;
 }
 public int getWorkingHour(){
       return workingHour;
 }
 public String getStaffName(){
        return staffName;
 }
 public String getJoiningDate(){
        return joiningDate;
 }
 public String getQualification(){
        return qualification;
 }
 public String getAppointedBy(){
        return appointedBy;
 }
 public boolean getJoined(){
        return joined;
 }
    
 //using setter method.
 
 public void setSalary(int newSalary){
   if (getJoined()==false){ // using method to set the salary as changes to salary inevitably occur.
       this.salary= newSalary;
    }
   else
    {
      System.out.println("It is not possible to change salary");   
    }
    
 }
 public void setWorkingHour(int newWorkingHour){// using method to set the working hour as new working hour.
        this.workingHour=newWorkingHour;
 }
 public void setStaffName(String staffName){
        this.staffName=staffName;
 }
 public void setJoiningDate(String joiningDate){
        this.joiningDate=joiningDate;
 }
 public void setQualification(String qualification){
        this.qualification=qualification;
 }
 public void setAppointedBy(String appointedBy){
        this.appointedBy=appointedBy;
 }
 public void setJoined(boolean joined){
        this.joined=joined;
 }

 //using method to Hire FullTimeStaff of Organization.
 public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
   if (getJoined()==true){
         System.out.println("The Staff is already appointed");
     }
   else
     {
        this.staffName=staffName;
        this.joiningDate=joiningDate;
        this.qualification=qualification;
        this.appointedBy=appointedBy;
        this.joined=true;
        }
 }

 //Using method to display details of staff where required.
 public void displayDetails(){
     super.displayDetails();
     if (joined == true){
   
   System.out.println("The Salary of staff is: " +getSalary());
   System.out.println("The Working Hour of Staff is: " +getWorkingHour());
   System.out.println("The Staff name is: " +getStaffName());
   System.out.println("The Joining Date of staff is: " +getJoiningDate());
   System.out.println("The Qualification of Staff is: " +getQualification());
   System.out.println("The Staff is appointed By: " +getAppointedBy());
   
    }
 }
    
}    