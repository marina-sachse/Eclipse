package �bungen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAufgabe {

	public static void main(String[] args) {

		List<String> passwords = new ArrayList<>();
		passwords.add("admin");
		passwords.add("root");
		passwords.add("QWEqwe!!");
		passwords.add("QWEQWE!!12");
		passwords.add("QWEqwe12");
		passwords.add("QWEqwe12!");
		
		passwords.add("admin12");
		
		
		//1. Alles filtern was kein g�ltiges Passwort ist
		//- Mindestens 8 Zeichen lang
		//- Mindestens ein Gro�, klein-Buchstabe ein Sonderzeichen und eine Zahl
		//Die Zahlen aus dem Passwort holen und in einer List<Integer> speichern
		//Konsolenausgabe
		
		passwords.stream()
			.filter(value -> isValidPassword(value))
			.map(value ->extractDigits(value))
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
	
	
	private static boolean isValidPassword(String password) {
//		if(!(password.length() >=8)) {
//			return false;
//		}
//		if(!containsLowerLetter(password)) {
//			return false;
//		}
//		if(!containsUpperLetter(password)) {
//			return false;
//		}
//		if(!containsNumber(password)) {
//			return false;
//		}
//		if(!containsSpecialCharacter(password)) {
//			return false;
//		}
		if(
				!(password.length()>=8)  ||
				!containsLowerLetter(password) ||
				!containsUpperLetter(password) ||
				!containsNumber(password) ||
				!containsSpecialCharacter(password)
				)
		{
			return false;
		}
		return true;
	}
	
	private static boolean containsLowerLetter(String password) {
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if(Character.isLowerCase(c)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean containsUpperLetter(String password) {
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if(Character.isUpperCase(c)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean containsNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if(Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean containsSpecialCharacter(String password) {
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if(!Character.isLetterOrDigit(c)) {
				return true;
			}
		}
		return false;
	}
	
	private static int extractDigits(String value) {
		String s ="";
		for (int i = 0; i < value.length(); i++) {
			if(Character.isDigit(value.charAt(i))) {
				s += value.charAt(i);
			}
		}
		return Integer.parseInt(s);
	}
}
