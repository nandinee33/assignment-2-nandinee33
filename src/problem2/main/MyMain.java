/*
 *  Created by IntelliJ IDEA.
 *  User: nandinee
 *  Date: 28-Mar-20
 *  Time: 4:00 PM
 */
package problem2.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(5);
        obj.insert(10);
        obj.insert(1);
        obj.insert(6);
        obj.insert(50);
        obj.insert(40);
        obj.insert(30);
        obj.preVSpost();
    }
}
