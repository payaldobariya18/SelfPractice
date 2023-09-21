public class Skill {

    public static void main(String[] args) {
     length();
     startswith();
     specifiedposition();
     replacespecificchar();
    }
     static void length() {
        // length of given string
           String str = "Mozilla Firefox.com";
           System.out.println("The string length of \"" + str + "\" is : " + str.length());
       }
       // string starts with another string
     static void startswith() {
         String one = "London is a very cold country.";
         String two = "Canada is also a cold country in the world.";
         String answer = "Canada";

     boolean answer01 = one.startsWith(answer);
     boolean answer02 = two.startsWith(answer);
         System.out.println(one +  "Starts with" + answer + " ? " + answer01);
         System.out.println(two +  "Starts with" + answer + " ? " + answer02);
     }
    // substring of a given string at two specified positions
    static void specifiedposition(){
        String sen = "ChatGPT is a very useful application in any field.";
        System.out.println("Old: " + sen);
        System.out.println("New: " + sen.substring(4,12));
    }
    //  replace specific character
    static void replacespecificchar(){
        String name = "Payal Dobariya";
        System.out.println("Old: " + name);
        System.out.println("New: " + name.replace('a','o'));
    }

}
