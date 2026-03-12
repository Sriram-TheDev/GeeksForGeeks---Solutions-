import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
          
            int n = Integer.parseInt(br.readLine());
            String[] parts = br.readLine().split(" ");
            int[] arr = new int[n];
          
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(parts[i]);

            int[] prefix = new int[n];
            int[] suffix = new int[n];

            prefix[0] = arr[0];
            for (int i = 1; i < n; i++)
                prefix[i] = prefix[i - 1] | arr[i];

            suffix[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--)
                suffix[i] = suffix[i + 1] | arr[i];

            int minLen = Integer.MAX_VALUE;
            int count = 0;

            for (int i = 0; i < n; i++) {
                int insideOR = 0;

                for (int j = i; j < n; j++) {
                    insideOR |= arr[j];
                    int outsideOR = 0;

                    if (i > 0)
                        outsideOR |= prefix[i - 1];
                    if (j < n - 1)
                        outsideOR |= suffix[j + 1];
                    if (insideOR == outsideOR) {
                        int len = j - i + 1;
                        if (len < minLen) {
                            minLen = len;
                            count = 1;
                        } 
                        else if (len == minLen) {
                            count++;
                        }
                    }
                }
            }

            if (count == 0)
                System.out.println(-1);
            else
                System.out.println(minLen + " " + count);
        }
    }
}
