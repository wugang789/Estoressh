


public class StringBufferTest {
	public static void main(String[] args) {
		char[] y ={'s','d','a'};
		StringBuffer ss=new StringBuffer(5);
        	ss.append("s2211");
        	ss.setLength(40);
        System.out.println(ss.capacity()+">>>"+ss.length());
         ss.setCharAt(1,'d');
         System.out.println(ss);
         System.out.println(ss.charAt(2));
         System.out.println(ss.codePointAt(2));
       ss.getChars(0,2, y, 1);
      System.out.println(ss);
         
	}

}
