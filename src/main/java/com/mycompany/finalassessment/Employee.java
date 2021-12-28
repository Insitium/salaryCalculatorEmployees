
package com.mycompany.finalassessment;


public class Employee {
    public Integer ID;
    public String fName;
    public String lName;
    public String deptName;
    public char empType;
    public int hours;

    public Employee() {
    }

    public Employee(Integer ID, String fName, String lName,String deptName, char empType, int hours) {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.deptName = deptName;
        this.empType = empType;
        this.hours = hours;
        
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public char getEmpType() {
        return empType;
    }

    public void setEmpType(char empType) {
        this.empType = empType;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", fName=" + fName + ", lName=" + lName + ", empType=" + empType + ", hours=" + hours + '}';
    }
    
}
