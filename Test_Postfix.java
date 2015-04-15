import java.util.*;
import java.io.*;

//David Walker
//prog4 cscd300, Stack
//4/27/2014

public class Test_Postfix
{
   /*
   main function
   reads input from file
   compares the data and stores it as a float, int or string depending on if it's a number of op
   */
   public static void main (String[] args) throws FileNotFoundException
   {
   Scanner fin = new Scanner(new File(args [0]));
   SLinkedList s = new SLinkedList();
      while(fin.hasNext())
      {
        int i;
        float sum=0;
        float d;
        String st;
        Node n;
        if(fin.hasNextFloat()==true)//reads data from file if it fits the parameter of a float
        {
            d = fin.nextFloat();  
            //fin.next();
            n = new Node(d);
            s.addFirst(n);
        }
        else if(fin.hasNextInt()==true)//I don't think this does anything ever, but it's int instead of float
        {
            i = fin.nextInt();
            //fin.next();
            n = new Node(i);
            s.addFirst(n);
        } 
        else//if data from file is not a number(int/float), it is read by this else, compared with the math symbols
        {
            st = fin.next();
            float o = (float)s.removeFirst();
            float t = (float)s.removeFirst();
            //System.out.println(o + " " + st + " " + t);
            if(st.equals("+"))
            {
               sum = t + o;
            }
            else if(st.equals("-"))
            {
               sum = t - o;
            }
            else if(st.equals("*"))
            {
               sum = t * o;
            }
            else if(st.equals("/"))
            {
               sum = t * o;
            }
            n = new Node(sum);
            s.addFirst(n);
        }
      }
      fin.close();
      
   System.out.println(s);
   }//endmain
}//endclass