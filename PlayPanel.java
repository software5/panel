package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
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
	private JLabel[] words;
	private JPanel wordPanel = new JPanel();
	private JPanel hintPanel = new JPanel();
	private JLabel hintPic = new JLabel(new ImageIcon("img/hint.png"));
	private JLabel hint = new JLabel("Hint: a kind of color");// 需要自取
	private JPanel missPanel = new JPanel();
	private JLabel missPic = new JLabel(new ImageIcon("img/miss.png"));
	private JLabel miss = new JLabel("Missed letters: aed");
	// guessPanel包含输入的字母和Enter
	private JPanel guessPanel = new JPanel();
	private JLabel pre = new JLabel(new ImageIcon("img/guess.png"));
	private JTextField input = new JTextField(10);
	private JLabel enter = new JLabel(new ImageIcon("img/enter.png"));

	// 右边图片panel
	private JPanel rightPanel = new JPanel();
	private ImageIcon currentIcon = new ImageIcon("hang1.jpg");
	private JLabel currentPicture = new JLabel(currentIcon,
			SwingConstants.CENTER);
	// buttons包含两个按钮
	private JPanel buttons = new JPanel();
	private JLabel note = new JLabel();
	private JLabel exit = new JLabel();

	public PlayPanel(int round, int difficulty, int score, int coin) {
		// 接收信息
		this.round = round;
		this.difficulty = difficulty;
		this.score = score;
		this.coin = coin;
		String roundS = "round" + this.round;
		String difficultyS = toString(this.difficulty);
		String scoreS = "Score:" + this.score;
		String coinS = "Coins:" + this.coin;

		// 处理Panel
		setLocation(0, 0);
		setSize(736, 456);
		setBackground(new Color(255, 124, 129));
		setLayout(null);
		leftPanel.setBounds(10, 10, 370, 400);
		rightPanel.setBounds(420, 10, 300, 400);
		add(leftPanel);
		add(rightPanel);

		// 处理leftPanel
		leftPanel.setLayout(null);
		leftPanel.setBackground(new Color(255, 124, 129));

		// 处理infoPanel
		infoPanel.setBounds(0, 0, 370, 100);
		leftPanel.add(infoPanel);
		infoPanel.setLayout(new BorderLayout());
		infoPanel.setBackground(new Color(255, 124, 129));
		// 处理leftHeader
		JPanel leftHeader = new JPanel();
		leftHeader.setAlignmentY(0);
		leftHeader.setLayout(new GridLayout(1, 2, 15, 15));
		leftHeader.setBackground(new Color(255, 124, 129));
		roundL = new JLabel();
		roundL.setIcon(new ImageIcon("img/" + roundS + ".png"));
		difficultyL = new JLabel(new ImageIcon("img/" + difficultyS + ".png"));
		leftHeader.add(roundL);
		leftHeader.add(difficultyL);
		infoPanel.add(leftHeader, BorderLayout.WEST);
		// 处理rightHeader
		JPanel rightHeader = new JPanel();
		rightHeader.setLayout(new GridLayout(2, 1));
		rightHeader.setBackground(new Color(255, 124, 129));
		JPanel coinPanel = new JPanel();
		JPanel scorePanel = new JPanel();
		JLabel coinPic = new JLabel(new ImageIcon("img/coin.png"));
		JLabel scorePic = new JLabel(new ImageIcon("img/score.png"));
		coinL = new JLabel(coinS);
		scoreL = new JLabel(scoreS);
		coinPanel.add(coinPic);
		coinPanel.add(coinL);
		coinPanel.setBackground(new Color(255, 124, 129));
		scorePanel.add(scorePic);
		scorePanel.add(scoreL);
		scorePanel.setBackground(new Color(255, 124, 129));
		rightHeader.add(coinPanel);
		rightHeader.add(scorePanel);
		infoPanel.add(rightHeader, BorderLayout.EAST);

		// 处理gamePanel
		gamePanel.setBounds(0, 120, 370, 150);
		leftPanel.add(gamePanel);
		gamePanel.setBackground(new Color(255, 124, 129));
		gamePanel.setLayout(null);
		words = new JLabel[round + 2];// 第一关有三个字母
		wordPanel.setLayout(new FlowLayout());
		wordPanel.setBackground(new Color(255, 124, 129));
		for (int i = 0; i < words.length; i++) {
			words[i] = new JLabel(new ImageIcon("img/null.png"));
			wordPanel.add(words[i]);
		}
		wordPanel.setBounds(0, 0, 370, 50);
		gamePanel.add(wordPanel);
		hintPanel.add(hintPic);
		hintPanel.add(hint);
		hintPanel.setBackground(new Color(255, 124, 129));
		hintPanel.setBounds(0, 50, 370, 30);
		gamePanel.add(hintPanel);
		missPanel.add(missPic);
		missPanel.add(miss);
		missPanel.setBackground(new Color(255, 124, 129));
		missPanel.setBounds(0, 80, 370, 30);
		gamePanel.add(missPanel, BorderLayout.SOUTH);

		// 处理guessPanel
		guessPanel.setBounds(0, 300, 370, 120);
		leftPanel.add(guessPanel);
		guessPanel.setLayout(new FlowLayout());
		guessPanel.setBackground(new Color(255, 124, 129));
		guessPanel.add(pre);
		guessPanel.add(input);
		guessPanel.add(enter);

		// 处理rightPanel
		rightPanel.setLayout(null);
		rightPanel.setBackground(new Color(255, 124, 129));
		currentPicture.setBounds(0, 0, 300, 300);
		buttons.setBounds(0, 350, 300, 50);
		buttons.setBackground(new Color(255, 124, 129));
		rightPanel.add(currentPicture);
		rightPanel.add(buttons);
		buttons.setLayout(new GridLayout(1, 2, 20, 20));
		note.setIcon(new ImageIcon("img/help.png"));
		exit.setIcon(new ImageIcon("img/exit.png"));
		note.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		buttons.add(note);
		buttons.add(exit);

		actions();

	}

	private void actions() {
		// 点击游戏助手
		note.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("游戏助手");

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		// 点击保存并退出
		exit.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("保存并退出");

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		enter.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Enter");

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	private String toString(int difficulty) {
		switch (difficulty) {
		case 1:
			return "Easy";
		case 2:
			return "Normal";
		case 3:
			return "Hard";
		default:
			return null;
		}
	}

}
