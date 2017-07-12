package com.arun.LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Adwiti on 7/11/2017.
 */
public class SortingAList {
    public static void main(String[] args) {

        List<Student> lstStudents = Arrays.asList(new Student("arun", "23"), new Student("guguul", "34"), new Student("Pushpa", "31"), new Student("Danny", "24"));
        Collections.sort(lstStudents, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        });
        System.out.println(lstStudents);

        //In Java 8
        lstStudents = Arrays.asList(new Student("arun", "23"), new Student("guguul", "34"), new Student("Pushpa", "31"), new Student("Danny", "24"));
        Collections.sort(lstStudents, (Student student1, Student student2) -> student1.getName().compareTo(student2.getName()));
        System.out.println(lstStudents);

        /*another way in java 8*/
        lstStudents = Arrays.asList(new Student("arun", "23"), new Student("guguul", "34"), new Student("Pushpa", "31"), new Student("Danny", "24"));
        Collections.sort(lstStudents,(student1,student2)->student1.getName().compareTo(student2.getName()));
        System.out.println(lstStudents);

    }

}

class Student {
    private String name;
    private String age;

    public Student() {
    }

    public Student(String name, String age) {
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
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
