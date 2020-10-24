package stepbystep.eight;

public class Main_2869 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int v = 5;
		
		int p = (v-b) / (a-b);
		
		if((v-b) % (a-b) != 0) { //나머지가 0이 아니라는 얘기는 아직 올라가야할 거리가 남았다는 의미
			p++;
		}
		
		System.out.println(p);
	}
}
