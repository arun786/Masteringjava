package com.arun.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

interface upperCase {
    public String toUpperCase(String s1, String s2);
}

/**
 * Created by Adwiti on 7/12/2017.
 */
public class AnonymousClass {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Arun", "21"), new Employee("sachin", "34"));
        String upperCaseEmployee = doStringStuff(new upperCase() {
            @Override
            public String toUpperCase(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(0).getName());
        System.out.println(upperCaseEmployee);
    }

    public static String doStringStuff(upperCase uc, String s1, String s2) {
        return uc.toUpperCase(s1, s2);
    }
}

class Employee {

    private String name;
    private String age;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
