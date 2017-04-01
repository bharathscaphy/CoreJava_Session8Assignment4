public class ThreadCountPrint {

	public static void main(String[] args) {
		ChildThread threadC = new ChildThread();
		threadC.setName("Child Thread");
		threadC.start();

		try {
			while (threadC.isAlive()) {
				System.out
						.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread's run is over");
	}
}
