package bai5_access_modifier.bai_tap.accsess_modifier;


   public class Crircle{
      private double radius=1.0;
      private String color="red";
      final double PI=Math.PI;

       public Crircle(double radius, String color) {
           this.radius = radius;
           this.color = color;
       }


       public double getRadius() {
           return radius;
       }

       public void setRadius(double radius) {
           this.radius = radius;
       }

       public String getColor() {
           return color;
       }

       public void setColor(String color) {
           this.color = color;
       }

       public Crircle(double r){
           return ;
       }

       public double getArea(){
           return (Math.floor(this.radius*this.radius*PI)) ;
       }

       @Override
       public String toString() {
           return "Crircle{" +
                   "radius=" + radius +
                   ", color='" + color + '\'' +
                   ", PI=" + PI +
                   '}'+" \n area= "+getArea();
       }
   }

