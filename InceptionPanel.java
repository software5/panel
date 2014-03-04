package panel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InceptionPanel extends JPanel {

	private JButton start = new JButton("�½���Ϸ");
	private JButton resume = new JButton("������Ϸ");
	private JButton rank = new JButton("��Ϸ����");
	private JButton setting = new JButton("��Ϸ����");
	private JButton exit = new JButton("�˳���Ϸ");
	private JLabel background = new JLabel();
	private Icon picture = new ImageIcon("yellowHang.jpg");

	public InceptionPanel() {
		// �Զ���λ������û��layout
		setLayout(null);

		// ��ӱ���
		background.setLayout(null);
		background.setLocation(0, 0);
		background.setSize(736, 456);
		background.setIcon(picture);
		add(background);

		// �ڱ�������Ӱ�ť
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
