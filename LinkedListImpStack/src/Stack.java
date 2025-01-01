public class Stack {

    Node top;

    public Stack() {
        top = null;
    }
    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        else {
            return false;
        }
    }
}
