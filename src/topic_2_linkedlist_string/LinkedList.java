/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_2_linkedlist_string;

/**
 *
 * @author ADMIN
 */
public class LinkedList {
    private Node head; 

        // Method to add a new node in the list
        public void add(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

      // Method to delete a node by value
        public void deleteByValue(String value) {
            if (head == null) return;

            // If the head needs to be removed
            if (head.data.equals(value)) {
                head = head.next;
                return;
            } else if(head.data != value) {      

            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data.equals(value)) {
                    current.next = current.next.next; 
                    return;
                }
                current = current.next;
            }
        }
}

       