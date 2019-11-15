package AI;

import java.util.Scanner;

public class RunAi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TestAl ai = new TestAl();

        while (true) {
            String input = scanner.next();
            if ("exit".equals(input)) {
                System.out.println("再见！");
                break;
            }

            String answer = ai.answer(input);
            System.out.println(answer);
        }
    }
}
