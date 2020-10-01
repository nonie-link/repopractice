package youtube.pack1;

public class Threadings implements Runnable {
	
	int a=2;
	PrintName name;
	
	Threadings(String name) {
		this.name = new PrintName(name);
	}
	public void run() {
		
		for(int i = 1; i <=5; i++) {
			name.printName();
		}
		
	}
	
	public static void main(String [] args) {
		
		Threadings th = new Threadings("himun");
		Threadings th1 = new Threadings("jaisal");
		
		Thread thd = new Thread(th);
		Thread the = new Thread(th1);
		
		thd.start();
		the.start();
		
	}

}
