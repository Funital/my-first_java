import java.util.ArrayList;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for (int i = 0 ; i < 6; i++){
            String s = scanner.next();
            if (s.length()>1){
                System.out.println("올바른 입력이 아닙니다.");
                scanner.close();
                return;
            }
            char ch = s.charAt(0);
            if((ch >= 'A' && ch <= 'D') || ch == 'F')
                al.add(ch);
            else {
                System.out.println("올바른 입력이 아닙니다.");
                scanner.close();
                return;
            }
        }

        double score=0.0;
        for (char ch : al) {
            switch (ch) {
                case 'A':
                    score += 4.0;
                    break;
                case 'B':
                    score += 3.0;
                    break;
                case 'C':
                    score += 2.0;
                    break;
                case 'D':
                    score += 1.0;
                    break;
                case 'F':
                    score += 0.0;
                    break;
            }
        }
        System.out.print(score/al.size());
        scanner.close();
    }
}
