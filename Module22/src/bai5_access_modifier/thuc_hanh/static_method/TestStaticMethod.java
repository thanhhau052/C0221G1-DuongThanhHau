package bai5_access_modifier.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.Student.change();
        StaticMethod.Student s1=new StaticMethod.Student(111,"Hoang");
        StaticMethod.Student s2=new StaticMethod.Student(222,"Khanh");
        s1.display();
        s2.display();
    }

}
