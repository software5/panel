package panel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class InceptionPanel extends JPanel {

	private JTabbedPane tabs = new JTabbedPane();
	private JPanel gamePanel = new JPanel();
	private JPanel explainPanel = new JPanel();
	private JLabel start = new JLabel(new ImageIcon("img/start.png"));
	private JLabel resume = new JLabel(new ImageIcon("img/resume.png"));
	private JLabel rank = new JLabel(new ImageIcon("img/rank.png"));
	private JLabel setting = new JLabel(new ImageIcon("img/set.png"));
	private JLabel exit = new JLabel(new ImageIcon("img/out.png"));
	private JLabel background = new JLabel();
	private Icon picture = new ImageIcon("img/yellowHang2.jpg");

	public InceptionPanel() {
		// 自定义位置所以没有layout
		setLayout(null);
		add(tabs);
		add(background);

		// 添加背景
		background.setLayout(null);
		background.setLocation(338, 0);
		background.setSize(398, 456);
		background.setIcon(picture);

		// 添加TabbedPane
		tabs.setBounds(0, 0, 338, 419);
		tabs.add("游戏", gamePanel);
		tabs.add("说明", explainPanel);

		// 在gamePanel上添加按钮
		gamePanel.setLayout(null);
		start.setBounds(120, 50, 100, 30);
		resume.setBounds(120, 100, 100, 30);
		rank.setBounds(120, 150, 100, 30);
		setting.setBounds(120, 200, 100, 30);
		exit.setBounds(120, 250, 100, 30);

		gamePanel.add(start);
		gamePanel.add(resume);
		gamePanel.add(rank);
		gamePanel.add(setting);
		gamePanel.add(exit);

	}

	public JLabel getStart() {
		return start;
	}

	public void setStart(JLabel start) {
		this.start = start;
	}

	public JLabel getResume() {
		return resume;
	}

	public void setResume(JLabel resume) {
		this.resume = resume;
	}

	public JLabel getRank() {
		return rank;
	}

	public void setRank(JLabel rank) {
		this.rank = rank;
	}

	public JLabel getSetting() {
		return setting;
	}

	public void setSetting(JLabel setting) {
		this.setting = setting;
	}

	public JLabel getExit() {
		return exit;
	}

	public void setExit(JLabel exit) {
		this.exit = exit;
	}
}
