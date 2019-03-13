package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_4796_Camping {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 0;
		while(true) {
			i++;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			if(l == 0 && p == 0 && v == 0) break;
			int result = (v/p)*l;
			if((v%p) > l)
				result += l;
			else
				result += v%p;
			
			System.out.println("Case "+i+": "+result);
		}
		
	}
}
