/*
 *  Created by IntelliJ IDEA.
 *  User: nandinee
 *  Date: 28-Mar-20
 *  Time: 4:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import problem3.myqueue.MyPriorityQueue;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("A", 1);
        obj.insert("B", 4);
        obj.insert("C", 3);
        obj.insert("D", 2);
        obj.insert("E", 5);
        obj.display();
    }

}
