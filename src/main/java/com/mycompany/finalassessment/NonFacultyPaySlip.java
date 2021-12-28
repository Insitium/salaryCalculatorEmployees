
package com.mycompany.finalassessment;


public class NonFacultyPaySlip extends EmployeePaySlip{
    public double fSalary;
    public NonFacultyPaySlip() {
    }

    public NonFacultyPaySlip(double fSalary) throws IllegalCustomInput{
       
        this.fSalary = fSalary;
    }
    
    public NonFacultyPaySlip(double fSalary, Employee employee) {
        this.fSalary = fSalary;
        this.employee = employee;
    }
    
    @Override
    public double grossSalary() {
        
        
        double fsal = this.fSalary;
        double rate = fsal/160;
        if(employee.getHours()==160){
            fsal = this.fSalary;
        }else if(employee.getHours()<160){
            fsal = rate*employee.getHours();
        }else{
            fsal = fsal+ ((employee.getHours()-160)*rate*2);
        }
        return fsal;
    }

    @Override
    public double netSalary() {
        return (grossSalary()-Deductions());
    }

    @Override
    public String toString() {
        return "NonFacultyPaySlip{" + "fSalary=" + fSalary + '}';
    }
    
}
