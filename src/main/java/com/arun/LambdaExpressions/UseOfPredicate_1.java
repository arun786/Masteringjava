package com.arun.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Adwiti on 7/16/2017.
 */
public class UseOfPredicate_1 {
    public static void main(String[] args) {

        List<Passengers> lstPassengers = new ArrayList<>();
        lstPassengers.add(new Passengers("Sachin", 32, "male"));
        lstPassengers.add(new Passengers("Ria", 32, "female"));
        lstPassengers.add(new Passengers("Adwiti", 3, "female"));
        lstPassengers.add(new Passengers("Rahul", 9, "male"));
        lstPassengers.add(new Passengers("Pushpa", 32, "female"));
        lstPassengers.add(new Passengers("Sangita", 23, "female"));

        CheckPassenger(lstPassengers,"Female kid below 10", isFemaleChild());
        CheckPassenger(lstPassengers,"male kid below 10", isMaleChild());
        CheckPassenger(lstPassengers,"Adult Male", isAdultMale());
        CheckPassenger(lstPassengers,"Adult Female", isAdultFemale());
    }

    public static void CheckPassenger(List<Passengers> lstPassengers, String text, Predicate<Passengers> isPassengerStatus) {
        System.out.println("*****"+text+"******");
        for (Passengers passenger : lstPassengers) {
            if (isPassengerStatus.test(passenger)) {
                System.out.println(passenger.getName() + " : " + passenger.getGender() + " : " + passenger.getAge());
            }
        }
    }

    public static Predicate<Passengers> isAdultMale() {
        return p -> (p.getAge() > 21 && p.getGender().equalsIgnoreCase("male"));
    }

    public static Predicate<Passengers> isAdultFemale() {
        return p -> (p.getAge() > 21 && p.getGender().equalsIgnoreCase("female"));
    }

    public static Predicate<Passengers> isFemaleChild() {
        return p -> (p.getAge() < 10 && p.getGender().equalsIgnoreCase("female"));
    }

    public static Predicate<Passengers> isMaleChild() {
        return p -> (p.getAge() < 10 && p.getGender().equalsIgnoreCase("male"));
    }
}

class Passengers {
    private String name;
    private Integer age;
    private String gender;

    public Passengers(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Passengers{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", gender='").append(gender).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
