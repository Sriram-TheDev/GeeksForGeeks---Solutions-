import java.util.*;

class TestClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String village = sc.next();

        if (village.contains("HH")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            village = village.replace('.', 'B');
            System.out.println(village);
        }

        sc.close();
    }
}
