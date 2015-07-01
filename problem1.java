import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


class TestClass {
    public static void main(String args[] ) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        ArrayList <Integer> vamp = new ArrayList<Integer>();
        ArrayList <Integer> zombie = new ArrayList<Integer>();
        String [] numb = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            Integer power = Integer.parseInt(numb[i]);
            if (power%2 == 0){
                zombie.add(power);
            }
            
            else{
                vamp.add(power);
            }
        }
        Collections.sort(vamp);
        Collections.sort(zombie);
        
        Integer zombiePower = 0;
        for (Integer j:zombie){
            System.out.print(j+" ");
            zombiePower +=j;
        }
        System.out.print(zombiePower+" ");
        
        Integer vampPower = 0;
        for (Integer k:vamp){
            System.out.print(k+" ");
            vampPower +=k;
        }
        System.out.print(vampPower);

        
    }
}
