package Paradigm;

/**
 * 获取屏幕分辨率
 * @author ChenYue
 *
 */
public class ScreenSize {
 /**
  * 屏幕的宽
  */
 private int screenWidth;
 /**
  * 屏幕的高
  */
 private int screenHeight;
 /**
  * 设置屏幕的宽
  * @param screenWidth
  */
 public void setScreenWidth(int screenWidth){
  this.screenWidth = screenWidth;
 }
 /**
  * 获取屏幕的高
  * @return
  */
 public int getScreenHeight() {
  setScreenHeight((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height);
  return screenHeight;
 }
 /**
  * 设置屏幕的高
  * @param screenHeight
  */
 public void setScreenHeight(int screenHeight) {
  this.screenHeight = screenHeight;
 }
 /**
  * 获取屏幕的宽
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
