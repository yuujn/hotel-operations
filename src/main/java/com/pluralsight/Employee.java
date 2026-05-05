package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public double getRegularHours() {
        if (hoursWorked < 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }
    public double getOvertimeHours() {
        if (hoursWorked < 40) {
            return 0;
        } else {
            return hoursWorked - 40;
        }
    }
    public double getTotalPay() {
        double normalPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return normalPay + overtimePay;
    }
}
