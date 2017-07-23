package koushik;

import java.util.*;

interface Condition {
    boolean test(Student student);
}

/**
 * Created by Adwiti on 7/23/2017.
 */
public class Assignment1 {
    public static void main(String[] args) {
        List<Student> lstStudents = Arrays.asList(
                new Student("Arun", "Phoenix", 32), new Student("Adwiti", "Scottsdale", 2), new Student("Pushpa", "Scottsdale", 32)
        );

        System.out.println(lstStudents);

        //In java 7, sort based on first name
        Collections.sort(lstStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(lstStudents);

        //to filter out students below 30

        for (Student s : lstStudents) {
            if (s.getAge() > 30) {
                System.out.println(s);
            }
        }


        //In java 8, sort based on first name
        lstStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        System.out.println(lstStudents);

        Collections.sort(lstStudents, (s1, s2) -> s1.getAddress().compareTo(s2.getAddress()));
        System.out.println(lstStudents);

        System.out.println("Students below 30..");
        //to filter out students above 30 age
        List<Student> lstStudentsBelow30 = filterStudents(lstStudents, p -> p.getAge() < 30);
        System.out.println(lstStudentsBelow30);

        System.out.println("Students above 30..");
        List<Student> lstStudentAbove30 = filterStudents(lstStudents, p -> p.getAge() > 30);
        System.out.println(lstStudentAbove30);

    }

    private static List<Student> filterStudents(List<Student> lstStudent, Condition condition) {
        List<Student> filter = new ArrayList<>();
        for (Student s : lstStudent) {
            if (condition.test(s)) {
                filter.add(s);
            }
        }
        return filter;
    }
}

class Student {
    private String name;
    private String address;
    private int age;

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}