package youtube.pack1;

public class Gener <T> {
	
	T p = null;
	
	public void add(T name) {
		p = name;
	}
	
	public void print() {
		System.out.println(p);
	}
	
	public T getValue() {
		
		return p;
	}
	
	
	public static void main(String[] args) {
		
		
		Gener<Integer> g = new Gener<>();
		g.add(10);
		g.add(20);
		
		g.print();
		
		System.out.println(g.getValue());
		
		
	}

}
