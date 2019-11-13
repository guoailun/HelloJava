

/*游戏功能
• 猜数字:生成一个指定范围内的随机正整数，从命令行读取一个整数，如果和随机数相同，就 算猜中。
• 固定随机数的范围
• 支持每次猜数字游戏的猜测次数，在指定次数内没猜对，则猜数字失败，否则就是成功。
• 可以支持退出游戏
• 输出剩余的猜测次数
• 每次猜测后，如果未猜中，则提示本次猜测的数字比目标数字大还是小
• 游戏结束后，输出猜数字游戏的统计
• 没有猜中，要输出这次的目标数字
• 可以设置随机数的范围，可以设置最大猜测次数。
*/

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        // 用户输入随机数
        Scanner input = new Scanner(System.in);


        int rangeStart = 20;
        int rangeEnd = 80;
        int guessTotal = 5;

        // 游戏统计
        int totalGame = 0;
        int successTotal = 0;

        // 是否结束游戏
        boolean gameEnd = false;

        while (!gameEnd) {

            // 生成指定范围内的随机数
            int mod = rangeEnd - rangeStart;
            int bigNum = (int) (Math.random() * rangeEnd * 100);
            int guessNum = (bigNum % mod) + rangeStart;

            // 剩余的猜测次数
            int leftGuessTotal = guessTotal;

            // 查看是否进行一次有小猜测
            boolean gameCount = false;
            // 猜测的具体数字及 若猜测错误需要告知用户
            boolean correctGuess = false;

            System.out.println("请输入猜测的数字，范围在（" + rangeStart + "," + rangeEnd + "）之间，输入-1代表结束游戏");


            while (leftGuessTotal > 0) {
                System.out.println("剩余猜测次数：" + leftGuessTotal + "。请输入本次猜测数字：");

                int guess = input.nextInt();

                if (guess < 0) {
                    gameEnd = true;
                    System.out.println("用户选择结束游戏");
                    break;
                }

                if (!gameCount) {
                    totalGame++;
                    gameCount = true;
                }

                leftGuessTotal--;
                if (guess > guessNum) {
                    System.out.println("输入的数字比目标数字大！");
                } else if (guess < guessNum) {
                    System.out.println("输入的数字比目标数字小！");
                } else {
                    System.out.println("恭喜你成功了！！！棒");
                    successTotal++;
                    correctGuess = true;
                    break;
                }
            }

            if (!correctGuess) {
                System.out.println("本次的目标数字是：" + guessNum);
            }
            System.out.println("你共进行了" + totalGame + "次游戏，其中猜中的次数为：" + successTotal);
        }

    }
}