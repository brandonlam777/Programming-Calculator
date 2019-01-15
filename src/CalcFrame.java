
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.lang.StringBuilder;
public class CalcFrame extends JFrame implements ActionListener
{
	int v1,v2,result;
	char OP;
	
	JPanel subPanel1 = new JPanel();
	JPanel subPanel2 = new JPanel();
	JPanel subPanel3 = new JPanel();
	JPanel subPanel4 = new JPanel();
	
	NumPanel panel1 = new NumPanel();
	OpPanel panel2 = new OpPanel();
	NumButtonPanel panel3 = new NumButtonPanel();
	BinaryPanel panel4 = new BinaryPanel();
	WordPanel panel5 = new WordPanel();
	HexPanel panel6 = new HexPanel();
	ToolPanel panel7 = new ToolPanel();
	BinaryBitsPanel panel8 = new BinaryBitsPanel();
	boolean hexSwitch = false;
	boolean decSwitch = true;
	boolean octSwitch = false;
	boolean binSwitch = false;
	public CalcFrame()
	{
		
		panel1.setPreferredSize(new Dimension(200,100));
		subPanel4.setLayout(new BoxLayout(subPanel4, BoxLayout.Y_AXIS));
		subPanel1.setLayout(new BoxLayout(subPanel1, BoxLayout.Y_AXIS));
		subPanel2.setLayout(new BoxLayout(subPanel2, BoxLayout.Y_AXIS));
		subPanel3.setLayout(new BoxLayout(subPanel3, BoxLayout.Y_AXIS));
		
		add(subPanel1,BorderLayout.WEST);
		add(subPanel2,BorderLayout.EAST);
		add(subPanel3,BorderLayout.CENTER);
		add(subPanel4,BorderLayout.NORTH);
		
		subPanel2.add(panel3);
		subPanel2.add(panel2);
		
		subPanel1.add(panel4);
		subPanel1.add(panel5);
		
		subPanel3.add(panel6);
		
		subPanel4.add(panel7);
		subPanel4.add(panel1);
		subPanel4.add(panel8);
		for(int i=0;i<10;i++)
		{
			panel3.b[i].addActionListener(this);
		}
		panel3.decimal.addActionListener(this);
		panel2.add.addActionListener(this);
		panel2.subtract.addActionListener(this);
		panel2.multiply.addActionListener(this);
		panel2.divide.addActionListener(this);
		panel2.equals.addActionListener(this);
		panel2.clearEverything.addActionListener(this);
		panel2.backspace.addActionListener(this);
		panel2.sign.addActionListener(this);
		panel2.clear.addActionListener(this);
		for(int i=0;i<6;i++)
		{
			panel6.h[i].addActionListener(this);
		}
		
		panel7.view.addActionListener(this);
		panel7.edit.addActionListener(this);
		panel7.help.addActionListener(this);
		
		panel4.hex.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getItem() == panel4.hex)
				{
					hexSwitch = true;
					decSwitch = false;
					octSwitch = false;
					binSwitch = false;
					for(int i=0;i<6;i++)
					{
						panel6.h[i].setEnabled(true);
					}
					for(int i=0;i<10;i++)
					{
						panel3.b[i].setEnabled(true);
					}
					panel3.decimal.setEnabled(false);
					panel2.sign.setEnabled(false);
					panel1.num1Field.setText("");
					
				}
			}
		});
		panel4.dec.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getItem() == panel4.dec)
				{
					hexSwitch = false;
					decSwitch = true;
					octSwitch = false;
					binSwitch = false;
					for(int i=0;i<6;i++)
					{
						panel6.h[i].setEnabled(false);
					}
					for(int i=0;i<10;i++)
					{
						panel3.b[i].setEnabled(true);
					}
					panel3.decimal.setEnabled(false);
					panel2.sign.setEnabled(true);
					panel1.num1Field.setText("");
				}
			}
		});
		panel4.oct.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getItem() == panel4.oct)
				{
					hexSwitch = false;
					decSwitch = false;
					octSwitch = true;
					binSwitch = false;
					for(int i=0;i<6;i++)
					{
						panel6.h[i].setEnabled(false);
					}
					for(int i=8;i<10;i++)
					{
						panel3.b[i].setEnabled(false);
					}
					panel3.decimal.setEnabled(false);
					panel2.sign.setEnabled(false);
					panel1.num1Field.setText("");
				}
			}
		});
		panel4.bin.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e) {
					if(e.getItem() == panel4.bin)
					{
						hexSwitch = false;
						decSwitch = false;
						octSwitch = false;
						binSwitch = true;
						for(int i=0;i<6;i++)
						{
							panel6.h[i].setEnabled(false);
						}
						for(int i=2;i<10;i++)
						{
							panel3.b[i].setEnabled(false);
						}
						panel3.decimal.setEnabled(false);
						panel2.sign.setEnabled(false);
						panel1.num1Field.setText("");
					}
		}
	});
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		String str=e.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch) || e.getSource() == panel3.decimal || (str.equals("A") || str.equals("B") || str.equals("C") || str.equals("D") || str.equals("E") || str.equals("F")))
			panel1.num1Field.setText(panel1.num1Field.getText()+str);
		else
		{
			if(e.getSource() == panel2.add)
			{

				OP='+';
				if(hexSwitch == true)
					v1 = hexConvert(panel1.num1Field.getText());
				else if (decSwitch == true)
					v1=Integer.parseInt(panel1.num1Field.getText());
				else if (octSwitch == true)
					v1 = octConvert(panel1.num1Field.getText());
				else if (binSwitch == true)
					v1 = binConvert(panel1.num1Field.getText());
				panel1.num1Field.setText("");		
			}
			else if(e.getSource() == panel2.subtract)
			{
				if(hexSwitch == true)
					v1 = hexConvert(panel1.num1Field.getText());
				else if (decSwitch == true)
					v1=Integer.parseInt(panel1.num1Field.getText());
				else if (octSwitch == true)
					v1 = octConvert(panel1.num1Field.getText());
				else if (binSwitch == true)
					v1 = binConvert(panel1.num1Field.getText());
				OP='-';
				panel1.num1Field.setText("");	
			}
			else if(e.getSource() == panel2.multiply)
			{
				if(hexSwitch == true)
					v1 = hexConvert(panel1.num1Field.getText());
				else if (decSwitch == true)
					v1=Integer.parseInt(panel1.num1Field.getText());
				else if (octSwitch == true)
					v1 = octConvert(panel1.num1Field.getText());
				else if (binSwitch == true)
					v1 = binConvert(panel1.num1Field.getText());
				OP='*';
				panel1.num1Field.setText("");	
			}
			else if(e.getSource() == panel2.divide)
			{
				if(hexSwitch == true)
					v1 = hexConvert(panel1.num1Field.getText());
				else if (decSwitch == true)
					v1=Integer.parseInt(panel1.num1Field.getText());
				else if (octSwitch == true)
					v1 = octConvert(panel1.num1Field.getText());
				else if (binSwitch == true)
					v1 = binConvert(panel1.num1Field.getText());
				OP='/';
				panel1.num1Field.setText("");	
			}
			else if (e.getSource() == panel2.equals)
			{
				String resultAsString = "";
				boolean divideBy0 = false;
				if(hexSwitch == true)
					v2 = hexConvert(panel1.num1Field.getText());
				else if (decSwitch == true)
					v2 = Integer.parseInt(panel1.num1Field.getText());
				else if (octSwitch == true)
					v2 = octConvert(panel1.num1Field.getText());
				else if (binSwitch == true)
					v2 = binConvert(panel1.num1Field.getText());
				if(OP=='+')
					result=v1+v2;
				else if(OP=='-')
					result=v1-v2;
				else if(OP=='*')
					result=v1*v2;
				else if(OP=='/')
				{
					if(v2 == 0)
						divideBy0 = true;
					else
						result=v1/v2;
				}
				
				if(hexSwitch == true)
				{
					Integer i = result;
					resultAsString = decToHex(i);
				}
				else if (decSwitch == true)
					resultAsString = toString(result, divideBy0);
				else if (octSwitch == true)
				{
					Integer i = result;
					resultAsString = decToOct(i);
				}
				else if (binSwitch == true)
				{
					Integer i = result;
					resultAsString = decToBin(i);
				}
				panel1.num1Field.setText("" + resultAsString);
				panel8.Setlabels(resultAsString);
			}
			else if(e.getSource() == panel2.clear)
			{
				panel1.num1Field.setText("");
			}
			else if(e.getSource() == panel2.clearEverything)
			{
				panel1.num1Field.setText("");
				v1 = 0;
				v2 = 0;
				panel8.clearLabels();
			}
			else if(e.getSource() == panel2.backspace)
			{
				String s = panel1.num1Field.getText();
				panel1.num1Field.setText(s.substring(0,s.length()-1));
			}
			else if(e.getSource() == panel2.sign)
			{
				String s = panel1.num1Field.getText();
				if(panel1.num1Field.getText().equals(""))
				{
					panel1.num1Field.setText("-");
				}
				else
				{
					if(s.charAt(0) == '-')
					{
						panel1.num1Field.setText(s.substring(1, s.length()));
					}
					else
					{
						String minus = "-";
						panel1.num1Field.setText(minus+s);
					}
				}
				
			}
			else if(e.getSource() == panel7.view)
			{
				this.setState(Frame.ICONIFIED);
			}
			else if(e.getSource() == panel7.edit)
			{
				String myString = panel1.num1Field.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
			}
			else if(e.getSource() == panel7.help)
			{
				HelpFrame help = new HelpFrame();

				help.setSize(400,500);
				help.setVisible(true);
				help.setTitle("About");
			}
		}
		}
	
	public Integer hexConvert(String s)
	{
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        Integer val = 0;
        if(s.contains("-"))
        {
        	for (int i = 1; i < s.length(); i++) {
        		char c = s.charAt(i);
        		int d = digits.indexOf(c);
        		val = 16*val + d;
        	}
        	val = val*-1;
        }
        else
        {
        	for (int i = 0; i < s.length(); i++) {
        		char c = s.charAt(i);
        		int d = digits.indexOf(c);
        		val = 16*val + d;
        	}
        }
        return val;
	}
	
	public Integer octConvert(String s)
	{
		String digits = "01234567";
        s = s.toUpperCase();
        Integer val = 0;
        if(s.contains("-"))
        {
        	for (int i = 1; i < s.length(); i++) {
        		char c = s.charAt(i);
        		int d = digits.indexOf(c);
        		val = 8*val + d;
        	}
        	val = val*-1;
        }
        else
        {
        	for (int i = 0; i < s.length(); i++) {
        		char c = s.charAt(i);
        		int d = digits.indexOf(c);
        		val = 8*val + d;
        	}
        }
        return val;
	}
	
	public Integer binConvert(String s)
	{
		String digits = "01";
        s = s.toUpperCase();
        Integer val = 0;
        if(s.contains("-"))
        {
        	for (int i = 1; i < s.length(); i++) {
        		char c = s.charAt(i);
        		int d = digits.indexOf(c);
        		val = 2*val + d;
        	}
        	val = val*-1;
        }
        else
        {
        	for (int i = 0; i < s.length(); i++) {
        		char c = s.charAt(i);
        		int d = digits.indexOf(c);
        		val = 2*val + d;
        	}
        }
        return val;
	}
        
	public static String toString(Integer d, boolean b)
	{
		String numberAsString = "";
		if (b == true)
			numberAsString = "Cannot Divide by 0";
		else
			numberAsString = Integer.toString(d);
		return numberAsString;
	}
	
	public String decToHex(int num)
	{
		 int rem;
	     String str2=""; 
	 
	     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	     if(num == 0)
	     {
	    	 str2 = "0";
	    	 return str2;
	     }
	     while(num>0)
	     {
	       rem=(num%16); 
	       str2=hex[rem]+str2; 
	       num=num/16;
	     }
	     
	     return str2;
	}
	
	public String decToOct(int num)
	{
		int rem;
        
	     String str2=""; 
	 
	     char hex[]={'0','1','2','3','4','5','6','7'};
	     if(num == 0)
	     {
	    	 str2 = "0";
	    	 return str2;
	     }
	     while(num>0)
	     {
	       rem=(num%8); 
	       str2=hex[rem]+str2; 
	       num=num/8;
	     }

	     return str2;
	}
	
	public String decToBin(int num)
	{
		int rem;
        
	     String str2=""; 
	 
	     char hex[]={'0','1'};
	     if(num == 0)
	     {
	    	 str2 = "0";
	    	 return str2;
	     }
	     while(num>0)
	     {
	       rem=(num%2); 
	       str2=hex[rem]+str2; 
	       num=num/2;
	     }

	     return str2;
	}
	
}
