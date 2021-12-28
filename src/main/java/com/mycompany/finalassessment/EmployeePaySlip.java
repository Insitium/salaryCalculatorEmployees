
package com.mycompany.finalassessment;


public abstract class EmployeePaySlip {
    public Employee employee;

    public EmployeePaySlip() {
    }
    
    
    public EmployeePaySlip(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    public abstract double grossSalary();
    public double Deductions(){
        double grossSal = grossSalary();
        double tax = (grossSal-2500)*(0.25);
        if(tax>3000){
            tax+=33;
        }else{
            tax+=19.2;
        }
        if(tax>0){
        return tax;
        }else{
            return 0;
        }
    }
    public abstract double netSalary();

    @Override
    public String toString() {
        return "EmployeePaySlip{" + "employee=" + employee + '}';
    }
    
}

