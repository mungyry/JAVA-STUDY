package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	public MainFrame(String title) { // 생성자
		super(title); // 창의 이름을 넣어서 생성
		// 패널 넣기
		// 먼저 레이아웃 설정
		setLayout(new BorderLayout()); // 창에 컴포넌트를 붙이기 위한 레이아웃 설정
		

		final MainPanel mainPanel = new MainPanel();
		// mainPanel.setBackground(Color.cyan);
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH); // 위에서 만든 패널을 레이아웃의 가 운데
		add(mainPanel, BorderLayout.CENTER); // 위에서 만든 패널을 레이아웃의 가 운데
		
		setSize(600,400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
	