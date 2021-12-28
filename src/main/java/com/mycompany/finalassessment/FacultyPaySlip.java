/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalassessment;


public class FacultyPaySlip extends EmployeePaySlip{
    private char qualificationCode;

    public FacultyPaySlip() {
    }

    public FacultyPaySlip(char qualificationCode) {
        this.qualificationCode = qualificationCode;
    }
    
    public FacultyPaySlip(char qualificationCode, Employee employee) {
        this.qualificationCode = qualificationCode;
        this.employee = employee;
    }

    public char getQualificationCode() {
        return qualificationCode;
    }

    public void setQualificationCode(char qualificationCode) {
        this.qualificationCode = qualificationCode;
    }
    
    @Override
    public Employee getEmployee() {
        return employee;
    }

    
    @Override
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
   
    @Override
    public double grossSalary() {
        float grossSal;
        if(this.qualificationCode == 'M'){
            grossSal = (175*getEmployee().getHours())+1000;
            return grossSal;
        }else{
            grossSal = (100*getEmployee().getHours())+600;
        }
        
        return grossSal;
    }
    
    @Override
    public double netSalary() {
        return (grossSalary()-Deductions());
    }

    @Override
    public String toString() {
        return "FacultyPaySlip{" + "qualificationCode=" + qualificationCode + '}';
    }
    
    
}
