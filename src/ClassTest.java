public class ClassTest {
    public static void main(String[] args) {
        Merchandise m1;
        m1 = new Merchandise();

        Merchandise m2 = new Merchandise();
        Merchandise m3 = new Merchandise();
        Merchandise m4 = new Merchandise();
        Merchandise m5 = new Merchandise();

        System.out.println("m1.name=" + m1.name);
        System.out.println("m1.count=" + m1.count);



        System.out.println("m1=" + m1);
        System.out.println("m2=" + m2);
        System.out.println("m3=" + m3);
        System.out.println("m4=" + m4);
        System.out.println("m5=" + m5);


        Merchandise[] m6 =  new Merchandise[9];
        m6[1] = new Merchandise();

        System.out.println("m6=" + m6[0] + "m6[1]" +m6[1] + "m6" + m6);


        char[] charArr = new char[5];
        System.out.println(charArr[1]);


    }
}
