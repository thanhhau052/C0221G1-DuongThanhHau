package bai5_access_modifier.bai_tap.accsess_modifier;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainCrircle { 
    public static void main(String[] args) {
        Crircle crircle = new Crircle(5, "red");
        Crircle crircle1 = new Crircle(3,"blue");
        System.out.println(crircle.toString());
        System.out.println(crircle1.toString());
//        System.out.println("Hinh tron ban kinh "+crircle.getRadius()+" co dien tich la " + crircle.getArea() + "  co mau sac la :" + crircle.getColor());
//        System.out.println("Hinh tron ban kinh " + crircle1.getRadius() + " co dien tich la :" + crircle1.getArea());
    }
}
