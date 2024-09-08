import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Manager {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Integer> hmap = new HashMap<>();
    private void run(){
        while (true){
            System.out.print("이름과 포인트 입력>> ");
            String name = scanner.next();
            if(name.equals("그만"))
                break;
            int point = scanner.nextInt();

            Integer n = hmap.get(name);
            if(n != null) {
                point += n;
            }

            hmap.put(name, point);

            Set<String> keys = hmap.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext()) {
                name = it.next();
                point = hmap.get(name);
                System.out.print("("+name+","+point+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("** 포인트 관리 프로그램입니다 **");
        Manager manager = new Manager();
        manager.run();
    }
}
