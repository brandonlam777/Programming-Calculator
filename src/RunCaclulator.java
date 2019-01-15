import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.awt.Component;

public class RunCaclulator
{
	public static void main (String[] args)
	{
		CalcFrame Calc = new CalcFrame();

		Calc.setSize(400,500);
		Calc.setVisible(true);
		Calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calc.setTitle("Calculator");
		
	}

}
