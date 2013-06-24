
public class ss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ss="mkfile 123.cpp";
	String[] s=ss.split("\\s|\\.");
	for (int i = 0; i < s.length; i++) {
		String string = s[i];
		System.out.println(string);
		
	}
	
	}

}
