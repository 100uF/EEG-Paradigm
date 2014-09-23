package Paradigm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

import javax.swing.*;

public class mainsketch extends JFrame implements MouseListener {
	
	 JButton blk = null;
	 JButton red = null;
	 JPanel pane = null;
	 JLabel label1=null;
	 JLabel label2=null;
	 
	 public mainsketch(){
		 ImageIcon image1 = new ImageIcon("D://Users//Public//Pictures//Sample Pictures//introduction.jpg");

	    pane= new JPanel();
	    label1=new JLabel();
	    label1.setIcon(image1);
	    
	    pane.add(label1);
	     
	    this.add(pane,BorderLayout.NORTH);
	    
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setVisible(true);
	    this.addMouseListener(this);
	    
	    
	  // remove window frame 
	    
	  this.dispose();
      this.setUndecorated(true);
      this.setAlwaysOnTop(true);
      this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
      this.getGraphicsConfiguration().getDevice().setFullScreenWindow(this);

        // switching to fullscreen mode

        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainsketch a = new mainsketch();
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		new mainsketch2(); 
		this.dispose();
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}





class mainsketch2 extends JFrame implements MouseListener{
	
	 JButton blk = null;
	 JButton red = null;
	 JPanel pane = null;
	 JLabel label1=null;
	 JLabel label2=null;
	 
	 public mainsketch2(){
		 ImageIcon image1 = new ImageIcon("D://Users//Public//Pictures//Sample Pictures//ready.jpg");

	    pane= new JPanel();
	    label1=new JLabel();
	    label1.setIcon(image1);
	    
	    pane.add(label1);
	    pane.setBounds(0, 0, new ScreenSize().getScreenWidth(), new ScreenSize().getScreenHeight());
	    
	    this.add(pane,BorderLayout.NORTH);
	    
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setVisible(true);
	    this.addMouseListener(this);

	    
	  // remove window frame 
	    
	  this.dispose();
     this.setUndecorated(true);
     
     pane.setBounds(0, 0, new ScreenSize().getScreenWidth(), new ScreenSize().getScreenHeight());

      // switching to fullscreen mode

      GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainsketch2();
		
	}

	
	//Êó±êµã»÷ÇÐ»»
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Session1 mtt = new Session1();
		mtt.start(); 
		this.dispose();
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
