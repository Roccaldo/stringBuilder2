public class Main {
	public static void main(String[] args) {

		checkUnicode("buongiorno", 5);
	}
	public static void checkUnicode(String frase, int numb){
		System.out.println(frase.codePointAt(numb));
	}
}
