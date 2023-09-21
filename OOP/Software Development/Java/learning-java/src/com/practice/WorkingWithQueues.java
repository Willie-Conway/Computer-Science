
// Intro to Data Structures

// A data structure is a way of you organizing, maintaining, and manipulating data.
// Data can be manipulated in various different ways from arrays, lists, maps, queues, stacks, etc.

// a data structure is simply a way of organizing data. In computer science
// data is topic which is very interesting when utilizing different data.

// Data Structures are essential to problem-solving

// Arrays

// a variable  is a box where you can store only one thing.
// a normal variable can on store one value
// with an array you have to specify the initial size.
// If you hava a new element and the array is full, you can not expand the size
// this is when lists come into place

//Lists

// with lists, you don't  hve to allocate the size, you to say that the list can
// only attain 5 elements or 10 elements, you can define the size the list
// if you want, if you  know the
// number or size initially.
// but the cool thing about list is that if you want
// to keep adding elements inside, you can do it.
// So internally its handled for you.
// So for arrays you say sorry,  if you only want 5 elements,
// all I can handle is five elements
// Whereas with list you can add a sequence of elements, its nt restricted
// or fixed

//  Reference: Big-O-Notation

// Exploring the List api

// List API ( Application Programming Interface)

//available methods given by the list interface

// Generics

// Sets

// the set data structure is very similar to list.
// The only difference is that the set can not have duplicates
// So if you have two elements that are the same, the set doesn't
// allow duplicates in the list, and also the order is not the guarantee

// Maps

// allows us to store key value pairs,
// where you store an object, name, and age
// what a map actually does is allow you
// to save the key and its value.
// so it's a key value pair data structure.

// are not limited to primitives and strings

// HashMap and HashTable are the most popular

// Maps are good for distinguishing coding challenges on
// Leet-code and hackerrank

// Stacks
// LAST IN FIRST OUT (LIFO)

// If you want to add elements to a stack,
// you have to call the method push()
// if you want to retrieve the last element
// you would have to use the method pop()
// to remove elements from the stack
// until you reach the last element.
// LIFO are how stacks work

// The stack is accustomed to using LIFO principle

// Most the data structures
// are pretty much the same when it comes to api
// it's just pretty much the implementation
// that does differ, and you should know when to
// use a particular data structure when solving a problem.


// QUEUES
// FIRST IN FIRST OUT (FIFO)

// What a queue is like going to supermarket
// where two people want to pay for an item in a supermarket
// you go first and pay for your item, then your gone,
// then the second person goes in and pays for their item
// and their gone.

// The queue is accustomed to using the FIFO principle

// queue data structure is a bit different,



package com.practice;

import java.awt.*;
import java.util.*;
import java.util.List;

public class WorkingWithQueues {
    public static void main(String[] args) {

        // Create Person Queue
        // Create Linked List
        // The PriorityQueue stores its elements
        // internally according to its natural order if they implement
        // comparable order

        // offer() returns force when queue is full
        // add() will throw an exception
        Queue<Person> queue = new LinkedList<>();
//        queue.add(new Person("James"));
        queue.offer(new Person("James"));
        queue.offer(new Person("Jamila"));
//        queue.add(new Person("Jamila"));
        queue.offer(new Person("Abu"));
//        queue.add(new Person("Abu"));


        // log everyone in the queue
        System.out.println(queue);

        // Peek to see who's at the font of queue (FIFO)
        System.out.println(queue.peek());

        // poll() will return null if
        // the queue is empty (null)
        queue.poll();

        // remove() will throw an exception
        // if the queue is empty
//        queue.remove();


        // Log queue

        System.out.println(queue);

        // loop
        // functional programming
        queue.forEach(person -> System.out.println(person.name));

        // First In First Out (FIFO)

    }

    // Create Person object
    // Pass by Reference String name or Person
    static class Person {
        String name;
        Person(String name) {
            // Refers to "this" person name
            this.name = name;
        }

        // toString

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}




