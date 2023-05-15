/*민영*/
package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ingame.CookieImg;
import panels.EndPanel;
import panels.GamePanel;
import panels.IntroPanel;
import panels.SelectPanel;
import main.listenAdapter;

import java.awt.CardLayout;

public class Main extends listenAdapter {
	
	/* 창을 띄우기 위한 프레임 */
	private JFrame frame;
	
	/* 인트로 */
	private IntroPanel introPanel;
	
	/* 캐릭터 선택 */
	private SelectPanel selectPanel;
	
	/* 게임 진행 */
	private GamePanel gamePanel;
	
	/* 게임 결과 */
	private EndPanel endPanel;
	
	/* 카드 레이아웃 오브젝트 */
	private CardLayout cl;
	
	/* 쿠키 이미지 */
	private CookieImg ci;
	
	/**/
	public GamePanel getGamePanel() {
		return gamePanel;
	}
	
	/**/
	public void setGamePanel(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	/**/
	public EndPanel getEndPanel() {
		return endPanel;
	}
	
	
	
	/* 프로그램 시작 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**/
	public Main() {
		initialize();
	}
	
	/**/
	private void initialize() {
		frame = new JFrame();
		
		/* 아래 코드(.setLocationRelativeTo)로 인해 창 사이즈 800,500은 의미가 없어진다.*/
		frame.setBounds(100, 100, 800, 500);
		
		/* 창을 화면 중앙에 배치 */
		frame.setLocationRelativeTo(null);
		
		/* 엑스 버튼을 누르면 종료 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* 카드레이아웃 객체 생성 */
		cl = new CardLayout(0,0);
		
		/* 프레임을 카드 레이아웃으로 변경*/
		frame.getContentPane().setLayout(cl);
		
		/* 마우스 리스너를 추가 */
		introPanel = new IntroPanel();
		introPanel.addMouseListener(this);
		
		/* Main의 리스너를 넣기 위한 this */
		selectPanel = new SelectPanel(this);
		
		/* Main의 프레임 및 카드레이아웃을 이용하고 리스너를 넣기 위한 this*/
		gamePanel = new GamePanel(frame, cl, this);
		
		/* Main의 리스너를 넣기 위한 this */
		endPanel = new EndPanel(this);
		
		/* 모든 패널의 레이아웃을 null로 변환 */
		introPanel.setLayout(null);
		selectPanel.setLayout(null);
		gamePanel.setLayout(null);
		endPanel.setLayout(null);
		
		/* 카드 레이아웃을 위한 패널들을 프레임에 추가한다.*/
		frame.getContentPane().add(introPanel, "intro");
		frame.getContentPane().add(selectPanel, "select");
		frame.getContentPane().add(gamePanel, "game");
		frame.getContentPane().add(endPanel, "end");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		/* (시작 인트로 화면 이미지) IntroPanel에서 마우스를 눌렀다면*/
		if(e.getComponent().toString().contains("IntroPanel")) {
			try {
				Thread.sleep(300);
			} catch(InterruptedException el) {
				el.printStackTrace();
			}
		
		/* select 패널을 카드 레이아웃 최상단으로 변경*/
		cl.show(frame.getContentPane(), "select");
		
		/* 리스너를 select 패널에 강제로 줌*/
		selectPanel.requestFocus();
		
	  /* StartBtn이라는 이름을 가진 버튼을 마우스로 눌렀다면*/
	} else if(e.getComponent().getName().equals("StartBtn")) {
		
		/* 캐릭터를 고르지 않았을 경우 "골라주세요" 팝업창 */
		if(selectPanel.getCi() == null) {
			JOptionPane.showMessageDialog(null, "캐릭터를 골라주세요");
		} else {
			
			/* 캐릭터를 골랐을 경우 게임 패널을 카드 레이아웃 최상단으로 변경*/
			cl.show(frame.getContentPane(), "game"); 
			
			/* 쿠키이미지를 넘겨주고 게임패널 세팅 */ 
			gamePanel.gameSet(selectPanel.getCi()); 
			
			/* 게임 시작 */
			gamePanel.gameStart();
			
			/* 리스너를 game패널에 강제로 줌 */
			gamePanel.requestFocus();
		}
		
		
	  /* endAccept 이라는 이름을 가진 버튼을 눌렀다면 */
	} else if (e.getComponent().getName().equals("endAccept")) { 
		
		/* 방금 했던 게임 패널을 프레임에서 삭제 */
		frame.getContentPane().remove(gamePanel); 
		
		/* 게임패널을 새 패널로 교체 */
		gamePanel = new GamePanel(frame, cl, this); 
		gamePanel.setLayout(null);
		
		/* 카드레이아웃 하단 프레임에 새 게임패널 추가 */
		frame.getContentPane().add(gamePanel, "game"); 
		
		/* 방금 선택했던 select패널을 삭제 */
		frame.getContentPane().remove(selectPanel);
		
		/* select 패널을 새 패널로 교체 */
		selectPanel = new SelectPanel(this); 
		selectPanel.setLayout(null);
		
		/* 카드레이아웃 하단 프레임에 새 select패널 추가 */
		frame.getContentPane().add(selectPanel, "select");
		
		/* 새 select패널을 카드레이아웃 최상단으로 이동 (화면에 보임) */ 
		cl.show(frame.getContentPane(), "select"); 
		
		/* 리스너를 select패널에 강제로 줌 */ 
		selectPanel.requestFocus(); 
	}
}

}
