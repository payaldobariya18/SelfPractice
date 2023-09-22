public class skill_01 {
    public static void main(String[] args) {
    characterposition();
    logicaloperator();
    }

    //get the character from a string at a particular index within the string
    static void characterposition(){
     String str = "Stop seeing this ad";
        System.out.println("Given string : " + str);
        int a = str.charAt(0);
        int b = str.charAt(9);
        System.out.println("The Character at POsition 0 is " +(char)a);
        System.out.println("The Character st Position 9 is " + (char)b);
    }
    //logical operators
     static void logicaloperator(){
        int a = 5;
        int b = 2;
        int x = 8;
        int y = 10;
       boolean result01 = a>b &&  x>y;
       boolean result02 = a>b ||  x>y;
         System.out.println(result01);
         System.out.println(result02);
    }




}
