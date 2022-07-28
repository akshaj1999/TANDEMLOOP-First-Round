import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 



// public
class Solution{

      public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int a = cin.nextInt();
        long num = 1;
        for(int i=1;i<=a;i++,num+=2)
        {
            if(i==a)
            {
                System.out.print(num);
            }
            else
            System.out.print(num+", ");

        }
    }
        
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
 
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
 
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
 
            return tokenizer.nextToken("\n");
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
         
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
  }
  
