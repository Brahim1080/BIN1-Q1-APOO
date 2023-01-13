public class TestDate {

    public static void main(String[] args) {

        Date date1 = new Date(18, 6, 2002);
        Date date2 = new Date(23,9,2021);



        System.out.println(date1);
        System.out.println(date1.getJour());
        System.out.println(date1.getMois());
        System.out.println(date1.getAnnee());

        System.out.println(date2);
        System.out.println(date2.getAnnee());




    }
}
