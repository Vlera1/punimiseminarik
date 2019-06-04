import java.awt.*;

public class TestUSGovernment_fiscalYear1997
{
   public static void main(String[] args)
    { 
      USGovernment_fiscalYear1997 obj = new USGovernment_fiscalYear1997();
      obj.setSlice1_1("personal income taxes: 46%", 46, Color.RED);
      obj.setSlice1_2("social security and medicare taxes: 34%", 34, Color.GREEN);
      obj.setSlice1_3("corporate income taxes: 11%", 11, Color.BLUE);
      obj.setSlice1_4("exsice and customs taxes: 8%", 8, Color.MAGENTA);
      obj.setSlice1_5("borrowing to cover deficit: 1%", 1, Color.CYAN);
      
      obj.setSlice2_1("social security and medicare: 38%", 38, Color.YELLOW);
      obj.setSlice2_2("national defence: 20%", 20, Color.BLACK);
      obj.setSlice2_3("social programs: 18%", 18, Color.GRAY);
      obj.setSlice2_4("interest on national debt: 15%", 15, Color.ORANGE);
      obj.setSlice2_5("human and community development: 7%", 7, Color.DARK_GRAY);
      obj.setSlice2_6("genral government: 2%", 2, Color.WHITE);
    }
    }