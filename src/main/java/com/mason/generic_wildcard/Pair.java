package com.mason.generic_wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang_sq on 2017/8/10.
 *
 */
public class Pair<T> {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }

    public static void printEmployeeBoddies(Pair<? extends Employee> pair) {
        System.out.println(pair.getFirst().getName() + ":" + pair.getSecond().getName());
    }

    public static List<Employee> mergeDepartmentMember(Pair<? super President> pair) {
        List<Employee> employees = new ArrayList<>();
        employees.add((Employee) pair.getFirst());
        employees.add((Employee) pair.getSecond());
        return employees;
    }


}



class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Manager extends Employee {
    public Manager(String n, double s) {
        super(n, s);
    }
}

class President extends Manager {
    public President(String n, double s) {
        super(n, s);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
