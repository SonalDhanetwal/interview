package com.general.comparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dhanetwa on 4/26/2018.
 */
class Student{
    int rollno;
    String name;
    String location;

    public Student(int rollno, String name, String location) {
        this.rollno = rollno;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollno - o2.rollno;
    }
}
class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(111, "bbbb", "london"));
        list.add(new Student(131, "aaaa", "nyc"));
        list.add(new Student(121, "cccc", "jaipur"));
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("\nSorted by rollno");
        Collections.sort(list, new SortByRoll());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("\nSorted by name");
        Collections.sort(list, new SortByName());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
