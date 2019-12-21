package app;

 import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class App {
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    public static void main(String[] args) throws Exception {
        FastReader input = new FastReader();

        String reflection = input.nextLine();
        ArrayList<Integer> grid = new ArrayList<Integer>();
        grid.add(0, 1);
        grid.add(1, 2);
        grid.add(2, 3);
        grid.add(3, 4);

        int n = 0;
        while(n < reflection.length()){
            //inputs.add(Character.toString(reflection.charAt(n)));

            if(reflection.charAt(n) == 'V'){
              Collections.swap(grid, 0, 2);
              Collections.swap(grid, 1, 3); 

            }
            if(reflection.charAt(n) == 'H'){
                Collections.swap(grid, 0, 1);
              Collections.swap(grid, 2, 3);
   
               

            }
            n++;
        }

        System.out.println(grid.get(0)+ " " + grid.get(1) + "\n" +
        grid.get(2)+ " " + grid.get(3));

    }
}
