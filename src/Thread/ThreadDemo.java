package Thread;

class ThreadDemo{
	public static void main(String[] args) throws IllegalThreadStateException{
		MyThread t=new MyThread();
		t.start();
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main Thread");
		}
	}
}
