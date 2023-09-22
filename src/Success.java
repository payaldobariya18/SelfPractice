public class Success {

    public static void main(String[] args) {
    contains();
    }
 // returns true if the specified sequence of characters is present in the given string, otherwise it returns false.
   static void contains(){
     String sentence = "Tutor Joe's Computer Educations";
     String middle = "Computer";
     String middle01 = "Computers";
       System.out.println("Given String : " + sentence);
       System.out.println("Specified Sequence of char Values : " + middle);
       System.out.println(sentence.contains(middle));
       System.out.println("Specified Sequence of char Values : " + middle01 );
       System.out.println(sentence.contains(middle01));
   }
}
