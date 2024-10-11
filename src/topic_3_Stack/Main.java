/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_3_Stack;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
		Stack stack = new Stack(5);

        stack.push(50);
        stack.push(70);
        stack.push(80);
        
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Top element is: " + stack.peek());
        System.out.println();
        
        //Use case
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Stack size after pop: " + stack.size());
        
        System.out.println();
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
	}

}


	
