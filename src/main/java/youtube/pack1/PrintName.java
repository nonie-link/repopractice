package youtube.pack1;

public class PrintName {
	
	String name;
	
	PrintName(String name) {
		this.name = name;
	}
	
	public synchronized void printName() {
		System.out.println(name);
	}

}
