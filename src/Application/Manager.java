package Application;

import java.util.Scanner;

public class Manager {
    Scanner scanner= new Scanner(System.in);
    private int optionSelected;
    private int max=50;
    private int count=0;
    private int currentIndex;
private int selectedNew;
    Employe[] employe =new Employe[max];
    public  void options(){
        System.out.println("----Options Menu:----");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Display Employee Details");
        System.out.println("5. Find Employee By Name Or Position");
        System.out.println("6. Calculate Total Salary");
        System.out.println("7. Sort Employee By Salary");
        System.out.println("8. Exit");
optionSelected=scanner.nextInt();
    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void AddEmployee(){
    System.out.println("Enter Employee ID: ");
    int id= scanner.nextInt();
    scanner.nextLine();
        System.out.println("Enter Employee Name: ");
      String   name= scanner.nextLine();
        System.out.println("Enter Employee Position: ");
         String position= scanner.nextLine();
        System.out.println("Enter Employee Salary: ");
         Double salary= scanner.nextDouble();
        scanner.nextLine();
         if (count<employe.length){
             employe[count]=new Employe(id,name,position,salary);
             count++;
         }
         else{
             System.out.println("Cannot Add More Employees");
         }


}
public void UpdateEmployee(){
    System.out.println("List of Employees: ");
    for (int i=0;i<count;i++){
        System.out.println("Employe Number: "+(i+1));
        System.out.println(employe[i]);

    }
    System.out.println("Pick The Number Of The Employee You Want To Update: ");
    selectedNew=scanner.nextInt()-1;
    scanner.nextLine();
        System.out.println("Enter New Employee ID: ");
        int newId= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter New Employee Name: ");
        String newName= scanner.nextLine();
        System.out.println("Enter New Employee Position: ");
        String newPosition= scanner.nextLine();
        System.out.println("Enter New Employee Salary: ");
        Double newSalary= scanner.nextDouble();
        scanner.nextLine();
        employe[selectedNew].setEmpID(newId);
        employe[selectedNew].setEmpName(newName);
        employe[selectedNew].setEmpPosition(newPosition);
        employe[selectedNew].setEmpSalary(newSalary);
    System.out.println("Employee Updated");
}
public void DeleteEmployee(){
    System.out.println("List of Employees: ");
    for (int i=0;i<count;i++){
        System.out.println("Employe Number:"+ (i + 1));
        System.out.println(employe[i]);

    }
        System.out.println("Enter Employee Number you want to Delete: ");
    selectedNew=scanner.nextInt()-1;
    scanner.nextLine();
    if(selectedNew<0|| selectedNew>count){
        System.out.println("Invalid Employee Number");
        return;
    }
    for (int i=selectedNew;i<count;i++){
        employe[i]=employe[i+1];
    }
    employe[selectedNew]=null;
    count--;
    System.out.println("Employee Deleted");
}
public void DisplayEmployees(){
        for (int i=0;i<count;i++){
//            System.out.println("Employe Number: "+i+1);
            System.out.println(employe[i]);

        }
}
}
