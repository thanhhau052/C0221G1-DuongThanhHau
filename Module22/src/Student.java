public class Student extends Persion {
    String ten;

    public Student(String ten) {
        this.ten = ten;
    }


    public static void main(String[] args) {
//        Persion p = new Student("hieu");
////        System.out.println(p.diHoc());

        Persion p=new Techer();
        System.out.println(((Techer)p).day()); ;

    }
}
