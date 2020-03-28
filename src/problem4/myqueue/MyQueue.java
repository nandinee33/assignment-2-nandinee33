/*
 *  Created by IntelliJ IDEA.
 *  User: nandinee
 *  Date: 28-Mar-20
 *  Time: 4:45 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {

    Node front;
    Node rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node ns = new Node();
        ns.setData(data);
        if (front == null) {
            front = ns;
            rear = ns;
        } else {
            rear.setNext(ns);
            rear = ns;
        }
    }

    class Node {

        int data;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}

