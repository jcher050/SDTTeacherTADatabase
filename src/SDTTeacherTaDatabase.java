
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author cheryjeff
 */

public class SDTTeacherTaDatabase 
{
    
    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
  public static void main(String[] args) throws IOException 
 
  {
     
       System.out.println("Please enter the number of "
               + "personel file that you will be entering ");    

       Scanner theusersinput = new Scanner(System.in);
       
       
 if(theusersinput.hasNextInt())
   {          
       int numbofinputline;
        
       numbofinputline = Integer.parseInt(theusersinput.nextLine());
              
       CSVPrintable[] anydatabase;
       
       anydatabase = new CSVPrintable[numbofinputline];

       PrintWriter out=new PrintWriter(new File("out.csv"));

       int loopcounter = 0;
       
       
       System.out.println("Enter each line for each personnel in the order below");
       System.out.println("Position/Name/Student's ID/Teacher's ID/Phone ");
       
       
  do
    {
           
        String[] eachwords;
        eachwords = theusersinput.nextLine().split(" ");
        eachwords[0] = eachwords[0].toLowerCase();
        
        if(eachwords[0].equals("student"))

           {

             try {

             String name=eachwords[1]+" "+eachwords[2];

             int id=Integer.parseInt(eachwords[3]);

             long phone=Long.parseLong(eachwords[5]);

             Student Studs=new Student();

               Studs.ID=id;

               Studs.name=name;

               Studs.phone=phone;

               Studs.csvPrintln(out);

                  }

                catch(Exception abc)

                  {
                   System.out.println("ERROR!!! "
                         + "Please enter the full line of info again!");
                   System.out.println("In that order:"
                        + " Position, Name, Student ID, Teacher's ID, Phone ");
                  }

            }
        
        else if(eachwords[0].equals("teacher"))

           {

            try {

                  String name=eachwords[1]+" "+eachwords[2];

                  int id=Integer.parseInt(eachwords[4]);

                  int phone=Integer.parseInt(eachwords[5].substring(eachwords[5].
                            length()-4, eachwords[5].length()));

                   Teacher teach=new Teacher();

                           teach.id=id;

                           teach.name=name;

                           teach.phone=phone;

                           teach.csvPrintln(out);

                }

            catch(Exception abc)

               {
                   System.out.println("ERROR!!! "
                         + "Please enter the full line of info again!");
                   System.out.println("In that order:"
                        + " Position, Name, Student ID, Teacher's ID, Phone ");
               }

          }

        else if(eachwords[0].equals("ta"))

          {

           try {

                  String name=eachwords[1]+" "+eachwords[2];

                  int id=Math.max(Integer.parseInt(eachwords[3]), 
                          Integer.parseInt(eachwords[4]));

                  long phone=Long.parseLong(eachwords[5].substring(eachwords[5].
                          length()-4,eachwords[5].length()));

                             TA assist=new TA();

                                assist.ID=id;

                                assist.name=name;

                                assist.phone=phone;

                                assist.csvPrintln(out);

                }

            catch(Exception abc)

               {
                 System.out.println("ERROR!!! "
                         + "Please enter the full line of info again!");
                   System.out.println("In that order:"
                        + " Position, Name, Student ID, Teacher's ID, Phone ");
               }

           }

        else {
               System.out.println("Data was entered incorrectly ");
               System.out.println("Please Re-type the data again in that order:"
                        + " Position, Name, Student ID, Teacher's ID, Phone ");
             }
        
        
        
        loopcounter++;

    } while(loopcounter < numbofinputline);  
       
  }
 else { System.out.println("Wrong input. Goodbye! ");} 
       
  }
  
}
