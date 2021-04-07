package bai5_access_modifier.thuc_hanh.static_method;

public class StaticMethod {
    public static class Student{
        private int rollno;
        private String name;
        private static String college="BBDIT";
        Student(int r,String n){
            rollno=r;
            name=n;

        }
        static void change(){
            college="codeGym";


        }
        void display(){
            System.out.println(rollno + " "+name+" "+college);
        }
    }


}
