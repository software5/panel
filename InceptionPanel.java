package panel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InceptionPanel extends JPanel {

	private JButton start = new JButton("新建游戏");
	private JButton resume = new JButton("继续游戏");
	private JButton rank = new JButton("游戏排行");
	private JButton setting = new JButton("游戏设置");
	private JButton exit = new JButton("退出游戏");
	private JLabel background = new JLabel();
	private Icon picture = new ImageIcon("yellowHang.jpg");

	public InceptionPanel() {
		// 自定义位置所以没有layout
		setLayout(null);

		// 添加背景
		background.setLayout(null);
		background.setLocation(0, 0);
		background.setSize(736, 456);
		background.setIcon(picture);
		add(background);

		// 在背景上添加按钮
		start.setBounds(50, 100, 100, 30);
		resume.setBounds(190, 100, 100, 30);
		rank.setBounds(50, 150, 100, 30);
		setting.setBounds(190, 150, 100, 30);
		exit.setBounds(120, 200, 100, 30);
		background.add(start);
		background.add(resume);
		background.add(rank);
		background.add(setting);
		background.add(exit);

	}
}
