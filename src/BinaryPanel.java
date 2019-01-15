import javax.swing.*;
public class BinaryPanel extends JPanel
{
	JRadioButton hex = new JRadioButton("Hex");
	JRadioButton dec = new JRadioButton("Dec", true);
	JRadioButton oct = new JRadioButton("Oct");
	JRadioButton bin = new JRadioButton("Bin");
	ButtonGroup group = new ButtonGroup();
	public BinaryPanel()
	{
		 group.add(hex);
		 group.add(dec);
		 group.add(oct);
		 group.add(bin);
		 
		 GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				   layout.createSequentialGroup()
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						   .addComponent(hex)
						   .addComponent(dec)
						   .addComponent(oct)
						   .addComponent(bin)
						   )
				   );
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				   .addComponent(hex)
				   .addComponent(dec)
				   .addComponent(oct)
				   .addComponent(bin)
				   );
	}
}
