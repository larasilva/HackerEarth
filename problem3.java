import java.io.BufferedReader;
import java.io.InputStreamReader;



import java.io.BufferedReader;
import java.io.InputStreamReader;



class TestClass {
    public static void main(String args[] ) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String discard = br.readLine();
            int [] numbers = getNumberArray(br.readLine());
            System.out.println(getPairs(numbers)); 
        }

        
    }
    
    public static int[] getNumberArray(String list){
        String [] numbers = list.split(" ");
        int [] result = new int[numbers.length];
        for (int i = 0; i<numbers.length; i++){
            result [i] = Integer.parseInt(numbers[i]);
        }
        
        return result;
    }
    
    public static int getPairs(int [] numbers){
        int result = 0;
        for (int i = 0; i<=numbers.length; i++){
            for (int j = i+1; j<numbers.length; j++){
                
                if ((numbers[i]+numbers[j])%2==0 && numbers[i]!=numbers[j]){
                    
                    result+=1;
                }
            }
        }
        return result;
    }
    
}
