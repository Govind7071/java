// First interface
interface A {
    void showA();
}

// Second interface
interface B {
    void showB();
}

// Class implementing multiple interfaces
class C implements A, B {

    // Implementing methods of A
    public void showA() {
        System.out.println("Interface A method");
    }

    // Implementing methods of B
    public void showB() {
        System.out.println("Interface B method");
    }
}

// Main class
public class Exp10 {
    public static void main(String[] args) {
        C obj = new C();

        obj.showA();
        obj.showB();
    }
}
