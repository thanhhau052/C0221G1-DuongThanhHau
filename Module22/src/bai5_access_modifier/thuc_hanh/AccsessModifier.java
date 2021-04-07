package bai5_access_modifier.thuc_hanh;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class AccsessModifier {
    static class A{
        private int data=40;
        private void msg(){
            System.out.println("Hello Java");

        }
        public static class Simple{
            public static void main(String[] args) {
                A ojb=new A();
                System.out.println(ojb.data);
            }

        }
    }
}
