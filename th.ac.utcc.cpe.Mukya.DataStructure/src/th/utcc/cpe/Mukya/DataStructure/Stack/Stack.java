/**
 * @author Mukya Wongdaphanich 5907101012
 */

package th.utcc.cpe.Mukya.DataStructure.Stack;

public class Stack {	private int maxSize;
private int [] stackArray;
private int top;

public Stack (int z){
	this.maxSize=z;
	stackArray = new int[maxSize];
	top=-1;
}
public void push(int p){
	stackArray[++top]=p;
}
public int pop(){
	return stackArray[top--];
}
public boolean isEmthy(){
	return (top==-1);
}
public boolean isFull(){
	return (top==maxSize-1);
}

public static void main(String[]args){
	Stack a = new Stack(10);
	
	for(int i=1; !a.isFull();i++){
		a.push(10*i);
	}
	for( ; !a.isEmthy() ; ){
		int i = a.pop();
		System.out.print(i+ " ");
	}
	System.out.println(" ");
}
}



