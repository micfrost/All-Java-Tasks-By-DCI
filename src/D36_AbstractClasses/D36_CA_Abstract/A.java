package D36_AbstractClasses.D36_CA_Abstract;

abstract class A {

    /*
    *   1. An abstract class must be declared with the abstract keyword.
    *   2. Abstract classes cannot be instantiated (Instance)
    *   3. It can have abstract and non-abstract methods.
    *   4. It can have static methods and constructors as well.
    *   5.
    * */

    abstract void greet();

    public final void run() {
        System.out.println("running ... ");
    }
}
