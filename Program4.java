import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 



// public
class Solution{

      public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int a = cin.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++)
            arr[i] = cin.nextInt();
        
        int ans[] = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i];
            for(int j=1;j<10;j++)
            {
                if(num%j==0)
                    ans[j]++;
            }
        }

        for(int j=1;j<10;j++)
            {
                System.out.println(j+": "+ans[j]);
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
  
