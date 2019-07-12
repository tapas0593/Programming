
public class Stack {
	int top=-1;
	int[] stackArray;
	Stack(int size){
		stackArray=new int[size];
	}
	void push(int item) {
		if(size()==stackArray.length) {
			System.out.println("OverFlow!! Stack is Full");
		}
		else {
		stackArray[++top]=item;
		}
	}
	int pop() {
		if(top==-1) {
			System.out.println("Underflow!! Stack is empty");
			return -1;
		}
		return stackArray[top--];
	}
	int peek() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;
		}
		else
		return stackArray[top];
	}
	boolean isEmpty() {
		return top==-1;
	}
	int size() {
		return top+1;
	}
}
