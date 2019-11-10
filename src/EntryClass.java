/**
 * @author Abhishek Jain
 */

class CallingMainAgain{
    //Created this class to call main method again from method MethodCallingMainMethod()

    public void MethodCallingMainMethod()
    {
        String[] args = {"dummyValue"};

        //calling main from here and passing required parameter
        EntryClass.main(args);
    }
}

public class EntryClass {
    //Program entry point class
    //created and maintaining this counter to show calling count plus to avoid infinite loop
    public static int callingCounter = 0;

    public static void main(String[] args) {
        //printing callingCounter variable to track main method calling count
        System.out.println("main method callingCounter is ..." + callingCounter);

        //incrementing callingCounter to avoip loop chain
        callingCounter = callingCounter+1;

        //CallingMainAgain class object creation
        CallingMainAgain callingMainAgain = new CallingMainAgain();

        //added this check to call main method from another function only once.
        if (callingCounter == 1)
            callingMainAgain.MethodCallingMainMethod();
    }
}
