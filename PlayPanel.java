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
	// 传进来的参数
	private int round, difficulty, score, coin;

	// 左边游戏panel
	private JPanel leftPanel = new JPanel();
	private JPanel infoPanel = new JPanel();
	private JLabel roundL, difficultyL, scoreL, coinL;
	// gamePanel包含猜的字母、提示和猜错
	private JPanel gamePanel = new JPanel();
	private JLabel words = new JLabel("_,_,_");
	private JLabel hint = new JLabel("hint: a kind of color");
	private JLabel miss = new JLabel("miss: aed");
	// guessPanel包含输入的字母和Enter
	private JPanel guessPanel = new JPanel();
	private JLabel pre = new JLabel("I guess:");
	private JTextField input = new JTextField(10);
	private JButton enter = new JButton("Enter");

	// 右边图片panel
	private JPanel rightPanel = new JPanel();
	private ImageIcon currentIcon = new ImageIcon("hang1.jpg");
	private JLabel currentPicture = new JLabel(currentIcon,
			SwingConstants.CENTER);
	// buttons包含两个按钮
	private JPanel buttons = new JPanel();
	private JButton note = new JButton("游戏说明");
	private JButton exit = new JButton("保存并退出");

	public PlayPanel(int round, int difficulty, int score, int coin) {
		// 接收信息
		this.round = round;
		this.difficulty = difficulty;
		this.score = score;
		this.coin = coin;
		String roundS = "关卡" + this.round;
		String difficultyS = "难度：" + toString(this.difficulty);
		String scoreS = "分数：" + this.score;
		String coinS = "金币数：" + this.coin;

		// 处理Panel
		setLayout(new BorderLayout());
		add(leftPanel, BorderLayout.CENTER);
		add(rightPanel, BorderLayout.EAST);

		// 处理leftPanel
		leftPanel.setLayout(new BorderLayout());
		// 处理infoPanel
		leftPanel.add(infoPanel, BorderLayout.NORTH);
		infoPanel.setLayout(new BorderLayout());
		// 处理leftHeader
		JPanel leftHeader = new JPanel();
		leftHeader.setLayout(new GridLayout(1, 2));
		roundL = new JLabel(roundS);
		difficultyL = new JLabel(difficultyS);
		leftHeader.add(roundL);
		leftHeader.add(difficultyL);
		infoPanel.add(leftHeader, BorderLayout.WEST);
		// 处理rightHeader
		JPanel rightHeader = new JPanel();
		rightHeader.setLayout(new GridLayout(2, 1));
		scoreL = new JLabel(scoreS);
		coinL = new JLabel(coinS);
		rightHeader.add(scoreL);
		rightHeader.add(coinL);
		infoPanel.add(rightHeader, BorderLayout.EAST);
		// 处理gamePanel
		leftPanel.add(gamePanel, BorderLayout.CENTER);
		gamePanel.setLayout(new BorderLayout());
		gamePanel.add(words, BorderLayout.NORTH);
		gamePanel.add(hint, BorderLayout.CENTER);
		gamePanel.add(miss, BorderLayout.SOUTH);
		// 处理guessPanel
		leftPanel.add(guessPanel, BorderLayout.SOUTH);
		guessPanel.setLayout(new FlowLayout());
		guessPanel.add(pre);
		guessPanel.add(input);
		guessPanel.add(enter);

		// 处理rightPanel
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
			return "简单";
		case 2:
			return "中等";
		case 3:
			return "困难";
		default:
			return null;
		}
	}

}
