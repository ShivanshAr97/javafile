class Base {
    String ds;
    int front = -1, rear, max;
    int[] arr;
    Base(String ds, int max) {
        this.ds = ds;
        rear = ds == "Stack" ? 0 : -1;
        this.max = max;
        arr = new int[max];
        System.out.println(ds + " constructed");
    }
    void push (int n) {
        if (front == max-1) System.out.println("Overflow!");
        else {
            if (rear == -1) rear = 0;
            arr[++front] = n;
            System.out.println(n+ " pushed");
        }
    }
    void pop() {
        if (rear > front || rear == -1) System.out.println("Underflow!");
        else System.out.println(arr[ds=="Stack" ? front-- :rear++] + " popped");
    }
    void display() {
        if (rear > front || rear == -1) return;
        System.out.print(ds + ": ");
        for(int i = rear; i<=front; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
class Stack extends Base {
    Stack(int max) { super("Stack", max); }
}
class Queue extends Base {
    Queue(int max) { super("Queue", max); }
}
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(1);
        s.push(10);
        s.push(5);
        s.display();
        s.pop();
        s.display();
        Queue q = new Queue(5);
        q.push(10);
        q.push(5);
        q.display();
        q.pop();
        q.display();
    }

}