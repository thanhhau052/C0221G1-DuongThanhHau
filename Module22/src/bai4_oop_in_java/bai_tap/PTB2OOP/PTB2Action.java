package bai4_oop_in_java.bai_tap.PTB2OOP;

public class PTB2Action {
    public void giaiPTBac2(PTB2modol ptb2modol) {

        if (ptb2modol.getA() == 0) {
            if (ptb2modol.getB() == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + " x = " + (-ptb2modol.getC() / ptb2modol.getB()));
            }
            return;
        }

        float delta = ptb2modol.getB() * ptb2modol.getB() - 4 * ptb2modol.getA() * ptb2modol.getC();
        float x1;
        float x2;
        System.out.println(delta);
        if (delta > 0) {
            x1 = (float) ((-ptb2modol.getB() + Math.sqrt(delta)) / (2 * ptb2modol.getA()));
            x2 = (float) ((-ptb2modol.getB() - Math.sqrt(delta)) / (2 * ptb2modol.getA()));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-ptb2modol.getB() / (2 * ptb2modol.getA()));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
