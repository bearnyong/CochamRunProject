/*민영*/
package panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EndPanel extends JPanel {
	
	ImageIcon btn = new ImageIcon("img/end/button.png");
	JButton btnNewButton;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel;
	
	private int resultScore;
	
	public void setResultScore(int resultScore) {
		lblNewLabel_2.setText(resultScore+"");
	}
	
	public EndPanel(Object o) {
		/* 버튼 */
		btnNewButton = new JButton(btn);
		btnNewButton.setName("endAccept");
		btnNewButton.addMouseListener((MouseListener) o);
		btnNewButton.setBounds(550, 370, 199, 81);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		add(btnNewButton);
		
		/* 점수 글자 */
		/* (수정) SCORE(문자) 위치 변경*/
		lblNewLabel_1 = new JLabel("SCORE :-)");	
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(Color.white); //(수정)폰트 색 화이트로 변경
		lblNewLabel_1.setBounds(515, 50, 205, 55);
		add(lblNewLabel_1);
		
		/* (수정) SCORE(숫자) 위치 및 폰트 변경*/
		lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 37));
		lblNewLabel_2.setForeground(Color.white); //(수정)폰트 색 화이트로 변경
		lblNewLabel_2.setBounds(385, 73, 459, 87);
		add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBackground(SystemColor.activeCaptionText);
		lblNewLabel.setIcon(new ImageIcon("img/end/cookierunbg.jpg"));
		lblNewLabel.setBounds(0, 0, 784, 461);
		add(lblNewLabel);
		
	}
	
}
