public class TestCercle {
    public static void main (String [] args){
        Point point = new Point (4 , 2);

        Cercle cercle1= new Cercle(4, point);
        Cercle cercle2= new Cercle(12.5, point);

        System.out.println(cercle1);
        System.out.println(cercle2);

//        on change la valeur du centre des 2 cercles
        cercle2.getCentre().setX(8);

        System.out.println(cercle1);
        System.out.println(cercle2);




    }
}
