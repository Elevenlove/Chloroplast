package ChloroplastSE.core;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
@SuppressWarnings("serial")
public class GUIcore extends JFrame{
    public static void main(String args[]) {  
        JFrame frame = new JFrame("ChoroPlast Inteal Editor"); 
        JPanel panel = new JPanel();  
        JLabel label = new JLabel("Chloroplast inteal Editor");  
        JButton button = new JButton();  
        button.setBounds(-70,20,10,10);
        button.setText("save"); 
        JTextArea area = new JTextArea();
        area.setEditable(true);
        area.setColumns(80); // ���������ĳ���Ϊ30���ַ�
        area.setRows(10); // ���������ĸ߶�Ϊ3���ַ�
        area.setLineWrap(true); // ����ÿ���Ƿ������۵���Ϊtrue�Ļ��������ַ�����ÿ�п�Ⱦͻ��Զ�����
        panel.add(area);
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);  
        frame.setSize(1024,768);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
        area.getText();
    }
    @SuppressWarnings("unused")
	private static class Save implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent argEvent) {
			// TODO Auto-generated method stu
		}
    	
    }
}
