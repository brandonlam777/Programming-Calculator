import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.*;
public class HexPanel extends JPanel{
	
	JButton h[] = new JButton[6];
	public HexPanel()
	{
		Font f = new Font("Arial",Font.PLAIN, 14);
		Dimension d = new Dimension(40,30);
		Insets m = new Insets(1,1,1,1);
		

		h[0] = new JButton("A");
		h[1] = new JButton("B");
		h[2] = new JButton("C");
		h[3] = new JButton("D");
		h[4] = new JButton("E");
		h[5] = new JButton("F");
		for(int i=0;i<6;i++)
		{
			h[i].setMinimumSize(d);
			h[i].setMaximumSize(d);
			h[i].setFont(f);
			h[i].setMargin(m);
			h[i].setEnabled(false);
		}
		GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);
		 
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(h[0])
						.addComponent(h[1])
						.addComponent(h[2])
						.addComponent(h[3])
						.addComponent(h[4])
						.addComponent(h[5]))
						);
				
		layout.setVerticalGroup(
				   layout.createSequentialGroup()
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(h[0])
				    		  )
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(h[1])
				    		  )
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(h[2])
				    		  )
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(h[3])
				    		  )
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(h[4])
				    		  )
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(h[5])
				    		  )
				      );
	}

}
