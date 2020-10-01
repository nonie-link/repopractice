package youtube.pack1;

interface T {
	int a = 0;
	public void print();
}

public class Anyomousclass {
	
	public static void main(String[] args) {
		
		T t = new T() {
			
			int a = 10;
			
			public void print() {
				System.out.println(a);
			}
			
		};
		
		t.print();
		
		
	}

}
