package tutorials.tutorials16_map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * There are three common methods that need to be overridden the most:
 *      1. hashCode();
 *      2. toString();
 *      3. equals();
 */

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + "  " + id;
    }

    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Student envokedStudent = (Student) obj;
        return id == envokedStudent.id;

        //The preceding statement is equivalent to the commented code below
        /*if (id == envokedStudent.id) {
            return true;
        } else {
            return false;
        }*/
    }
}

public class StudentsInfo {
    public static void main(String[] args) {
        HashMap<Integer, Student> studentsMap = new HashMap<>();

        Student student1 = new Student("Van", 123);
        Student student2 = new Student("Long", 234);
        Student student3 = new Student("Giang", 345);
        Student student4 = new Student("Truong", 456);

        studentsMap.put(student1.id, student1);
        studentsMap.put(student2.id, student2);
        studentsMap.put(student3.id, student3);
        studentsMap.put(student4.id, student4);

        Set<Map.Entry<Integer, Student>> studentsSet = studentsMap.entrySet();
        for (Map.Entry<Integer, Student> student : studentsSet) {
            System.out.println(student.getValue());
        }

        Student s = studentsMap.get(456);
        System.out.println(s);

    }
}
