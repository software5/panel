package panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PlayPanel extends JPanel {
	// �������Ĳ���
	private int round, difficulty, score, coin;

	// �����Ϸpanel
	private JPanel leftPanel = new JPanel();
	private JPanel infoPanel = new JPanel();
	private JLabel roundL, difficultyL, scoreL, coinL;
	// gamePanel�����µ���ĸ����ʾ�Ͳ´�
	private JPanel gamePanel = new JPanel();
	private JLabel words = new JLabel("_,_,_");
	private JLabel hint = new JLabel("hint: a kind of color");
	private JLabel miss = new JLabel("miss: aed");
	// guessPanel�����������ĸ��Enter
	private JPanel guessPanel = new JPanel();
	private JLabel pre = new JLabel("I guess:");
	private JTextField input = new JTextField(10);
	private JButton enter = new JButton("Enter");

	// �ұ�ͼƬpanel
	private JPanel rightPanel = new JPanel();
	private ImageIcon currentIcon = new ImageIcon("hang1.jpg");
	private JLabel currentPicture = new JLabel(currentIcon,
			SwingConstants.CENTER);
	// buttons����������ť
	private JPanel buttons = new JPanel();
	private JButton note = new JButton("��Ϸ˵��");
	private JButton exit = new JButton("���沢�˳�");

	public PlayPanel(int round, int difficulty, int score, int coin) {
		// ������Ϣ
		this.round = round;
		this.difficulty = difficulty;
		this.score = score;
		this.coin = coin;
		String roundS = "�ؿ�" + this.round;
		String difficultyS = "�Ѷȣ�" + toString(this.difficulty);
		String scoreS = "������" + this.score;
		String coinS = "�������" + this.coin;

		// ����Panel
		setLayout(new BorderLayout());
		add(leftPanel, BorderLayout.CENTER);
		add(rightPanel, BorderLayout.EAST);

		// ����leftPanel
		leftPanel.setLayout(new BorderLayout());
		// ����infoPanel
		leftPanel.add(infoPanel, BorderLayout.NORTH);
		infoPanel.setLayout(new BorderLayout());
		// ����leftHeader
		JPanel leftHeader = new JPanel();
		leftHeader.setLayout(new GridLayout(1, 2));
		roundL = new JLabel(roundS);
		difficultyL = new JLabel(difficultyS);
		leftHeader.add(roundL);
		leftHeader.add(difficultyL);
		infoPanel.add(leftHeader, BorderLayout.WEST);
		// ����rightHeader
		JPanel rightHeader = new JPanel();
		rightHeader.setLayout(new GridLayout(2, 1));
		scoreL = new JLabel(scoreS);
		coinL = new JLabel(coinS);
		rightHeader.add(scoreL);
		rightHeader.add(coinL);
		infoPanel.add(rightHeader, BorderLayout.EAST);
		// ����gamePanel
		leftPanel.add(gamePanel, BorderLayout.CENTER);
		gamePanel.setLayout(new BorderLayout());
		gamePanel.add(words, BorderLayout.NORTH);
		gamePanel.add(hint, BorderLayout.CENTER);
		gamePanel.add(miss, BorderLayout.SOUTH);
		// ����guessPanel
		leftPanel.add(guessPanel, BorderLayout.SOUTH);
		guessPanel.setLayout(new FlowLayout());
		guessPanel.add(pre);
		guessPanel.add(input);
		guessPanel.add(enter);

		// ����rightPanel
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(currentPicture, BorderLayout.CENTER);
		rightPanel.add(buttons, BorderLayout.SOUTH);
		buttons.setLayout(new GridLayout(1, 2));
		buttons.add(note);
		buttons.add(exit);

	}

	private String toString(int difficulty) {
		switch (difficulty) {
		case 1:
			return "��";
		case 2:
			return "�е�";
		case 3:
			return "����";
		default:
			return null;
		}
	}

}
