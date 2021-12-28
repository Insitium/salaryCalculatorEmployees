
package com.mycompany.finalassessment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.IllegalArgumentException;
import java.util.InputMismatchException;
public class FinalAssessment {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("PaySlipReport.txt");
        int countFaculty = 0;
        int countNonFaculty = 0;
        BufferedWriter output = new BufferedWriter(file);
        while(true){
            
            
            Scanner s = new Scanner(System.in);
            try {              
                System.out.println("Enter the employee number: ");
                s = new Scanner(System.in);
                int empNo = s.nextInt();
                System.out.println("Enter the first Name:");
                s = new Scanner(System.in);
                String fname = s.nextLine();
                System.out.println("Enter the last Name:");
                s = new Scanner(System.in);
                String lname = s.nextLine();
                System.out.println("Enter the Department Name:");
                s = new Scanner(System.in);
                String dname = s.nextLine();
                System.out.println("Enter the hours worked by the employee:");
                s = new Scanner(System.in);
                int hrsWorked = s.nextInt();
                System.out.println("Press f/F for faculty or n/N for non faculty");
                s = new Scanner(System.in);
                char empType = s.next().charAt(0);      //inputs the type of employee
                
                Employee employ = new Employee(empNo,fname,lname,dname, empType, hrsWorked);
                
                
                if(empType == 'f' || empType=='F'){
                    System.out.println("Enter the qualification of the faculty: Press M for masters and B for bachelors");
                    s = new Scanner(System.in);
                    char qual = s.next().charAt(0);
                    
                    countFaculty++;
                    FacultyPaySlip fp = new FacultyPaySlip(qual,employ);
                    output.write("Payslip and details of employe number "+(countFaculty+countNonFaculty)+" is:\n");
                    output.write("Employee Number: "+fp.employee.getID()+"\n");
                    output.write("Employee Name: "+fp.employee.getfName()+" "+fp.employee.getlName()+"\n");
                    output.write("EMployee Type: Faculty\n");
                    if(qual == 'M'){
                        output.write("Level of education: Master's\n");
                    }else if(qual == 'B'){
                        output.write("Level of Education: Bachelor's\n");
                    }
                    
                    output.write("Gross Salary: "+String.valueOf(fp.grossSalary())+"\n");
                    output.write("Deductions: "+String.valueOf(fp.Deductions())+"\n");
                    output.write("Net Salary: "+String.valueOf(fp.netSalary())+"\n");
                    output.write("----------End of employee "+(countFaculty+countNonFaculty)+" details------\n");
                }
                
                
                
                if(empType == 'n' || empType=='N'){
                    System.out.println("Enter the monthly salary of non faculty employees: ");
                    s = new Scanner(System.in);
                    double sal = s.nextFloat();
                    try{
                        if(sal<0){
                            throw new IllegalCustomInput("Salary can not be negative");
                        }
                    }catch( IllegalCustomInput ex){
                        System.out.println(ex.getMessage());
                        break;
                    }
                    countNonFaculty++;
                    NonFacultyPaySlip nfp = new NonFacultyPaySlip(sal,employ);
                    output.write("Payslip and details of employe number "+(countFaculty+countNonFaculty)+" is:\n");
                    output.write("Employee Number: "+nfp.employee.getID()+"\n");
                    output.write("Employee Name: "+nfp.employee.getfName()+" "+nfp.employee.getlName()+"\n");
                    output.write("EMployee Type: Faculty\n");
                   
                    
                    output.write("Gross Salary: "+String.valueOf(nfp.grossSalary())+"\n");
                    output.write("Deductions: "+String.valueOf(nfp.Deductions())+"\n");
                    output.write("Net Salary: "+String.valueOf(nfp.netSalary())+"\n");
                    output.write("----------End of employee "+(countFaculty+countNonFaculty)+" details------\n");
                    
                }

            }
            catch(InputMismatchException | IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            
            System.out.println("Press e to exit or c to continue: ");
            s = new Scanner(System.in);
            char exit = s.next().charAt(0);
            {
                if(exit == 'e'){
                    int count = countFaculty+countNonFaculty;
                    output.write("Total Number of employees: "+count+"\n");
                    output.write("Total Number of faculty: "+countFaculty+"\n");
                    output.write("Total Number of non faculty workers: "+countNonFaculty+"\n");
                    output.write("****************************************END****************************************");
                    output.close();
                    break;
                }
            }
            
        }
    }
    
}
