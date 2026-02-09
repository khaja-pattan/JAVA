package StringBuilderMethods;

public class Main {
    public static void main(String[] args) {
        StringBuilder bf = new StringBuilder();
        StringBuilder bf2 = new StringBuilder("hi   kello");
        bf.append("hi   hello");


        
      
        //    String s = bf.toString();
      // bf.trimToSize(); 

     // bf.isEmpty();
    
     System.out.println( bf.length());  // return the string length

    
   //System.out.println(bf.substring(4)); ;
   
   System.out.println(bf.substring(1,6));  // return the substring at that index from 1 to 6

    bf.codePointAt(1); // return ascii value 

   bf.insert(0,'h');   //  at  0 index add "h"  "hi hello" becomes "hhi hello"
   
   System.out.println(bf);
    bf.setCharAt(0,'n');     //  replace character at 0 index with "n"

        System.out.println(bf.charAt(1));  /// return character at particuler index 
       
        System.out.println(bf.compareTo(bf2));  //  compare the string the method in lexicographicla order 
        
        bf.chars().forEach(System.out::println);  /// resunt the assci values 

        System.out.println("capacity : "+bf.capacity());    // return  capatiry 
       //System.out.println( bf.charAt(0));
       // bf.deleteCharAt(0);  // delate charAt index 

        // bf.reverse();



      
    }
}
