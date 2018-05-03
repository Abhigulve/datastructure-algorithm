package permutation.deshaw;

import java.io.*;

class Shaw {
    static final int M = 1000000007;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int n;

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int i, j;
            int ar[] = new int[n];
            for (i = 0; i < n; i++)
                ar[i] = Integer.parseInt(s[i]);

            long ans = 0, k;
            int val = 1;
            for (i = 0; i < 32; i++, val <<= 1) {
                int c = 0;
                for (j = 0; j < n; j++) {
                    if ((ar[j] & val) != 0)
                        c++;
                }
                k = (pow(2, c) - 1) % M;
                ans += ((val) * k) % M;
            }
            bw.write((ans % M) + "\n");
        }
        bw.flush();
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b != 0) {
            if ((b & 1) != 0)
                res = (res * a) % M;
            a = (a * a) % M;
            b >>= 1;
        }
        return res % M;
    }
}