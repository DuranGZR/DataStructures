public class Stack {
    Element array[];
    int top;
    int N;

    public Stack() {
        array = new Element[N];
        this.N = N;
        top = -1;
    }

    Element top(){
        return array[top];
    }

    boolean isEmpty(){
        if (top == -1){
            return true;
        }
        else {
            return false;
        }
    }

    boolean isFull(){
        if (top == N-1){
            return true;
        }
        else {
            return false;
        }
    }

    void push(Element element){
        if (!isFull()){
            top++;
            array[top] = element;
        }
    }

    Element pop(){
        if (!isEmpty()){
            top--;
            return array[top+1];
        }
        return null;
    }



}
