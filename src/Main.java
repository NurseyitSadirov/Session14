import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Centers[] center = Centers.values();
        for (Centers centers : center) {
            System.out.println("~~~~~~~~~~~~~~~~~");
            System.out.println(centers);
            System.out.println(centers.getCountry());

        }

    }
}