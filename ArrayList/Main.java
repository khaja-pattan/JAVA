package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
 
 /****************
  * 
  *  syntax is 
  * 
  *   ArrayList < Wrapper-class > reference_variable = new ArrayList<>();
  * 
  *                  ( or )
  * 
  *   List < Wrapper-class > reference_variable = new ArrayList<>();
  * 
  * 
  *  ******************/     


        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();

        // add the element in List 

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        arr2.addAll(arr);  //   copy the all elements into this new List at once   arr2 = {10,20,30,40,50}

   

    
        arr.removeFirst();   // remove 0 index element 
        arr.removeLast();   // remove last (n) index element 
        arr.size(); // return the size of array 
        arr.contains(30) ;  // return ture if element contain in array 
       arr.equals(arr2) ;  // return ture if both list are equles
       arr.clear();
       arr2.forEach(n-> System.out.println(n));

    }
}
