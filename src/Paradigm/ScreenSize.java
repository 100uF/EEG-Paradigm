package Paradigm;

/**
 * ��ȡ��Ļ�ֱ���
 * @author ChenYue
 *
 */
public class ScreenSize {
 /**
  * ��Ļ�Ŀ�
  */
 private int screenWidth;
 /**
  * ��Ļ�ĸ�
  */
 private int screenHeight;
 /**
  * ������Ļ�Ŀ�
  * @param screenWidth
  */
 public void setScreenWidth(int screenWidth){
  this.screenWidth = screenWidth;
 }
 /**
  * ��ȡ��Ļ�ĸ�
  * @return
  */
 public int getScreenHeight() {
  setScreenHeight((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height);
  return screenHeight;
 }
 /**
  * ������Ļ�ĸ�
  * @param screenHeight
  */
 public void setScreenHeight(int screenHeight) {
  this.screenHeight = screenHeight;
 }
 /**
  * ��ȡ��Ļ�Ŀ�
  * @return
  */
 public int getScreenWidth() {
  setScreenWidth((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width);
  return screenWidth;
 }

 public static void main(String [] args){
  System.out.println("width="+new ScreenSize().getScreenWidth());
  System.out.println("heigh="+new ScreenSize().getScreenHeight());
 }
 
}
