package interviewquestions;

public class SingletonDemo {

	private volatile static SingletonDemo instance = null;
	private  volatile static int instanceCounter = 0;

	public static SingletonDemo getInstance() {
		synchronized (SingletonDemo.class) {
			if (instance == null) {
				instance = new SingletonDemo();
			}
		}
		instanceCounter = instanceCounter + 1;
		
		System.out.println(instanceCounter);
		System.out.println("Object returned");
		return instance;
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonDemo d = SingletonDemo.getInstance();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonDemo d2 = SingletonDemo.getInstance();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Objects are created..");
	}

}
