package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void punchCard() {
        Employee myEmployee = new Employee(
                "N131-O2",
                "Steve",
                "Donuts",
                20.,
                0.
        );

        myEmployee.punchIn(10);
        myEmployee.punchOut(18);

        assertEquals(8, myEmployee.getRegularHours());
    }
}