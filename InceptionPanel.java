package panel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
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
		start.setBounds(120, 50, 100, 30);
		resume.setBounds(120, 100, 100, 30);
		rank.setBounds(120, 150, 100, 30);
		setting.setBounds(120, 200, 100, 30);
		exit.setBounds(120, 250, 100, 30);
		background.add(start);
		background.add(resume);
		background.add(rank);
		background.add(setting);
		background.add(exit);

	}

	public JButton getStart() {
		return start;
	}

	public void setStart(JButton start) {
		this.start = start;
	}

	public JButton getResume() {
		return resume;
	}

	public void setResume(JButton resume) {
		this.resume = resume;
	}

	public JButton getRank() {
		return rank;
	}

	public void setRank(JButton rank) {
		this.rank = rank;
	}

	public JButton getSetting() {
		return setting;
	}

	public void setSetting(JButton setting) {
		this.setting = setting;
	}

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}
}
