import org.junit.Test;

public class MainClassTest extends MainClass
{
   @Test
   public void testGetLocalNumber()
   {
      int a = getLocalNumber();
      if(a != 14){
         System.out.println("Not equal to 14");
      } else {
         System.out.println("Equal to 14");
      }
   }

}
