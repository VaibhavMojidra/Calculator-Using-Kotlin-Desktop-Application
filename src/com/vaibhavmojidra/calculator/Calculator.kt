package com.vaibhavmojidra.calculator

import java.util.Scanner
import javax.swing.JFrame
import javax.swing.JPanel
import java.awt.Color
import javax.swing.JButton
import java.awt.event.ActionListener
import java.awt.Font
import javax.swing.BorderFactory
import java.awt.event.MouseListener
import java.awt.event.MouseEvent
import javax.script.ScriptEngineManager
import javax.swing.JTextField
import java.awt.GraphicsEnvironment
import java.util.Locale
import javax.swing.SwingConstants
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import javax.swing.JLabel
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import java.io.File
import javax.swing.ImageIcon

fun main(agrs:Array<String>){
	var ExpressionTB=JTextField()
	var Error=JLabel("Invalid Expression")
	
	var jf=JFrame("Calculator")
	jf.setVisible(true)
	jf.setLayout(null)
	jf.setResizable(false)
	jf.setSize(270,325)
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
	
	var jp=JPanel()
	jp.setBackground(Color.decode("#D9E4F1"))
	jp.setLayout(null)
	jp.setBounds(0,0,270,325)
	jf.add(jp)
	jf.repaint()
	
	
	try{
		var imgicon =ImageIcon("src/Logo.png")
		jf.setIconImage(imgicon.getImage());
	}catch (e:Exception) {
		print(e)
	}
	
	var b7=JButton("7")
	b7.setBounds(10,100,40,40)
	b7.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("7")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"7")
		}		
 	})
	BlueButtonHover(b7)
	jp.add(b7)
	jp.repaint()
	jf.repaint()
	
	var b8=JButton("8")
	b8.setBounds(60,100,40,40)
	b8.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("8")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"8")
		}
 	})
	BlueButtonHover(b8)
	jp.add(b8)
	jp.repaint()
	jf.repaint()
	
	var b9=JButton("9")
	b9.setBounds(110,100,40,40)
	b9.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("9")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"9")
		}
 	})
	BlueButtonHover(b9)
	jp.add(b9)
	jp.repaint()
	jf.repaint()
	
	var div=JButton("/")
	div.setBounds(160,100,40,40)
	div.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("/")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"/")
		}
 	})
	RedButtonHover(div)
	jp.add(div)
	jp.repaint()
	jf.repaint()
	
	var c=JButton("C")
	c.setBounds(210,100,40,40)
	c.addActionListener(ActionListener{
		Error.setVisible(false)
		ExpressionTB.setText("0")
 	})
	BlackButtonHover(c)
	jp.add(c)
	jp.repaint()
	jf.repaint()
	
	var b4=JButton("4")
	b4.setBounds(10,150,40,40)
	b4.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("4")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"4")
		}
 	})
	BlueButtonHover(b4)
	jp.add(b4)
	jp.repaint()
	jf.repaint()
	
	var b5=JButton("5")
	b5.setBounds(60,150,40,40)
	b5.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("5")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"5")
		}
 	})
	BlueButtonHover(b5)
	jp.add(b5)
	jp.repaint()
	jf.repaint()
	
	var b6=JButton("6")
	b6.setBounds(110,150,40,40)
	b6.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("6")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"6")
		}
 	})
	BlueButtonHover(b6)
	jp.add(b6)
	jp.repaint()
	jf.repaint()
	
	var mul=JButton("×")
	mul.setBounds(160,150,40,40)
	mul.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("×")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"×")
		}
 	})
	RedButtonHover(mul)
	jp.add(mul)
	jp.repaint()
	jf.repaint()
	
	var del=JButton("<")
	del.setBounds(210,150,40,40)
	del.addActionListener(ActionListener{
		Error.setVisible(false)
		var ss:String=ExpressionTB.getText().trim()
		if(ss.length>0){
			ss=ss.substring(0,ss.length-1)
			ExpressionTB.setText(ss)
		}else{
			ExpressionTB.setText("0")
		}
		if(ss.trim().equals("")){
			ExpressionTB.setText("0")
		}
 	})
	BlackButtonHover(del)
	jp.add(del)
	jp.repaint()
	jf.repaint()
	
	var b1=JButton("1")
	b1.setBounds(10,200,40,40)
	b1.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("1")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"1")
		}
 	})
	BlueButtonHover(b1)
	jp.add(b1)
	jp.repaint()
	jf.repaint()

	var b2=JButton("2")
	b2.setBounds(60,200,40,40)
	b2.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("2")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"2")
		}
 	})
	BlueButtonHover(b2)
	jp.add(b2)
	jp.repaint()
	jf.repaint()
	
	var b3=JButton("3")
	b3.setBounds(110,200,40,40)
	b3.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("3")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"3")
		}
 	})
	BlueButtonHover(b3)
	jp.add(b3)
	jp.repaint()
	jf.repaint()
	
	var sub=JButton("-")
	sub.setBounds(160,200,40,40)
	sub.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("-")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"-")
		}
 	})
	RedButtonHover(sub)
	jp.add(sub)
	jp.repaint()
	jf.repaint()
	
	var b0=JButton("0")
	b0.setBounds(110,250,40,40)
	b0.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("0")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"0")
		}
 	})
	BlueButtonHover(b0)
	jp.add(b0)
	jp.repaint()
	jf.repaint()
	
	var dot=JButton(".")
	dot.setBounds(210,200,40,40)
	dot.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("0.")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+".")
		}
 	})
	
	BlueButtonHover(dot)
	jp.add(dot)
	jp.repaint()
	jf.repaint()
	
	var add=JButton("+")
	add.setBounds(160,250,40,40)
	add.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("+")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"+")
		}
 	})
	RedButtonHover(add)
	jp.add(add)
	jp.repaint()
	jf.repaint()
	
	var eql=JButton("=")
	eql.setBounds(210,250,40,40)
	eql.addActionListener(ActionListener{
		Error.setVisible(false)
		var chararr=ExpressionTB.getText().toCharArray()
		var l=ExpressionTB.getText().length
		var i=0
		while(i<l){
			if(chararr[i].equals('×')){
				chararr[i]='*'
			}
			i++
		}
		try{
			var manager =ScriptEngineManager()
			var engine = manager.getEngineByName("js")
			var result = engine.eval(String(chararr))
			ExpressionTB.setText(result.toString())
		}catch(e:Exception){
			Error.setVisible(true)
		}
		
 	})
	GreenButtonHover(eql)
	jp.add(eql)
	jp.repaint()
	jf.repaint()
	
	
	var ob=JButton("(")
	ob.setBounds(10,250,40,40)
	ob.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText("(")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+"(")
		}
 	})
	BrownButtonHover(ob)
	jp.add(ob)
	jp.repaint()
	jf.repaint()

	var cb=JButton(")")
	cb.setBounds(60,250,40,40)
	cb.addActionListener(ActionListener{
		Error.setVisible(false)
		if(ExpressionTB.getText().trim().equals("0")){
			ExpressionTB.setText(")")
		}else{
			ExpressionTB.setText(ExpressionTB.getText().trim()+")")
		}
 	})
	BrownButtonHover(cb)
	jp.add(cb)
	jp.repaint()
	jf.repaint()
	
	
	
	Error.setFont(Font("Consolas",Font.PLAIN,13));
	Error.setForeground(Color.decode("#F44336"))
	Error.setBounds(10,70,240,20)
	Error.setVisible(false)
	jp.add(Error)
	jp.repaint()
	jf.repaint()
	
	ExpressionTB.setBounds(10,20,240,45)
	ExpressionTB.setFont(Font("Consolas",Font.PLAIN,30));
	ExpressionTB.setBorder(BorderFactory.createBevelBorder(1));
	ExpressionTB.setHorizontalAlignment(SwingConstants.RIGHT);
	ExpressionTB.addKeyListener(object:KeyListener{
		override fun keyTyped(ke:KeyEvent){
				Error.setVisible(false)
				var c:Char=ke.getKeyChar();
               if (!(Character.isDigit(c)||(c.equals(KeyEvent.VK_BACK_SPACE))||(c.equals(KeyEvent.VK_DELETE))||(c.equals('('))||(c.equals(')'))||(c.equals('+'))||(c.equals('-'))||(c.equals('/'))||(c.equals('.'))||(c.equals('×')))) 
               {
                   ke.consume();
               }
		}
		override fun keyPressed(ke:KeyEvent){
			
		}
		override fun keyReleased(ke:KeyEvent){
			
		}
	});
	ExpressionTB.setText("0")
	jp.add(ExpressionTB)
	jp.repaint()
	jf.repaint()
	
}

fun BlueButtonHover(name:JButton){
	name.setFont(Font("Arial",Font.BOLD,20));
	name.setBorder(BorderFactory.createBevelBorder(0));
	name.setForeground(Color.WHITE);
	name.setBackground(Color.decode("#4F81BD"));
	name.addMouseListener(object:MouseListener{
		override fun mouseClicked(me:MouseEvent){
			name.setBackground(Color.decode("#197BF1"));
			name.repaint();
		}
		override fun mousePressed(me:MouseEvent){
			
		}
		override fun mouseReleased(me:MouseEvent){
			
		}
		override fun mouseEntered(me:MouseEvent){
			name.setBackground(Color.decode("#3883DE"));
            name.repaint();
		}
		override fun mouseExited(me:MouseEvent){
			name.setBackground(Color.decode("#4F81BD"));
            name.repaint();
		}
	});
	name.setFocusPainted(false);
}

fun RedButtonHover(name:JButton){
	name.setFont(Font("Arial",Font.BOLD,20));
	name.setBorder(BorderFactory.createBevelBorder(0));
	name.setForeground(Color.WHITE);
	name.setBackground(Color.decode("#e53935"));
	name.addMouseListener(object:MouseListener{
		override fun mouseClicked(me:MouseEvent){
			name.setBackground(Color.decode("#d32f2f"));
			name.repaint();
		}
		override fun mousePressed(me:MouseEvent){
			
		}
		override fun mouseReleased(me:MouseEvent){
			
		}
		override fun mouseEntered(me:MouseEvent){
			name.setBackground(Color.decode("#F44336"));
            name.repaint();
		}
		override fun mouseExited(me:MouseEvent){
			name.setBackground(Color.decode("#e53935"));
            name.repaint();
		}
	});
	name.setFocusPainted(false);
}
fun GreenButtonHover(name:JButton){
	name.setFont(Font("Arial",Font.BOLD,20));
	name.setBorder(BorderFactory.createBevelBorder(0));
	name.setForeground(Color.WHITE);
	name.setBackground(Color.decode("#43a047"));
	name.addMouseListener(object:MouseListener{
		override fun mouseClicked(me:MouseEvent){
			name.setBackground(Color.decode("#2e7d32"));
			name.repaint();
		}
		override fun mousePressed(me:MouseEvent){
			
		}
		override fun mouseReleased(me:MouseEvent){
			
		}
		override fun mouseEntered(me:MouseEvent){
			name.setBackground(Color.decode("#4caf50"));
            name.repaint();
		}
		override fun mouseExited(me:MouseEvent){
			name.setBackground(Color.decode("#43a047"));
            name.repaint();
		}
	});
	name.setFocusPainted(false);
}


fun BrownButtonHover(name:JButton){
	name.setFont(Font("Arial",Font.BOLD,20));
	name.setBorder(BorderFactory.createBevelBorder(0));
	name.setForeground(Color.WHITE);
	name.setBackground(Color.decode("#6d4c41"));
	name.addMouseListener(object:MouseListener{
		override fun mouseClicked(me:MouseEvent){
			name.setBackground(Color.decode("#4e342e"));
			name.repaint();
		}
		override fun mousePressed(me:MouseEvent){
			
		}
		override fun mouseReleased(me:MouseEvent){
			
		}
		override fun mouseEntered(me:MouseEvent){
			name.setBackground(Color.decode("#8d6e63"));
            name.repaint();
		}
		override fun mouseExited(me:MouseEvent){
			name.setBackground(Color.decode("#6d4c41"));
            name.repaint();
		}
	});
	name.setFocusPainted(false);
}

fun BlackButtonHover(name:JButton){
	name.setFont(Font("Arial",Font.BOLD,20));
	name.setBorder(BorderFactory.createBevelBorder(0));
	name.setForeground(Color.WHITE);
	name.setBackground(Color.decode("#546e7a"));
	name.addMouseListener(object:MouseListener{
		override fun mouseClicked(me:MouseEvent){
			name.setBackground(Color.decode("#37474f"));
			name.repaint();
		}
		override fun mousePressed(me:MouseEvent){
			
		}
		override fun mouseReleased(me:MouseEvent){
			
		}
		override fun mouseEntered(me:MouseEvent){
			name.setBackground(Color.decode("#78909c"));
            name.repaint();
		}
		override fun mouseExited(me:MouseEvent){
			name.setBackground(Color.decode("#546e7a"));
            name.repaint();
		}
	});
	name.setFocusPainted(false);
}