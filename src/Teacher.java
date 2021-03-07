
import java.io.PrintWriter;
/**
 *
 * @author cheryjeff
 */

class Teacher implements CSVPrintable 
{

  String name;
  int phone;
  int id;

   @Override
   public String getName() 
   {
    return name;

   }

   @Override
   public int getId() 
   {
     return id;
   }

   @Override
   public void csvPrintln(PrintWriter out) 
   {
    out.println(getName() + "," + getId() + "," + phone);
    out.close();
   }

}