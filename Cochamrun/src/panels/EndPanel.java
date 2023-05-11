/*민영*/
package panels;

import java.awt.Color;

public class EndPanel extends Japanel {
	
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
		lblNewLabel_1 = new JLabel("SCORE");	
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 37));
		lblNewLabel_1.setBounds(451, 0, 205, 55);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 49));
		lblNewLabel_2.setBounds(313, 52, 459, 87);
		add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBackground(SystemColor.activeCaptionText);
		lblNewLabel.setIcon(new ImageIcon("img/end/cookierunbg.jpg"));
		lblNewLabel.setBounds(0, 0, 784, 461);
		add(lblNewLabel);
		
	}
	
}
