import java.awt.*;

public class TestPieChart
{
   public static void main(String[] args)
   {  
      PieChartWriter obj=new PieChartWriter(700);
      obj.setSlice1("Sleep: 7 hours",7,Color.black);
      obj.setSlice4("Recreation: 9 hours",9,Color.gray);
      obj.setSlice2("In class: 3 hours",3,Color.blue);
      obj.setSlice3("Homework: 5 hours",5,Color.red);
    
   }
}