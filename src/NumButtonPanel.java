import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumButtonPanel extends JPanel
{
	JButton b[]=new JButton[10];
	JButton decimal = new JButton(".");
	public NumButtonPanel()
	{
		Font f = new Font("Arial",Font.PLAIN, 14);
		Dimension d = new Dimension(40,30);
		Insets m = new Insets(1,1,1,1);
		
		b[0] = new JButton("0");
		b[0].setMinimumSize(new Dimension(86,30));
		b[0].setMaximumSize(new Dimension(86,30));
		b[0].setFont(f);
		b[0].setMargin(m);
		
		decimal.setMinimumSize(d);
		decimal.setMinimumSize(d);
		decimal.setFont(new Font("Arial",Font.BOLD, 16));
		decimal.setMargin(m);
		decimal.setEnabled(false);
		
		for(int i=1;i<10;i++)
		{
			b[i]=new JButton(""+i);
			b[i].setMinimumSize(d);
			b[i].setMaximumSize(d);
			b[i].setFont(f);
			b[i].setMargin(m);
		}
		
		GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);
		 
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										           .addComponent(b[7])
										           .addComponent(b[4])
										           .addComponent(b[1])
										           )
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												   .addComponent(b[8])
										           .addComponent(b[5])
										           .addComponent(b[2])
										           )
										)
								)
						.addComponent(b[0])
				)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(b[9])
							    .addComponent(b[6])
							    .addComponent(b[3])
							    .addComponent(decimal)
							    )
				)
				
				);
		layout.setVerticalGroup(
				   layout.createSequentialGroup()
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				           .addComponent(b[7])
				           .addComponent(b[8])
				           .addComponent(b[9])
				           )
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    	   .addComponent(b[4])
					       .addComponent(b[5])
					       .addComponent(b[6])
					       )
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		   .addComponent(b[1])
						       .addComponent(b[2])
						       .addComponent(b[3])
						       )
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(b[0])
				    		  .addComponent(decimal)
				    		  )
				);
	}
}
