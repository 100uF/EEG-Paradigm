package Paradigm;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class JTestPanel extends JPanel{

    protected Image image;

    public JTestPanel(Image image){

        super();
        this.image=image;

    }

  public void paintComponent(Graphics g)
      {
        super.paintComponent(g);

       //参数是定位图片的位置。

        if (this.image != null)   g.drawImage(this.image, 0, 0, 1680,1050, this);
      }

}




