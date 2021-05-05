import java.util.*;

class Main {
  public static void main(String[] args) {

    //This is the first array we created.
    String[] gear = {"First", "Second", "Third", "Fourth", "Fifth"};

    //This is the original arraylist we created.
    ArrayList<String> stickShift = new ArrayList<String>();
    stickShift.add("tenth");
    
    stickShift.add("eleventh");
    
    stickShift.add("twelth");
    
    stickShift.add("thirteenth");
    
    stickShift.add("fourteenth");
   
    //prints out size of the array
    System.out.println(gear.length);

    //prints out size of the arraylist
    System.out.println(stickShift.size());

    //prints out values of the arraylist
    System.out.println(stickShift);

    //prints out values of the array
    System.out.println(gear);

    //Convert the array to an arraylist
    ArrayList<String> gearShift = new ArrayList<String>(Arrays.asList(gear));

    System.out.println(gearShift);

    //This line removes the second value of the code, the value has to be 1 because the first value in the array count as zero.
    gearShift.remove(1);

    System.out.println(gearShift);

    //These lines print out a new variable we added to the array as well as printing the new array after the added variable.
    gearShift.add("Sixth");
    System.out.println(gearShift);
  }
}