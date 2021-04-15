package bai_12_java_collection_framwork.thuc_hanh.bai2_phan_biet_hashMap_hashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Nam",13, "Da Nang");
        Student student2=new Student("Khanh",16, "Da Nang");
        Student student3=new Student("Cuong",18, "Quang Binh");
        Student student4=new Student("Ha",8, "Hue");


        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer,Student> studentEntry : studentMap.entrySet()){
            System.out.println(studentEntry.toString());
        }
        System.out.println("_____________________________-set-_______________________");
        Set<Student> students=new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);


        for (Student student : students ){
            System.out.println(student.toString());
        }



    }
}
