package local_InnerClass;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private String name; // 인스턴스 변수
	
	public App() {
		name = "엘리자베스";
	}
	
	public static void main(String[] args) {
		App app = new App();
//		app.name = "펭수";
		app.run();
	}

	private void run() {
		// 클래스 안의 메소드에 클래스
//		System.out.println(name);
		class Printer implements Runnable{

			@Override
			public void run() {				
				System.out.println(name);
			}
			
		}
//		Printer p = new Printer();
//		p.print();
//		new Printer().print();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		}, 0L, 1L, TimeUnit.SECONDS);
	}
	}
