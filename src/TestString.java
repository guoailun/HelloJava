import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        String a = "123ABCDEfg";

        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a);

//        a = a.toLowerCase();
//        System.out.println(a);

        System.out.println(a.charAt(1));

        String b = "Orange_Apple_Banana";

        char[] charArr = b.toCharArray();
        System.out.println("charArr: " + charArr);
//        for(int i = 0; i < charArr.length; i++) {
//            System.out.println(charArr[i]);
//        }

        String[] c = b.split("_");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }


        System.out.println(b.contains("apple"));
        System.out.println(b.contains("Apple"));

        String str2 = "Orange_Apple_Banana";
        String str3 = "orange_apple_banana";

        System.out.println(b.equals(str2));
        System.out.println(b.equals(str3));

        System.out.println(b.equalsIgnoreCase(str3));

        String abc = " abc d qwet ";
        System.out.println(abc);
        System.out.println(abc.trim());

        System.out.println(b.startsWith("Apple"));
        System.out.println(b.startsWith("Orange_"));
        System.out.println(b.endsWith("Orange"));
        System.out.println(b.endsWith("Apple"));
        System.out.println(b.endsWith("Apple_Banana"));

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("12345");

        System.out.println(sb1);
        System.out.println(sb2);

        sb1.append(12).append("sadasd").append(true);

        System.out.println(sb1);
        System.out.println(sb1.toString());




        char z = 'a';
        char w = 'b';

//        char n = z + w;
        System.out.println(w);

        System.out.println('a' + 'b');
        System.out.println(z + w);


        System.out.println("========================");
        String stra = "abcd";
        String strb = "ab" + "cd";

        System.out.println("== : =》" + (stra == strb));
        System.out.println("equals : =》" + (stra.equals(strb)));

        System.out.println("========================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("输入字符串a");

        String inputa = scanner.next();

        System.out.println("输入字符串b");

        String inputb = scanner.next();

        System.out.println("== : =》" + (inputa == inputb));
        System.out.println("equals : =》" + (inputa.equals(inputb)));


    }
}
