public class AutoConvert {
    public static void main(String[] args) {
        int a = 99;
        long b = 100L;
        long c = a + b;
        System.out.println(c);

        int d = 99;
        int e = 5;
        double f = 5;
        System.out.println(d/e);
        System.out.println(d/f);

        char str = 'A';
        int chNum = str;
        int strNum = str + 10;
        System.out.println(chNum);
        System.out.println(strNum);

        long abc = 99;
        int intVar = 10;
        intVar = (int)abc;
        System.out.println(intVar);

        int stra = 65;
        char charb = (char)stra;
        System.out.println(charb);



    }
}
