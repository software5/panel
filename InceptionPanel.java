package panel;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class InceptionPanel extends JPanel {

	private JButton start = new JButton("�½���Ϸ");
	private JButton resume = new JButton("������Ϸ");
	private JButton rank = new JButton("��Ϸ����");
	private JButton setting = new JButton("��Ϸ����");
	private JButton exit = new JButton("�˳���Ϸ");

	public InceptionPanel() {
		setLayout(new FlowLayout());
		add(start);
		add(resume);
		add(rank);
		add(setting);
		add(exit);

	}
}
