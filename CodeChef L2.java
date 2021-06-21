/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        // while (sc.hasNext()) {
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0) {
                String[] s = sc.nextLine().split("\\s+");
                long D, d, p, q;
                D = Long.parseLong(s[0]);
                d = Long.parseLong(s[1]);
                p = Long.parseLong(s[2]);
                q = Long.parseLong(s[3]);
                long i = 0;
                long sum = 0;
                while (D > i) {
                    if (i > 0 && i % d == 0) {
                        p += q;
                    }
                    sum += p * d;
                    i = i * d;
                }
                System.out.println(sum);

            }
        // }
    }
}