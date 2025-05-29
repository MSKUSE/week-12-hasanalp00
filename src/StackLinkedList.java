public class StackLinkedList<T> implements Stack<T>{

    StackItem<T> top;
    @Override
    public void push(T item) {
        StackItem<T> newBox = new StackItem<T>(item);
        StackItem<T> previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public T pop() throws MyEmptyStackException{
        if(this.top == null){
            throw new MyEmptyStackException("the stack is empty-- you cant pop");
        }
        T tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    public void displayStack(){
        StackItem<T> tempNode=top;
        if(this.isEmpty()) {
            System.out.println("Stack is empty");
        }else{
            System.out.print("Stack: ");
            do {
                System.out.print(tempNode.getData()+" , ");
                tempNode=tempNode.getNext();
            }while(tempNode !=null);

        }
    }
    @Override
    public String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                '}';
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
}

