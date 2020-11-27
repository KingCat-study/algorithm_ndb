package array_string;

public class MyStringBuilderMain {

	public static void main(String[] args) {
		MyStringBuilder msb = new MyStringBuilder();
		
		System.out.println(msb.toString());
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.toString());
		
		MyStringBuilder2 msb2 = new MyStringBuilder2();
		
		msb2.append("11");
		msb2.append("22");
		msb2.append("33");
		msb2.append("44");
		
		System.out.println(msb2.toString());
	}
}
