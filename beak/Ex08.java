package beak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bufferedReader.readLine());
		if (t <= 1000000 && t > 0) {
			for (int i = 1; i <= t; i++) {
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
			    bufferedWriter.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()))+"\n");
			    
			}
		}
		bufferedReader.close();
		
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
