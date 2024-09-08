import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1{
    int[] arr = new int[10];
    int[] rev = new int[10];
    void run(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>1000 && arr[i]<=0) {
                sc.close();
                break;
            }
        }
    }
    void remain(){
        run();
        for (int i = 0; i < rev.length; i++){
            rev[i] = arr[i]%42;
        }
    }
    void compare(){
        Set<Integer> set = new HashSet<>();
        for(int i : rev)
            set.add(i);
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.remain();
        ex1.compare();
    }
}
