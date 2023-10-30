import java.util.ArrayList;

interface IStack<T> {
    T pop();
    boolean push(T ob);
}

class MyStack<T> implements IStack<T>{
    ArrayList<T> stacklist = null;
    public MyStack() {
        stacklist = new ArrayList<T>();
    }
    public T pop() {
        if(stacklist.size() == 0)
            return null;
        else {
            return stacklist.remove(0);
        }
    }
    public boolean push(T ob) {
        stacklist.add(0, ob);
        return true;
    }
}
public class java09 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>(); //객체 생성
        for(int i = 0; i < 10; i++)
        {
            stack.push(i); //상속받은 push 메소드를 통해 add 수행
        }
        while(true) {
            Integer n = stack.pop(); //값을 하나씩 꺼내와서 출력
            if(n == null) {
                break;
            }
            System.out.print(n + " ");
        }
    }
}
