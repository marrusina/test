import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
   @Test
   public void testGetLocalNumber()
   {
      int a = getLocalNumber();
      if (a != 14)
      {
         Assert.fail("Number is not equal to 14");
      }

   }

}
