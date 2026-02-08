package StringMethods;
public class Main{
    public static void main(String[] args) {

        String str = "Hello World !";

        String str2 = "Hello";

         System.out.println(str.length()); // return the string length 

         System.out.println(str.charAt(1));  // return the character at index in this case at index 1 we hava  'e'

         System.out.println(str.substring(0,5));  // return the sub string  in this case "Hello"

         System.out.println(str.equals(str2));  // return ture if both string are equels either false

         System.out.println(str.toLowerCase()); //   "Hello World !"  --->   "hello world !"

         System.out.println(str.toUpperCase());  //   "Hello World !"  --->  "HELLO WORLD !"

         System.out.println(str.isEmpty()); // returns true if the string length is exactly 0

         System.out.println(str.isBlank());  // It returns true if the string is empty

         System.out.println(str.startsWith(str2)); // return ture str2 is sub-part of str

         System.out.println(str.contains("Hell")); // return it is contain in string 

         char[] chArr = str.toCharArray();  // create the character array 

         System.out.println(chArr);  // printing array   

         String NumToString = String.valueOf(23); // conver int to string 
         System.out.println(NumToString);

        String str3 = "Hi every one";
        String[] words = str3.split(" "); // Split at every space   
         
        // Result:
        // words[0] = "Hi"
        // words[1] = "every"
        // words[2] = "one"



    }
}