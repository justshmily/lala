package sort;
 
import java.util.Arrays;
/*
 * 将数字 1 - n进行全排列  按字典序从小到大输出
 */
class GenerateP{
     
    private int n;  //  求 1-n所有数字的全排列
    private boolean [] hashTable;
    private int [] p;
     
    public GenerateP(int n) {
        this.n = n;
        hashTable = new boolean[n+1];
        p = new int [n+1];
        Arrays.fill(hashTable, false);
        Arrays.fill(p, 0);
        generatep(1);
    }
    public void generatep(int index){
        if(index == n + 1){
            for(int i = 1; i <= n; i++){
                System.out.print(p[i]);
            }
            System.out.println();
            return;
        }
         
        for(int x = 1; x <= n; x++){
            if(hashTable[x] == false){
                p[index] = x;
                hashTable[x] = true;
                generatep(index + 1);
                hashTable[x] = false;
            }
        }
    }
}
public class Permutation1 {
 
    public static void main(String[] args) {
        GenerateP generateP = new GenerateP(6);
    }
 
}
