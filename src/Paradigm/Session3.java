package Paradigm;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;

/**

 * 以继承TimerTask类的方式实现多线程
 */


public class Session3 extends TimerTask  {

 //private int index = 0;
 Random rand = new Random();
 //mark the amount of the pictures
 int n=1;   
 
 testPanel test=new testPanel();

 

 private Timer timer = new Timer();
 	private static final Image pathtempImg=new ImageIcon("D://Users//Public//Pictures//Sample Pictures/left.jpg").getImage();
    private static final Image normalImg=new ImageIcon("D://Users//Public//Pictures//Sample Pictures//right.jpg").getImage();
    private static final Image activeImg=new ImageIcon("D://Users//Public//Pictures//Sample Pictures//up.jpg").getImage();
    private static final Image TImg=new ImageIcon("D://Users//Public//Pictures//Sample Pictures//down.jpg").getImage();
    private static final Image FImg=new ImageIcon("D://Users//Public//Pictures//Sample Pictures//plus.jpg").getImage();
    private static final Image FRImg=new ImageIcon("D://Users//Public//Pictures//Sample Pictures//rest.jpg").getImage();
    private static final Image SImg=new ImageIcon("D://Users//Public//Pictures//Sample Pictures//header6.jpg").getImage();
    private static final Image[] imageArray=new Image[]{pathtempImg,normalImg,activeImg,TImg,FImg,FRImg};
 
 Date d=new Date();
 Date d2=new Date();
 Calendar cpcalendar = new GregorianCalendar();
 Calendar cpcalendar2 = new GregorianCalendar();
  
   
     
 
 @Override
 public void run() {
	 //获取当前时间
	 Calendar c = Calendar.getInstance();
	 int year = c.get(Calendar.YEAR); 
	 int month = c.get(Calendar.MONTH)+1; 
	 int date = c.get(Calendar.DATE); 
	 int hour = c.get(Calendar.HOUR_OF_DAY); 
	 int minute = c.get(Calendar.MINUTE);
	 int minute2=minute+1;
	 int second = c.get(Calendar.SECOND); 
	 String y=String.valueOf(year);
	 String m=String.valueOf(month);
	 String day=String.valueOf(date);
	 String h=String.valueOf(hour);
	 String min=String.valueOf(minute);
	 String min2=String.valueOf(minute2);
	 String sec=String.valueOf(second);
	 String date1=y+"-"+m+"-"+day+" "+h+":"+min+":"+sec;
	 String date2=y+"-"+m+"-"+day+" "+h+":"+min2+":"+sec;
	 System.out.println(date1);
	
	 
//show the pictures randomly
	 int index = rand.nextInt(4);
	
	 
//  String date1="2014-9-14 21:01:30";
//  String date2="2014-9-14 21:03:00";
  SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  try {
   d=f.parse(date1);
   cpcalendar.setTime(d);

   d2=f.parse(date2);
   cpcalendar2.setTime(d2);
  } catch (ParseException e) {
   e.printStackTrace();
  }
  
  Calendar c2 = Calendar.getInstance();
  if(c2.getTimeInMillis() < cpcalendar.getTimeInMillis()){
   test.setPanelImage(null);
   System.out.println("节目单播放时间未开始！请等待ing....");
  }
  if(c2.getTimeInMillis()>cpcalendar.getTimeInMillis() && c2.getTimeInMillis()<cpcalendar2.getTimeInMillis()){
   
   System.out.println("index="+index+" "+"n="+n);
   
   //if 
   if(n%2==1){
    index=4;
   }
   
//   if(n>=80){
//    index=5;
//    
//	  }
   
   
   test.setPanelImage(imageArray[index]);
   n++;
    
   
   System.out.println("Session3运行ing...当前时间："+c2.getTime());
  }
  
  if(n>=81){
	  
	  restPanel3 rest=new restPanel3();

	  index=5;
	  this.cancel();
	  timer=null;
	  rest.setPanelImage(imageArray[index]);
	  test.close();
	  
	  System.out.println("节目单播放完成！");
	  return;
  }
  
  
 
  
 }

 public void start() {
 // 设置定时任务执行时间，及其速率（2s执行一次）
  timer.scheduleAtFixedRate(this, new Date(), 2000);              
  System.out.println("运行Session3 : " + this.scheduledExecutionTime());

 }
 
 
 public long getScheduleTime() {

  return this.scheduledExecutionTime();

 }
 public static void main(String[] args) {

  


 }



}
