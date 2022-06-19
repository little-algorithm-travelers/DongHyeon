import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2869_달팽이는_올라가고_싶다 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());   // 올라가는 높이
        int B = Integer.parseInt(st.nextToken());   // 내려가는 높이
        int V = Integer.parseInt(st.nextToken());   // 나무 막대의 높이
        
        int result = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0)
            result++;
        
        System.out.println(result);
    }
}