public class ChildThread extends Thread {

	public ChildThread(){
		System.out.println("my thread created " + this);
	}
	
	@Override
	public void run() {
		super.run();
		for (int count = 1; count <= 10; count++) {
			System.out.println("Printing the count " + count);
			try {
				Thread.sleep(1000);


			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Child thread's run is over");
	}

}
