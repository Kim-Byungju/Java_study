package Ex;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("카운트 다운 숫자를 입력하세요: ");
        int count = scanner.nextInt();

        for (int i = count; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("타이머 종료!");
    }
}