import java.util.*;

class Location{
    private String city;
    private int longitude;
    private int latitude;

    public Location(String city, int longitude, int latitude) {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public String getCity() {
        return city;
    }
    public int getLongitude() {
        return longitude;
    }
    public int getLatitude() {
        return latitude;
    }
}

public class LocationEx {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Location> local = new HashMap<>();

    private void read() {
        System.out.println("도시,경도,위도를 입력하세요.");
        for (int i=0; i<4; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String city = st.nextToken().trim();
            int longitude = Integer.parseInt(st.nextToken().trim());
            int latitude = Integer.parseInt(st.nextToken().trim());

            Location location = new Location(city, longitude, latitude);
            local.put(city, location);
        }
    }

    private void print() {
        Set<String> key = local.keySet();
        Iterator<String> it = key.iterator();
        System.out.println("---------------------------");
        while (it.hasNext()) {
            String city = it.next();
            Location loc = local.get(city);

            System.out.print(loc.getCity() + ", ");
            System.out.print(loc.getLongitude() + ", ");
            System.out.println(loc.getLatitude());
        }
        System.out.println("---------------------------");
    }
    private void printCity() {
        while(true) {
            System.out.print("도시 이름 >> ");
            String city = scanner.nextLine();
            if(city.equals("그만"))
                return;

            Location loc = local.get(city);
            if(loc == null) {
                System.out.println(city + "는 없습니다.");
            }
            else {
                System.out.print(loc.getCity()  + "\t");
                System.out.print(loc.getLongitude() + "\t");
                System.out.println(loc.getLatitude());
            }
        }
    }
    public static void main(String[] args) {
        LocationEx locationEx = new LocationEx();
        locationEx.read();
        locationEx.print();
        locationEx.printCity();
    }
}
