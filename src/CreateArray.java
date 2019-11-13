public class CreateArray {
    public static void main(String[] args) {
        int[] intArr = new int[9];

        System.out.println(intArr[1]);

        double[] doubleArray = new double[100];

        System.out.println(doubleArray[10]);

        String[] stringArr = new String[5];

        System.out.println(stringArr[2]);

        char[] charArr = new char[5];
        System.out.println(charArr[2]);


        int a = 0;
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        int[] arr2 = new int[3];
        arr2[0] = 4;
        arr2[1] = 5;
        arr2[2] = 6;

        int[] newArr = new int[3];

        while (a<3) {
            switch (a) {
                case 0:
                    newArr = arr1;a++;break;
                case 1:
                    newArr = arr2;a++;break;
                default: newArr = new int[3];a++;break;
            }
            System.out.println(newArr[0]);
        }
        System.out.println("最终结果" + newArr[0] + arr1[0] + arr2[0]);


    }
}
