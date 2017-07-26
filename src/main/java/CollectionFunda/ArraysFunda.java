package CollectionFunda;

/**
 * Created by Adwiti on 7/26/2017.
 */
public class ArraysFunda {
    public static void main(String[] args) {

        Student [] students = new Student[10]; //fixed size, need to define initially

        students[0] = new Student("Arun","36");
        students[1] = new Student("Adwiti","3");

        System.out.println(students[0]);
        System.out.println(students[1]);



    }
}

class Student {
    private String name;
    private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
