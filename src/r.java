
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R
 */
public class r {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> row1 = new ArrayList <String>();
        ArrayList <String> row2 = new ArrayList <String>();
        ArrayList <String> row3 = new ArrayList <String> ();
        ArrayList <ArrayList<String>> myList = new ArrayList <ArrayList <String>> ();

        row1.add("2");
        row1.add("3");
        row2.add("4");
        row2.add("5");
        row3.add("6");
        row3.add("7");

        myList.add(row1);
        myList.add(row2);
        myList.add(row3);

        for (int row = 0; row<myList.size(); row++) {
            for (int col = 0; col<=1; col++) {
                System.out.println (myList.get(row).get(col)
                        + " multiplied by 2 = "
                        + (Integer.parseInt(myList.get(row).get(col))*2) + "\n");
            }
        }

    }
    }
    

