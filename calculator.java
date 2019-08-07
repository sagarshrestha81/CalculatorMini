package calc;
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
class calculator extends JFrame implements ActionListener { 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame f; 
    static JTextField l; 
      // store operator and operands 
    String s0, s1, s2; 
  
    // default constructor 
    calculator() 
    { 
        s0 = s1 = s2 = ""; 
    } 
  
    // main function 
    public static void main(String args[]) 
    { 
        // create a frame 
        f = new JFrame("calculator"); 
  
        try { 
            // set look and feel 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
  
        // create a object of class 
        calculator c = new calculator(); 
  
        // create a textfield 
        l = new JTextField(16); 
  
        // set the textfield to non editable 
        l.setEditable(false); 
  
        // create number buttons
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9; 
        // Create operators
        JButton  badd, bsub, bdiv, bmul,bequal,bclear,bpoint;
        //create M
        JButton mc,mr,madd,msub,ms;
        // create extra
        JButton bper,broot,bsquare,bby,bce,bback,bpm;
        // create number buttons 
        b0 = new JButton("0"); 
        b1 = new JButton("1"); 
        b2 = new JButton("2"); 
        b3 = new JButton("3"); 
        b4 = new JButton("4"); 
        b5 = new JButton("5"); 
        b6 = new JButton("6"); 
        b7 = new JButton("7"); 
        b8 = new JButton("8"); 
        b9 = new JButton("9"); 
        //extra buttons
        bper=new JButton("%"); 
        broot=new JButton("√"); 
        bsquare=new JButton("(x^​2)");
        bby=new JButton("1/x"); 
        bce=new JButton("CE"); 
        bback=new JButton("<-"); 
        bpm=new JButton("±");
  
        // equals button 
        bequal = new JButton("="); 
  
        // create operator buttons 
        badd = new JButton("+"); 
        bsub = new JButton("-"); 
        bdiv = new JButton("÷"); 
        bmul = new JButton("×"); 
        bclear = new JButton("C"); 
  
        // create . button 
        bpoint = new JButton("."); 
        //
  
        // add action listeners 
        bmul.addActionListener(c); 
        bdiv.addActionListener(c); 
        bsub.addActionListener(c); 
        badd.addActionListener(c); 
        b9.addActionListener(c); 
        b8.addActionListener(c); 
        b7.addActionListener(c); 
        b6.addActionListener(c); 
        b5.addActionListener(c); 
        b4.addActionListener(c); 
        b3.addActionListener(c); 
        b2.addActionListener(c); 
        b1.addActionListener(c); 
        b0.addActionListener(c); 
        bpoint.addActionListener(c); 
        bequal.addActionListener(c); 
        bclear.addActionListener(c);
        bsquare.addActionListener(c);
        broot.addActionListener(c);
        bper.addActionListener(c);
        bpm.addActionListener(c);
        bby.addActionListener(c);
  
        // add elements to panel 
        JPanel p= new JPanel(); 
		
		
		
		Font font1 = new Font("SansSerif", Font.BOLD, 25);
	    
		JLabel Head = new JLabel("Standard");
		Head.setLocation(25,5);
		Head.setSize(130,25);	
		Head.setFont(font1);
		Head.setHorizontalAlignment(JTextField.CENTER);
	    f.getContentPane().add(Head);
	    l.setBounds(0, 60, 520, 90);
	    
	    mc = new JButton("MC");
	    mr = new JButton("MR");
	    madd = new JButton("M+");
	    msub = new JButton("M-");
	    ms = new JButton("MS");
	    //first row Bounds
		mc.setBounds(0,160, 78, 35);
		mr.setBounds(78,160, 78, 35);
		madd.setBounds(156,160,78, 35);
		msub.setBounds(234,160, 78, 35);
		ms.setBounds(312,160, 78, 35);
		//second row bounds
		bper.setBounds(0, 195, 130, 67);
		broot.setBounds(130, 195, 130, 67);
		bsquare.setBounds(260, 195, 130, 67);
		bby.setBounds(390, 195, 130, 67);
		//third row bounds
		bce.setBounds(0, 262, 130, 67);
		bclear.setBounds(130, 262, 130, 67);
		bback.setBounds(260, 262, 130, 67);
		bdiv.setBounds(390, 262, 130, 67);
		//fourth row bounds
		b7.setBounds(0, 329, 130, 67);
		b8.setBounds(130, 329, 130, 67);
		b9.setBounds(260, 329, 130, 67);
		bmul.setBounds(390, 329, 130, 67);
		//fifth row bounds
		b4.setBounds(0, 396, 130, 67);
		b5.setBounds(130, 396, 130, 67);
		b6.setBounds(260, 396, 130, 67);
		bsub.setBounds(390, 396, 130, 67);
		//sixth row bounds
		b1.setBounds(0, 463, 130, 67);
		b2.setBounds(130, 463, 130, 67);
		b3.setBounds(260, 463, 130, 67);
		badd.setBounds(390, 463, 130, 67);
		//seventh row bounds
		bpm.setBounds(0, 530, 130, 67);
		b0.setBounds(130, 530, 130, 67);
		bpoint.setBounds(260, 530, 130, 67);
		bequal.setBounds(390, 530, 130, 67);
		
		
		
		
		f.add(l);
		f.add(mc);
		f.add(mr);
		f.add(madd);
		f.add(msub);
		f.add(ms);
		f.add(bper);
		f.add(broot);
		f.add(bsquare);
		f.add(bby);
		f.add(bce);
		f.add(bclear);
		f.add(bback);
		f.add(bdiv);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bmul);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bsub);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(badd);
		f.add(bpm);
		f.add(b0);
		f.add(bpoint);
		f.add(bequal);
		

       
        // add panel to frame 
        f.add(p); 
		f.setVisible(true);
		f.setSize(540,640);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    @SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e) 
    { 
    	Font font2 = new Font("SansSerif", Font.BOLD, 25);
        String s = e.getActionCommand(); 
  
        // if the value is a number 
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
            // if operand is present then add to second no 
            if (!s1.equals("")) 
                s2 = s2 + s; 
            else
                s0 = s0 + s; 
  
            // set the value of text 
            l.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == 'C') { 
            // clear the one letter 
            s0 = s1 = s2 = ""; 
  
            // set the value of text 
            
            l.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == '=') { 
  
            double te; 
  
            // store the value in 1st 
            if (s1.equals("+")) 
                te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
            else if (s1.equals("-")) 
                te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
            else if (s1.equals("÷")) 
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));  
            else if (s1.equals("(x^​2)"))
                te = (Double.parseDouble(s0) * Double.parseDouble(s0));
            else if (s1.equals("√"))
                te = (Math.sqrt(Double.parseDouble(s0)));
            else if (s1.equals("%"))
                te = ((Double.parseDouble(s0) /100)* (Double.parseDouble(s2)));
            else if (s1.equals("±"))
                te = (Double.parseDouble(s0) - (2*Double.parseDouble(s0)));
            else if (s1.equals("(1/x)"))
                te = (1/Double.parseDouble(s0));
            else 
                te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
            // set the value of text 
            
            l.setText( "Answer:     " + te); 
  
            // convert it to string 
            s0 = Double.toString(te); 
  
            s1 = s2 = ""; 
        } 
        else { 
            // if there was no operand 
            if (s1.equals("") || s2.equals("")) 
                s1 = s; 
            // else evaluate 
            else { 
                double te; 
  
                // store the value in 1st 
                if (s1.equals("+")) 
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                else if (s1.equals("-")) 
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                else if (s1.equals("÷")) 
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
                
  
                // convert it to string 
                s0 = Double.toString(te); 
  
                // place the operator 
                s1 = s; 
  
                // make the operand blank 
                s2 = ""; 
            } 
            
            // set the value of text 
            l.setText(s0 + s1 + s2); 
          
        } 
        l.setLocation(10,45);
		l.setSize(500,100);	
		l.setFont(font2);
		l.setHorizontalAlignment(JTextField.RIGHT);
	    f.getContentPane().add(l);
    } 
}