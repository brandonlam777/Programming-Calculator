import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.*;
public class ToolPanel extends JPanel{
	JButton view, edit, help;
	public ToolPanel()
	{
		view = new JButton("View");
		edit = new JButton("Edit");
		help = new JButton("Help");
		
		Font f = new Font("Arial",Font.PLAIN, 10);
		Dimension d = new Dimension(40,15);
		Insets m = new Insets(1,1,1,1);
		
		view.setMinimumSize(d);
		view.setMaximumSize(d);
		view.setFont(f);
		view.setMargin(m);
		
		edit.setMinimumSize(d);
		edit.setMaximumSize(d);
		edit.setFont(f);
		edit.setMargin(m);
		
		help.setMinimumSize(d);
		help.setMaximumSize(d);
		help.setFont(f);
		help.setMargin(m);
		
		
		GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);
		 
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(view))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(edit))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(help))
					
						);
		layout.setVerticalGroup(
				   layout.createSequentialGroup()
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(view)
				    		  .addComponent(edit)
				    		  .addComponent(help))
				      );
	}
}
