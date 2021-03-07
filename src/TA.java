
import java.io.PrintWriter;



/**
 *
 * @author cheryjeff
 */
class TA extends Student
{

    @Override
    public int getId()

    { 
        return ID;
    }

    @Override
    public void csvPrintln(PrintWriter out)
    
    {
       out.println(getName() + "," + getId() + "," + phone);

      out.close();

    }
}


