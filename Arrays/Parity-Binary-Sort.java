import java.util.*;

class TestClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            for (int i = 0; i < n; i++) {
              
                arr[i] = sc.nextInt();
                int bits = Integer.bitCount(arr[i]);

                if (bits % 2 == 0)
                    even.add(arr[i]);
                else
                    odd.add(arr[i]);
            }

            Collections.sort(even);
            Collections.sort(odd);

            for (int x : even)
                System.out.print(x + " ");

            for (int x : odd)
                System.out.print(x + " ");

            System.out.println();
        }

        sc.close();
    }
}
