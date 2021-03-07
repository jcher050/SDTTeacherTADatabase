
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cheryjeff
 */
class Student implements CSVPrintable{

int ID;
long phone;
String name;

@Override
public String getName() 
    {
     return name;
    }

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


