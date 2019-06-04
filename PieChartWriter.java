import java.awt.*;
import javax.swing.*;

public class PieChartWriter extends JPanel
{private int width;
   private String sentence1="";
   private String sentence2="";
   private String sentence3="";
   private String sentence4="";
   private String sentence5="";
   private String sentence6="";
   private int madhsia1;
   private int madhsia2;
   private int madhsia3;
   private int madhsia4;
   private int madhsia5;
   private int madhsia6;
   private Color color1;
   private Color color2;
   private Color color3;
   private Color color4;
   private Color color5;
   private Color color6;
  
   public PieChartWriter(int w)
   
   { width=w;
   
      JFrame obj=new JFrame();
      obj.getContentPane().add(this);
      obj.setTitle("Pie Chart");
      obj.setSize(width,width);
      obj.setVisible(true);
   }
   public void paintComponent(Graphics g)
   {
      g.setColor(color1);
      g.fillArc(150,150,375,375,0,madhsia1);
      g.drawString(sentence1,500,160);
      g.setColor(color2);
      g.fillArc(150,150,375,375,madhsia1,madhsia2);
      g.drawString(sentence2,500,175);
      g.setColor(color3);
      g.fillArc(150,150,375,375,madhsia1+madhsia2,madhsia3);
      g.drawString(sentence3,500,190);
      g.setColor(color4);
      g.fillArc(150,150,375,375,madhsia1+madhsia2+madhsia3,madhsia4);
      g.drawString(sentence4,500,205);
      g.setColor(color5);
      g.fillArc(150,150,375,375,madhsia1+madhsia2+madhsia3+madhsia4,madhsia5);
      g.drawString(sentence5,500,220);
      g.setColor(color6);
      g.fillArc(150,150,375,375,madhsia1+madhsia2+madhsia3+madhsia4+madhsia5,madhsia6);
      g.drawString(sentence6,500,235);
   }
   public void setSlice1(String label1,int amount1,Color ngjyra1)
   {
      sentence1=label1;
      madhsia1=amount1*360/24;
      color1=ngjyra1;
      this.repaint();
   }
   public void setSlice2(String label2,int amount2,Color ngjyra2)
   {
      sentence2=label2;
      madhsia2=amount2*360/24;
      color2=ngjyra2;
      this.repaint();
   }
   public void setSlice3(String label3,int amount3,Color ngjyra3)
   {sentence3=label3;
      madhsia3=amount3*360/24;
      color3=ngjyra3;
      this.repaint();}
   public void setSlice4(String label4,int amount4,Color ngjyra4)
   {sentence4=label4;
      madhsia4=amount4*360/24;
      color4=ngjyra4;
      this.repaint();}
   public void setSlice5(String label5,int amount5,Color ngjyra5)
   {sentence5=label5;
      madhsia5=amount5*360/24;
      color5=ngjyra5;
      this.repaint();}
   public void setSlice6(String label6,int amount6,Color ngjyra6)
   {sentence6=label6;
      madhsia6=amount6*360/24;
      color6=ngjyra6;
      this.repaint();}
}