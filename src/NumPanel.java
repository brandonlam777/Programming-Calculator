import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class NumPanel extends JPanel
{
	JTextField num1Field;

	
	public NumPanel()
	{
		num1Field = new JTextField(15);
		Font f = new Font("Arial",Font.PLAIN, 20);
		num1Field.setFont(f);
		num1Field.setEditable(false);
		num1Field.setBackground(Color.white);
		GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				   layout.createSequentialGroup()
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					       .addComponent(num1Field))
				);
		layout.setVerticalGroup(
				   layout.createSequentialGroup()
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				           .addComponent(num1Field))
				);
	}
}
