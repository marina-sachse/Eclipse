package Übungen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WörterZählen {

	public static void main(String[] args) {
		int i = 1;
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> t = new HashMap<>();
		System.out.println("gib ein Wort ein");
		while (scan.hasNext()) {
			String s = (String) scan.next();
			if(t.containsKey(s) != true){
				t.put(s, i);
			}
			else{
				t.put(s, t.get(s)+1);
			}
			if(s.equals("exit")){
				break;
			}
		}
		t.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));
		
	}

}
