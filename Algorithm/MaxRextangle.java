import java.util.*;
public class Main { 
    public static void main(String[] args) {
        new Main().run();
    }
    public void run() { 
        Scanner fin = new Scanner(System.in);
        
        // ‰»Î
        int N = fin.nextInt();
        int[] height = new int[N];
        for (int i = 0; i < N; ++i) height[i] = fin.nextInt();
        
        int result = 0;
        for (int i = 0; i < N; ++i) {
            int width = 1;
            for (int j = i -1; j >= 0; --j) {
                if (height[j] < height[i]) break;
                ++width;
            }
            for (int j = i + 1; j < N; ++j) {
                if (height[j] < height[i]) break;
                ++width;
            }
            int area = width * height[i];
            result = Math.max(result, area);
        }
        System.out.println(result); 
    }
} 