package D36_AbstractClasses.D36_CA1_Abstract;

abstract class A {

    /*
    *   1. An abstract class must be declared with the abstract keyword.
    *   2. Abstract classes cannot be instantiated (Instance)
    *   3. It can have abstract and non-abstract methods.
    *   4. It can have static methods and constructors as well.
    *   5. It can have final methods which will force the subclass not to change the body of the method.
    * */

    abstract void greet(); //There is no method body in an abstract method.

    public final void run() {
        System.out.println("running ... ");
    }
}
