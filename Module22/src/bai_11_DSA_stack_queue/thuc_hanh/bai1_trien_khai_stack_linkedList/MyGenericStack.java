package bai_11_DSA_stack_queue.thuc_hanh.bai1_trien_khai_stack_linkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack= new LinkedList<>();


    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return  true ;

        } else {
            return  false;
        }
    }
    public int size(){
        return stack.size();
    }
    public void push(T elment){
        stack.addFirst(elment);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public   static  void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("nam");
        stack.push("bon");
        stack.push("ba");
        stack.push("hai");
        stack.push("mot");
        stack.push("khong");
        System.out.println("1.1 Size od stak after push operations : "+ stack);
        System.out.println("1.2 Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("\n 1.3  Size of stack after pop operations: " +stack);


    }
public static  void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
    System.out.println("2.1 Size of stack after push operation :"+ stack);
    System.out.println("2.2  Pop elements from stack : ");
    while (!stack.isEmpty()){
        System.out.println(stack.pop());
    }
    System.out.println("\n 3.3  Size of stack after pop operation :"+ stack);

}


}
