package com.arun.LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Adwiti on 7/16/2017.
 */
public class UseOfPredicate {

    public static void main(String[] args) {
        List<Mechanics> lstMechanics = Arrays.asList(new Mechanics("arun", 32), new Mechanics("adwiti", 12), new Mechanics("pushpa", 30));
        printListAsperAge(lstMechanics, "Mechanics above 30 age", mechanics -> (mechanics.getAge() > 30));
        printListAsperAge(lstMechanics, "Mechanics below age 30", mechanics -> (mechanics.getAge() <= 30));


    }

    public static void printListAsperAge(List<Mechanics> lstMechanics, String text, Predicate<Mechanics> ageOfMechanics) {
        System.out.println(text);
        for (Mechanics mechnic : lstMechanics) {
            if (ageOfMechanics.test(mechnic)) {
                System.out.println(mechnic.getName());
            }
        }
    }
}


class Mechanics {
    private String name;
    private Integer age;

    public Mechanics(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mechanics{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }


}