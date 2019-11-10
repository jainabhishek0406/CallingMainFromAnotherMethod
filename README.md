# CallingMainFromAnotherMethod
code implementation to call main method again from another class method.


Can we call main() method of a class from another class?

Calling java entry point from another method is possible?
 
Yes, this is possible.

How?

Because main method is static method and main method class is public class.

So we already know, we can call static method with class name.

Suppose main method class name is Test, then we can call main method,

Calling approach should be like this - 

String9[] args = {“Testitem”};

Test.main(args)

check this git repo program with sample code implementation.
