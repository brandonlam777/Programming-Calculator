import javax.swing.*;
public class BinaryBitsPanel extends JPanel{
	public enum mode{hex,dec,oct,bin}
	mode m = mode.dec;
	JLabel[] labels = new JLabel[16];
	public BinaryBitsPanel()
	{
		for(int i =0; i < 16; i++)
		{
			labels[i] = new JLabel();
			labels[i].setText("0000");
		}
		GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		  .addComponent(labels[15])
			    		  .addComponent(labels[7]))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		  .addComponent(labels[14])
			    		  .addComponent(labels[6]))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		  .addComponent(labels[13])
			    		  .addComponent(labels[5]))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		  .addComponent(labels[12])
			    		  .addComponent(labels[4]))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		  .addComponent(labels[11])
			    		  .addComponent(labels[3]))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		  .addComponent(labels[10])
			    		  .addComponent(labels[2]))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		  .addComponent(labels[9])
			    		  .addComponent(labels[1]))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		  .addComponent(labels[8])
			    		  .addComponent(labels[0]))
			      );
		layout.setVerticalGroup(
				   layout.createSequentialGroup()
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(labels[15])
				    		  .addComponent(labels[14])
				    		  .addComponent(labels[13])
				    		  .addComponent(labels[12])
				    		  .addComponent(labels[11])
				    		  .addComponent(labels[10])
				    		  .addComponent(labels[9])
				    		  .addComponent(labels[8]))
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		  .addComponent(labels[7])
				    		  .addComponent(labels[6])
				    		  .addComponent(labels[5])
				    		  .addComponent(labels[4])
				    		  .addComponent(labels[3])
				    		  .addComponent(labels[2])
				    		  .addComponent(labels[1])
				    		  .addComponent(labels[0]))
				      );
				    		  
			
	}
	public void Setlabels(String s)
	{
		clearLabels();
		if(s.length() > 16)
		{
			return;
		}
		for( int i = 0; i < s.length(); i++)
		{
			int index = s.length()-i-1;
			char c = s.charAt(i);
			switch (c)
			{
			case '0':
				labels[index].setText("0000");
				break;
			case '1':
				labels[index].setText("0001");
				break;
			case '2':
				labels[index].setText("0010");
				break;
			case '3':
				labels[index].setText("0011");
				break;
			case '4':
				labels[index].setText("0100");
				break;
			case '5':
				labels[index].setText("0101");
				break;
			case '6':
				labels[index].setText("0110");
				break;
			case '7':
				labels[index].setText("0111");
				break;
			case '8':
				labels[index].setText("1000");
				break;
			case '9':
				labels[index].setText("1001");
				break;
			case 'A':
				labels[index].setText("1010");
				break;
			case 'B':
				labels[index].setText("1011");
				break;
			case 'C':
				labels[index].setText("1100");
				break;
			case 'D':
				labels[index].setText("1101");
				break;
			case 'E':
				labels[index].setText("1110");
				break;
			case 'F':
				labels[index].setText("1111");
				break;
			}
		}
	}
	public void clearLabels()
	{
		for(int i =0; i < 16; i++)
		{
			labels[i].setText("0000");
		}
	}
	public void SetMode(mode m)
	{
		this.m = m;
	}
}
