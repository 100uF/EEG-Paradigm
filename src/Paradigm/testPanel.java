//ѭ������ͼƬ


package Paradigm;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Timer;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class testPanel {


 private JFrame f = new JFrame("����");
 private Box horizontal = Box.createHorizontalBox();

 public void setPanelImage(Image image){
  horizontal.removeAll();
  JTestPanel panel=new JTestPanel(image);
  horizontal.add(panel);
  f.add(horizontal);
  f.setVisible(true);
  
  
 }
 /**
  * Create the application.
  */
 public testPanel() {
  init();
 }

 public void init(){
  //���ô���װ��Ʒ(�����С��)
  f.setUndecorated(true); 
  //�ö���ʾ
  f.setAlwaysOnTop(true);
  //����������ô������
  f.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
  f.getGraphicsConfiguration().getDevice().setFullScreenWindow(f);   
//  f.setSize(415,280);
  Image img=new ImageIcon("C://Users//Public//Pictures//Sample Pictures//header6.jpg").getImage();
   JTestPanel panel=  new JTestPanel(img);
    
    f.getLayeredPane().add(panel, new Integer(Integer.MIN_VALUE));
    panel.setBounds(0, 0, new ScreenSize().getScreenWidth(), new ScreenSize().getScreenHeight());
   
    
    ((JPanel)f.getContentPane()).setOpaque(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
 }


 public void close(){
	 f.dispose();
 }
}
