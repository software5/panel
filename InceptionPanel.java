package panel;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class InceptionPanel extends JPanel {

	private JButton start = new JButton("新建游戏");
	private JButton resume = new JButton("继续游戏");
	private JButton rank = new JButton("游戏排行");
	private JButton setting = new JButton("游戏设置");
	private JButton exit = new JButton("退出游戏");

	public InceptionPanel() {
		setLayout(new FlowLayout());
		add(start);
		add(resume);
		add(rank);
		add(setting);
		add(exit);

	}
}
