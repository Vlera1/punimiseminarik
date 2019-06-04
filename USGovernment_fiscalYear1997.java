import java.awt.*;
import javax.swing.*;


public class USGovernment_fiscalYear1997 extends JPanel
 { 
   private int persIncomeTax;
   private int secMedicTax;
   private int corpTax;
   private int exCustomTax;
   private int borToCoverDeficit;
   
   private int securityMedic;
   private int natDefence;
   private int socProg;
   private int natDebt;
   private int communityDevelop;
   private int generalGov;
   
   private String sentence1 = "";
   private String sentence2 = "";
   private String sentence3 = "";
   private String sentence4 = "";
   private String sentence5 = "";
   
   private String outlay1 = "";
   private String outlay2 = "";
   private String outlay3 = "";
   private String outlay4 = "";
   private String outlay5 = "";
   private String outlay6 = "";
   
   private Color color1_1;
   private Color color1_2;
   private Color color1_3;
   private Color color1_4;
   private Color color1_5;
   
   private Color color2_1;
   private Color color2_2;
   private Color color2_3;
   private Color color2_4;
   private Color color2_5;
   private Color color2_6;
   
   public USGovernment_fiscalYear1997()
    { 
//ne konstruktor behet krijimi i dritares
      JFrame gov = new JFrame();
      gov.getContentPane().add(this);
      gov.setTitle("U.S. Government in Fiscal Year 1997");
      gov.setSize(900, 600);
      gov.setVisible(true);
    }
   public void paintComponent(Graphics g)
    { 
//ne kete metode perdoret klasa Graphics me te cilen bejme vizatime ne dritaren e krijuar

      g.setColor(Color.PINK);
      g.fillRect(0, 0, 900, 600);
      g.setColor(Color.BLACK);
      g.drawString("INCOME", 150, 55);
      g.drawString("OUTLAY", 570, 55);
      
      g.setColor(color1_1);
      g.fillArc(90, 100, 200, 200, 0, persIncomeTax);
      g.drawString(sentence1, 95, 430);
      
      g.setColor(color1_2);
      g.fillArc(90, 100, 200, 200, persIncomeTax, secMedicTax);
      g.drawString(sentence2, 95, 450);
      
      g.setColor(color1_3);
      g.fillArc(90, 100, 200, 200, persIncomeTax+secMedicTax, corpTax);
      g.drawString(sentence3, 95, 470);
      
      g.setColor(color1_4);
      g.fillArc(90, 100, 200,200, persIncomeTax+secMedicTax+corpTax, exCustomTax);
      g.drawString(sentence4, 95, 490);
      
      g.setColor(color1_5);
      g.fillArc(90, 100, 200, 200, persIncomeTax+secMedicTax+corpTax+exCustomTax, (360-(persIncomeTax+secMedicTax+corpTax+exCustomTax)));
      g.drawString(sentence5, 95, 510);
      
      g.setColor(color2_1);
      g.fillArc(500, 100, 200, 200, 0, securityMedic);
      g.drawString(outlay1, 525, 430);
      
      g.setColor(color2_2);
      g.fillArc(500, 100, 200, 200, securityMedic, natDefence);
      g.drawString(outlay2, 525, 450);
      
      g.setColor(color2_3);
      g.fillArc(500, 100, 200, 200, securityMedic+natDefence, socProg);
      g.drawString(outlay3, 525, 470);
      
      g.setColor(color2_4);
      g.fillArc(500, 100, 200, 200, securityMedic+natDefence+socProg, natDebt);
      g.drawString(outlay4, 525, 490);
      
      g.setColor(color2_5);
      g.fillArc(500, 100, 200, 200, securityMedic+natDefence+socProg+natDebt, communityDevelop);
      g.drawString(outlay5, 525, 510);
      
      g.setColor(color2_6);
      g.fillArc(500, 100, 200, 200, securityMedic+natDefence+socProg+natDebt+communityDevelop, (360-(securityMedic+natDefence+socProg+natDebt+communityDevelop)));
      g.drawString(outlay6, 525, 530);
    }
   public void setSlice1_1(String fjalia1_1, int vlera1_1, Color ngjyra1_1)
    { 
//funksionet setSlice perdoren per te bere vizatimet bazuar ne vlerat e dhena
      sentence1 = fjalia1_1;
      persIncomeTax = vlera1_1*360/100;
      color1_1 = ngjyra1_1;
      this.repaint();
    }
   public void setSlice1_2(String fjalia1_2, int vlera1_2, Color ngjyra1_2)
    { 
      sentence2 = fjalia1_2;
      secMedicTax = vlera1_2*360/100;
      color1_2 = ngjyra1_2;
      this.repaint();
    }
   public void setSlice1_3(String fjalia1_3, int vlera1_3, Color ngjyra1_3)
    {
      sentence3 = fjalia1_3;
      corpTax = vlera1_3*360/100;
      color1_3 = ngjyra1_3;
      this.repaint();
    }
   public void setSlice1_4(String fjalia1_4, int vlera1_4, Color ngjyra1_4)
    {
      sentence4 = fjalia1_4;
      exCustomTax = vlera1_4*360/100;
      color1_4 = ngjyra1_4;
      this.repaint();
    }
   public void setSlice1_5(String fjalia1_5, int vlera1_5, Color ngjyra1_5)
    {
      sentence5 = fjalia1_5;
    //borToCoverDeficit = vlera1_5*360/100;
      color1_5 = ngjyra1_5;
      this.repaint();
    }
   public void setSlice2_1(String fjalia2_1, int vlera2_1, Color ngjyra2_1)
    {
      outlay1 = fjalia2_1;
      securityMedic = vlera2_1*360/100;
      color2_1 = ngjyra2_1;
      this.repaint();
    }
   public void setSlice2_2(String fjalia2_2, int vlera2_2, Color ngjyra2_2)
    {
      outlay2 = fjalia2_2;
      natDefence = vlera2_2*360/100;
      color2_2 = ngjyra2_2;
      this.repaint();
    }
   public void setSlice2_3(String fjalia2_3, int vlera2_3, Color ngjyra2_3)
    {
      outlay3 = fjalia2_3;
      socProg = vlera2_3*360/100;
      color2_3 = ngjyra2_3;
      this.repaint();
    }
   public void setSlice2_4(String fjalia2_4, int vlera2_4, Color ngjyra2_4)
    {
      outlay4 = fjalia2_4;
      natDebt = vlera2_4*360/100;
      color2_4 = ngjyra2_4;
      this.repaint();
    }
   public void setSlice2_5(String fjalia2_5, int vlera2_5, Color ngjyra2_5)
    {
      outlay5 = fjalia2_5;
      communityDevelop = vlera2_5*360/100;
      color2_5 = ngjyra2_5;
      this.repaint();
    }
   public void setSlice2_6(String fjalia2_6, int vlera2_6, Color ngjyra2_6)
    {
      outlay6 = fjalia2_6;
    //generalGov = vlera2_6;
      color2_6 = ngjyra2_6;
      this.repaint();
    }
  
 }