import java.io.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            long m = Long.parseLong(br.readLine());

            if (m <= 2){
                System.out.println(2);
                continue;
            }

            while (true){
                boolean b = true;

                for (int j = 2; j < Math.sqrt(m)+1; j++){
                    if (m % j == 0){
                        b = false;
                        break;
                    }
                }
                if (b){
                    System.out.println(m);
                    break;
                }
                m++;
            }
        }
    }
}
