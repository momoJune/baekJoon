package green.kr.ca.Hello;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex21 {
	public static void main(String[] args) {
		HashSet<Integer> self = new HashSet<Integer>();
		
		for(int i =1; i<=10000;i++) {
			self.add(i);
		}
		for(int i =1; i<=10000;i++) {
			if(self.contains(d(i))){
				self.remove(d(i));
			}
		}
		Iterator<Integer> iter = self.iterator();
		while(iter.hasNext())System.out.println(iter.next());
	}


	static int d(int n) {
		int sum = 0;
		sum += n;
		String str = n + "";
		for (char chr : str.toCharArray()) {
			sum += chr - '0';
		}
		return sum;
	}

}
