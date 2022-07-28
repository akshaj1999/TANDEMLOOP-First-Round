import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 


class Calculator {
        double a;
        double b;
        String opertator;
        Calculator(double a,double b,String opertator)
        {
            this.a = a;
            this.b = b;
            this.opertator = opertator;
        }
         double calculate()
        {
            switch(this.opertator)
            {
                case "+":
                  return this.a+this.b;
                case "-":
                  return this.a-this.b;
                case "*":
                   return this.a*this.b;
                case "/":
                    return this.a/this.b;
            }
            return -1;
        }
    }

// public
class Solution{

      public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        double a = Double.parseDouble(cin.nextLine());
        double b = Double.parseDouble(cin.nextLine());
        String opertator = cin.nextLine();
        Calculator cal = new Calculator(a,b,opertator);
        System.out.println(cal.calculate());
        
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
  
