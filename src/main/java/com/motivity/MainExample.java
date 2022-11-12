package com.motivity;

public class MainExample {
    public static void main(String[] args) {
        Employee employee=new Employee(43,"sandeepkumarreddy");
        System.out.println(employee.id+" "+employee.name);
        employee.setId(54);
        System.out.println(employee);
    }
}
