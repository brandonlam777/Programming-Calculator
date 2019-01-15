import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OpPanel extends JPanel
{
	JButton multiply, divide, subtract, add, equals,clear,clearEverything,backspace,sign;
	
	public OpPanel()
	{
		multiply = new JButton ("*");
		divide = new JButton ("/");
		subtract = new JButton ("-");
		add = new JButton ("+");
		equals = new JButton("=");
		clear = new JButton("c");
		clearEverything = new JButton("CE");
		backspace = new JButton("<--");
		sign = new JButton("±");
		
		add.setFont(new Font("Arial",Font.PLAIN, 14));
		subtract.setFont(new Font("Arial",Font.PLAIN, 14));
		multiply.setFont(new Font("Arial",Font.PLAIN, 14));
		divide.setFont(new Font("Arial",Font.PLAIN, 14));
		equals.setFont(new Font("Arial",Font.PLAIN, 14));
		clear.setFont(new Font("Arial", Font.PLAIN, 18));
		clearEverything.setFont(new Font("Arial",Font.PLAIN, 14));
		backspace.setFont(new Font("Arial",Font.PLAIN, 14));
		sign.setFont(new Font("Arial",Font.PLAIN,14));
		
		Insets m = new Insets(1,1,1,1);
		add.setMargin(m);
		subtract.setMargin(m);
		multiply.setMargin(m);
		divide.setMargin(m);
		equals.setMargin(m);
		clear.setMargin(m);
		clearEverything.setMargin(m);
		backspace.setMargin(m);
		sign.setMargin(m);
		
		Dimension d = new Dimension(40,30);
	    multiply.setMinimumSize(d);
	    divide.setMinimumSize(d);
	    subtract.setMinimumSize(d);
	    add.setMinimumSize(d);
	    equals.setMinimumSize(d);
	    clear.setMinimumSize(d);
	    clearEverything.setMinimumSize(d);
	    backspace.setMinimumSize(d);
	    sign.setMinimumSize(d);
	    
	    multiply.setMaximumSize(d);
	    divide.setMaximumSize(d);
	    subtract.setMaximumSize(d);
	    add.setMaximumSize(d);
	    equals.setMaximumSize(d);
	    clear.setMaximumSize(d);
	    clearEverything.setMaximumSize(d);
	    backspace.setMaximumSize(d);
	    sign.setMaximumSize(d);
	    
		GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				   layout.createSequentialGroup()
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				           .addComponent(add)
				           .addComponent(equals)
				           .addComponent(backspace)
				           )
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				           .addComponent(subtract)
				           .addComponent(sign)
				           .addComponent(clearEverything)
				           )
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				           .addComponent(multiply)
				           .addComponent(clear)
				           )
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				           .addComponent(divide)
				           
				           )
				           );
		layout.setVerticalGroup(
				   layout.createSequentialGroup()
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				    		.addComponent(add)
					        .addComponent(subtract)
					        .addComponent(multiply)
					        .addComponent(divide))
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				   			.addComponent(equals)
				   			.addComponent(sign)
				   			)
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						   .addComponent(backspace)
						   .addComponent(clearEverything)
						   .addComponent(clear))
				);
		
	}
	
}
