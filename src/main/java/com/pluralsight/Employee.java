package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

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

    public void punchIn(int time) {
        startTime = time;
    }
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        this.punchIn(now.getHour());
    }
    public void punchOut(int time) {
        hoursWorked += time - startTime;
    }
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        this.punchOut(now.getHour());
    }
}
