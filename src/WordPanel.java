import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class WordPanel extends JPanel
{
	JRadioButton Qword = new JRadioButton("Qword",true);
	JRadioButton Dword = new JRadioButton("Dword");
	JRadioButton Word = new JRadioButton("Word");
	JRadioButton Byte = new JRadioButton("Byte");
	ButtonGroup group = new ButtonGroup();
	public WordPanel()
	{
		Dword.setEnabled(false);
		Word.setEnabled(false);
		Byte.setEnabled(false);
		 group.add(Qword);
		 group.add(Dword);
		 group.add(Word);
		 group.add(Byte);
		 
		 GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				   layout.createSequentialGroup()
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						   .addComponent(Qword)
						   .addComponent(Dword)
						   .addComponent(Word)
						   .addComponent(Byte)
						   )
				   );
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				   .addComponent(Qword)
				   .addComponent(Dword)
				   .addComponent(Word)
				   .addComponent(Byte)
				   );
	}
}