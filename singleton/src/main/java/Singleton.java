/**
 * 下午1:47 2020/4/1
 * Created By CC.Z
 * Version:1.0.
 */
public class Singleton {
	private static  volatile  Singleton singleton;

	private Singleton() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 懒汉模式
	 * @return
	 */
	public static Singleton getSingleton() {


		if (singleton == null) {
			//减少同步代码快
			synchronized (Singleton.class) {
				//防止多个线程
				if( singleton == null){
					singleton = new Singleton();
				}
			}
		}

		return singleton;
	}

	public static void main(String[] args) {
		//Singleton singleton1 = Singleton.getSingleton();
		//Singleton singleton2 = Singleton.getSingleton();

		/**
		 * 多线程环境下　方式不适用 我们加　synchronized同步锁
		 */
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				Singleton singleton2 = Singleton.getSingleton();
				System.out.println(singleton2);

			}).start();
		}


	}
}

