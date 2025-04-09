import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        System.out.print("입력하세요: ");
        String input = scanner.nextLine(); // 사용자 입력 받기
        System.out.println("입력한 내용: " + input);
    }
}
