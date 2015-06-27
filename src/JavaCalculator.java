import javax.print.attribute.standard.PresentationDirection;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextArea;

import java.awt.event.KeyAdapter;


public class JavaCalculator extends JFrame {
	
	private String calcString = " ";
	private String saveInputString; // Save the full input string before 
	private String ansString;	// string after calculation that contains the result

	private String saveNum;	// String for saving the input numbers
	private String nextNum;	// String for saving the input numbers
	private String doneNum;	// String for saving the input numbers
	
	private float saveNumFloat;	// String for saving the input numbers
	private float nextNumFloat;	// String for saving the input numbers
	private float doneNumFloat;	// String for saving the input numbers
	
	private int divPos;
	private int mulPos;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonAdd;
	private JButton buttonNeg;
	private JButton buttonMul;
	private JButton buttonDiv;
	private JButton buttonEqu;
	private JButton buttonNo;
	private JButton buttonDot;
	private JButton buttonBackSpace;
	private JButton buttonMem;
	private JButton buttonAns;
	
	private JTextArea textArea;
	
	// class constructor
	public JavaCalculator() {
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(e.getKeyChar() == 49)
				{
					NormalButtonPressed("1");
				}
				else if(e.getKeyChar() == '2')
				{
					NormalButtonPressed("2");
				}
				else if(e.getKeyChar() == '3')
				{
					NormalButtonPressed("3");
				}
				else if(e.getKeyChar() == '4')
				{
					NormalButtonPressed("4");
				}
				else if(e.getKeyChar() == '5')
				{
					NormalButtonPressed("5");
				}
				else if(e.getKeyChar() == '6')
				{
					NormalButtonPressed("6");
				}
				else if(e.getKeyChar() == '7')
				{
					NormalButtonPressed("7");
				}
				else if(e.getKeyChar() == '8')
				{
					NormalButtonPressed("8");
				}
				else if(e.getKeyChar() == '9')
				{
					NormalButtonPressed("9");
				}
				else if(e.getKeyChar() == '0')
				{
					NormalButtonPressed("0");
				}
				else if(e.getKeyChar() == '.')
				{
					NormalButtonPressed(".");
				}
				else if(e.getKeyChar() == '.')
				{
					NormalButtonPressed(".");
				}
				else if(e.getKeyChar() == '+')
				{
					NormalButtonPressed(" + ");
				}
				else if(e.getKeyChar() == '-')
				{
					NormalButtonPressed(" - ");
				}
				else if(e.getKeyChar() == '*' || e.getKeyChar() == 'x' || e.getKeyChar() == 'X')
				{
					NormalButtonPressed(" X ");
				}
				else if(e.getKeyChar() == '/')
				{
					NormalButtonPressed(" / ");
				}
				else if(e.getKeyChar() == '=')
				{
					EquButtonPressed(" = ");
					
					// show the input text and result
					textArea.setText(saveInputString.substring(0, saveInputString.length()-2) + "\n= " + calcString.substring(0, calcString.length()-2));
					
					// now if any other button pressed there will be ANS into something
					ansString = calcString.substring(0, calcString.length()-3);
					System.out.printf("ansString = %s", ansString+"*");
				}
				else if(e.getKeyChar() == 8)
				{
					DelButtonPressed();
				}
				
				
			}
		});
		
		this.setResizable(false);
		this.setSize( 327, 380 );
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.setVisible(true);
		this.getContentPane().setLayout(null);
		this.setTitle("My Calculator");
		
		
		button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("1");
				
			}
		}); 
		button1.setBounds(10, 230, 48, 50);
		getContentPane().add(button1);
		
		button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("2");
				
			}
		});
		button2.setBounds(68, 230, 48, 50);
		getContentPane().add(button2);
		
		
		button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("3");
				
			}
		});
		button3.setBounds(126, 230, 48, 50);
		getContentPane().add(button3);
		
		button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("4");
				
			}
		});
		button4.setBounds(10, 169, 48, 50);
		getContentPane().add(button4);
		
		button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("5");
				
			}
		});
		button5.setBounds(68, 169, 48, 50);
		getContentPane().add(button5);
		
		button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("6");
				
			}
		});
		button6.setBounds(126, 169, 48, 50);
		getContentPane().add(button6);
		
		button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("7");
				
			}
		});
		button7.setBounds(10, 108, 48, 50);
		getContentPane().add(button7);
		
		button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("8");
				
			}
		});
		button8.setBounds(68, 108, 48, 50);
		getContentPane().add(button8);
		
		button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("9");
				
			}
		});
		button9.setBounds(126, 108, 48, 50);
		getContentPane().add(button9);
		
		button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("0");
				
			}
		});
		button0.setBounds(10, 291, 48, 50);
		getContentPane().add(button0);
		
		buttonNo = new JButton("AC");
		buttonNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcString = " ";
				textArea.setText(calcString);
				
			}
		});
		buttonNo.setBounds(242, 108, 68, 50);
		getContentPane().add(buttonNo);
		
		buttonEqu = new JButton("=");
		buttonEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EquButtonPressed(" = ");
				
				// show the input text and result
				textArea.setText(saveInputString.substring(0, saveInputString.length()-2) + "\n= " + calcString.substring(0, calcString.length()-2));
				
				// now if any other button pressed there will be ANS into something
				ansString = calcString.substring(0, calcString.length()-3);
				System.out.printf("ansString = %s", ansString+"*");
				
			}
		});
		buttonEqu.setBounds(126, 291, 48, 50);
		getContentPane().add(buttonEqu);
		
		buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed(" / ");
				
			}
		});
		buttonDiv.setBounds(184, 108, 48, 50);
		getContentPane().add(buttonDiv);
		
		buttonMul = new JButton("X");
		buttonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed(" X ");
				
			}
		});
		buttonMul.setBounds(184, 169, 48, 50);
		getContentPane().add(buttonMul);
		
		buttonNeg = new JButton("-");
		buttonNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed(" - ");
				
			}
		});
		buttonNeg.setBounds(184, 230, 48, 50);
		getContentPane().add(buttonNeg);
		
		buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed(" + ");
				
			}
		});
		buttonAdd.setBounds(184, 291, 48, 50);
		getContentPane().add(buttonAdd);
		
		buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed(".");
				
			}
		});
		buttonDot.setBounds(68, 291, 48, 50);
		getContentPane().add(buttonDot);
		
		buttonBackSpace = new JButton("DEL");
		buttonBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DelButtonPressed();
				
			}
		});
		buttonBackSpace.setBounds(242, 169, 68, 50);
		getContentPane().add(buttonBackSpace);
		
		buttonMem = new JButton("MEM");
		buttonMem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		buttonMem.setBounds(242, 231, 68, 49);
		getContentPane().add(buttonMem);
		
		buttonAns = new JButton("ANS");
		buttonAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NormalButtonPressed("ANS");
				
			}
		});
		buttonAns.setBounds(242, 291, 68, 50);
		getContentPane().add(buttonAns);
		
		
		
		textArea = new JTextArea();
		textArea.setBounds(10, 11, 300, 86);
		textArea.setEditable(false);
		textArea.setFont(new Font("Serif", Font.PLAIN, 14));
		textArea.setLineWrap(true);
		textArea.setText(calcString);
		getContentPane().add(textArea);
		
		repaint();
		
	}	// end of constructor
	
	
	// Function to display the numbers on screen when any button is pressed
	public void NormalButtonPressed(String pressNum)
	{
		
		calcString = calcString + pressNum;
		textArea.setText(calcString);
		
	}	// end of NormalButtonPressed(String pressNum)
	
	
	// Function for creating DELETE button functionality
	public void DelButtonPressed()
	{
		
		if(calcString.length() > 1)
		{
			
			if(calcString.charAt(calcString.length()-1) == ' ')
			{
				calcString = calcString.substring(0, calcString.length()-3);
			}
			else
			{
				calcString = calcString.substring(0, calcString.length()-1);
			}
			
		}
		textArea.setText(calcString);
		
	}	// end of DELETE function
	
	
	// Function when EQUAL(=) sign is pressed
	public void EquButtonPressed(String equPressed)
	{
		
		calcString = calcString + equPressed;
		saveInputString = calcString;
		textArea.setText(calcString);
		StringHandle();	// when = sign is presses string goes to StringHandle(String calcString) method
		
		if( calcString.substring(2, calcString.length()-2).contains("+") || calcString.substring(2, calcString.length()-2).contains("-"))
		{
			StringArithHandler();
		}

	}	// end of public void EquButtonPressed(String equPressed)
	
	
	// when = sign is presses string goes to StringHandle(String calcString) method for calculation
	public void StringHandle()
	{
		
		divPos = -1;
		// find the first divide sign 
		for(int j = 0; j < calcString.length(); j++)
		{
			if(calcString.charAt(j) == '/')
			{
				divPos = j;
				break;
			}
		}
		
		//---------------
		
		if(divPos != -1)
		{
			// find the number on the left of (/) sign
			int j;
			for(j = divPos - 2; true ; j--)
			{						
				if(calcString.charAt(j) == ' ')
					break;								
			}
					
			saveNum = calcString.substring(j, divPos - 1);	// left side of the divide sign
			saveNumFloat = Float.parseFloat(saveNum);	// string to float
			//System.out.printf("pos %d - %d and Div left %s\n", j, divPos - 1, saveNum);
		
					
			// find the number on the right of (/) sign
			int m;
			for(m = divPos + 2; true ; m++)
			{
						
				if(calcString.charAt(m) == ' ')
					break;				
						
			}
					
			nextNum = calcString.substring(divPos + 1, m);	// left side of the divide sign
			nextNumFloat = Float.parseFloat(nextNum);	// string to float
			//System.out.printf("pos %d - %d and Div right %s\n", divPos + 1, m, nextNum);	
		
			doneNumFloat = saveNumFloat/nextNumFloat;	// doing the divide 
			doneNum = Float.toString(doneNumFloat);		// convert the result to string again
			//System.out.printf("div of %s and %s is = %s", saveNum, nextNum, doneNum);
			//System.out.printf("\nReplacing %d to %d of - %s", j, m, calcString);
		
			calcString = calcString.replace(calcString.substring(j+1, m), doneNum);
			//trying avoid replace function 
			//interString = calcString.substring(0, j+1) + doneNum + calcString.substring(m - 2, calcString.length());
			//System.out.printf("See if %s and %s match", calcString, interString);
			//System.out.printf("\nAfter replacing - %s\n", calcString);
			//textArea.setText(calcString);
		
		
			StringHandle();
		}
			
		//--------END OF DIVISION OPERATION-------
		
		
		// ---------------
		// handling mulplication 
		
		mulPos = -1;
		for(int j = 0; j < calcString.length(); j++)
		{
			if(calcString.charAt(j) == 'X')
			{
				mulPos = j;
				break;
			}
		}
		
		//---------------
		
		if(mulPos != -1)
		{
			// find the number on the left of (/) sign
			int j;
			for(j = mulPos - 2; true ; j--)
			{						
				if(calcString.charAt(j) == ' ')
					break;								
			}
					
			saveNum = calcString.substring(j, mulPos - 1);	// left side of the divide sign
			saveNumFloat = Float.parseFloat(saveNum);	// string to float
			//System.out.printf("pos %d - %d and Div left %s\n", j, mulPos - 1, saveNum);
		
					
			// find the number on the right of (/) sign
			int m;
			for(m = mulPos + 2; true ; m++)
			{
						
				if(calcString.charAt(m) == ' ')
					break;				
						
			}
					
			nextNum = calcString.substring(mulPos + 1, m);	// left side of the divide sign
			nextNumFloat = Float.parseFloat(nextNum);	// string to float
			//System.out.printf("pos %d - %d and Div right %s\n", mulPos + 1, m, nextNum);	
		
			doneNumFloat = saveNumFloat * nextNumFloat;	// doing the multiplication 
			doneNum = Float.toString(doneNumFloat);		// convert the result to string again
			//System.out.printf("div of %s and %s is = %s", saveNum, nextNum, doneNum);
			//System.out.printf("\nReplacing %d to %d of - %s", j, m, calcString);
		
			calcString = calcString.replace(calcString.substring(j+1, m), doneNum);
			//trying avoid replace function 
			//interString = calcString.substring(0, j+1) + doneNum + calcString.substring(m - 2, calcString.length());
			//System.out.printf("See if %s and %s match", calcString, interString);
			//System.out.printf("\nAfter replacing - %s\n", calcString);
			//textArea.setText(calcString);
		
		
			StringHandle();
		}
			
		//------ END OF MULTIPLICATION OPERATION---------				
						
	}  // end of public void StringHandle(String calcString)
	
	
	// -------  function for handling arithmetic operations
	public void StringArithHandler()
	{
		System.out.printf("\nEach start step: %s\n", calcString);
		
		int signFlag = -1;
		
		int a;
		for(a = 1; true; a++)
		{
			
			if(calcString.charAt(a) == ' ')
				break;
				
		}
		saveNum = calcString.substring(1, a);
		//System.out.printf("\nFirst number in arith: %s", saveNum);
		
		
		// find out +/-
		if(calcString.charAt(a+1) == '+')
		{
			signFlag = 1;
		}
		
		//System.out.printf("\nSign between: %c", calcString.charAt(a+1));
		
		int b;
		for(b = a + 3; true; b++)
		{
			
			if(calcString.charAt(b) == ' ')
				break;
				
		}
		nextNum = calcString.substring(a + 3, b);
		//System.out.printf("\nSecond number in arith: %s", nextNum);
		
		if(signFlag == 1)
		{
			doneNumFloat = Float.parseFloat(saveNum) + Float.parseFloat(nextNum);
		}
		else
		{
			doneNumFloat = Float.parseFloat(saveNum) - Float.parseFloat(nextNum);
		}
		
		doneNum = Float.toString(doneNumFloat);
		//System.out.printf("\nAfter operation: %s", doneNum);
		
		// replace the calculated part by the value
		calcString = calcString.substring(0, 1) + doneNum + calcString.substring(b , calcString.length()); 
			
		
		//textArea.setText(calcString);
		//System.out.printf("\nEach end step: %s\n", calcString);
		
		if( calcString.substring(2, calcString.length()-2).contains("+") || calcString.substring(2, calcString.length()-2).contains("-"))
		{
			StringArithHandler();
		}
				
		
	}	// end of arithmatic operation handler 
	
}
