/*
 *  Created by IntelliJ IDEA.
 *  User: nandinee
 *  Date: 28-Mar-20
 *  Time: 5:30 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {

    Node front;
    Node rear;
    int count;

    public MyCircularQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public void enqueue(int roll, int backlog, int a_count) {
        Student st = new Student(roll, backlog, a_count);
        Node ns = new Node();
        ns.setStudent(st);

        if (front == null) {
            front = ns;
        } else {
            rear.setNext(ns);
        }

        rear = ns;
        rear.setNext(front);
        count++;
    }

}
