public class InstantiationOrder {
    public static void main(String[] args) {
        // There is 1-st question
        // How do you think, would the next line of the code
        // produce a NullPointerException and if not,
        // then would be occurred static initialization
        // of all classes in hierarchy tree from A to C ?
        C c = null;
        System.out.println(c.x);

        // There is 2-nd question
        // What would be the output after execution the next line?
        A a = new C();
    }
}

interface A{
    int x = 1;
}

class B implements A{
    // variable declaration
    static int y;
    // static init block
    static {
        y=2;
        System.out.println("B static init block");
    }
    // instance init block
    {y=22;}
    // constructor
    B(){
        System.out.println("B constructor. Variable y is "+y);}
}

class C extends B implements A{
    // static init block
    static{
        y=3;
        System.out.println("C static init block");
    }
    // instance init block
    {y=33;}
    // variable declaration.
    // It's ok. Order of declaration variables in the body
    // of the class is no matter.
    // Also remember, variables cannot be override.
    // They are only shadowed. So you can restrict access modifier,
    // what you can't do with overriden methods!
    private static int y;
    // constructor
    C(){
        System.out.println("C constructor. Variable y is "+y);
    }
}
