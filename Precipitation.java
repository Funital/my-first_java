import java.util.Scanner;
import java.util.Vector;

public class Precipitation {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int amount = scanner.nextInt();
            if(amount == 0)
                break;
            vc.add(amount);

            int sum = 0;
            for (int n : vc) {
                System.out.print(n + " ");
                sum += n;
            }
            System.out.println();
            System.out.println("현재 평균 " + sum/vc.size());
        }
    }
}
