import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class HelpFrame extends JFrame {
	JTextField aboutField;
	public HelpFrame()
	{
		aboutField = new JTextField(15);
		Font f = new Font("Arial",Font.PLAIN, 12);
		aboutField.setFont(f);
		aboutField.setEditable(false);
		aboutField.setBackground(Color.white);
		try {
			String textLine;
			FileReader fr = new FileReader("src/about.txt");
			BufferedReader reader = new BufferedReader(fr);
			         while((textLine=reader.readLine())!=null){
			             // textLine = reader.readLine(); // remove this line
			             aboutField.read(reader,"jTextArea1");
			         } 
			}
			catch (IOException ioe) {
			System.err.println(ioe);
			System.exit(1);
			}
		add(aboutField);
	}
}
