package timer_Ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import timer_Ex.Task2;

class Task1 extends TimerTask{
	private int i = 0;
	@Override
	public void run() {
		i = i + 1;
		System.out.println("계란 삶는 중" + i);		
	}	
}

class Task2 implements Runnable {
	@Override
	public void run() { // Runnable의 추상메소드를 구현(완성)한다.
		// 할일의 코드를 적는다.
		JOptionPane.showMessageDialog(null,"계란 삶기 완료");
	}
}
public class App {

	public static void main(String[] args) {
		// 1. 5초 간격 타이머 "계란 삶는 중"
		// 2. 30초 간격 타이머 "계란 삶기 완료"
		
		// 타이머 1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 5000L, 5000L);
		
		// 타이머 2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);		
		executor.scheduleAtFixedRate(new Task2(), 0, 30, TimeUnit.SECONDS);
		
		
		
		

	}

}
