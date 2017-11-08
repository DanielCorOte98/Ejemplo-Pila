package corderooterodaniel.com;

public class Main {

    public static void main(String[] args) {
	Pila  P = new Pila ();
        P.push (2);
        P.push (8);
        P.push (1);

        P.peek ();
        P.cima ();
        P.pop ();
        P.peek ();
        P.pop ();
        P.cima ();
        P.pop ();
        P.peek ();

    }
}
