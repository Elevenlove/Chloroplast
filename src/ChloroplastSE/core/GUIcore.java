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
        area.setColumns(80); // 设置输入框的长度为30个字符
        area.setRows(10); // 设置输入框的高度为3行字符
        area.setLineWrap(true); // 设置每行是否允许折叠。为true的话，输入字符超过每行宽度就会自动换行
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
