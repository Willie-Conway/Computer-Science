package examples;

// Type Erasure

// Generics

// The reason we have generics is that they provide
// strong compiled time checking and reduce the risk
// of class cast exception and explicit casting of objects

// generics re commonly used for compile time
// and have no use after runtime

public class TypeErasure {
    public class Node<T> {

        // Properties

        // all of this is only used for compilation
        // when the JVM runs our code it removes
        // and adds casting where its neccesary
        // to improve the execution of the code
        private T data;
        private Node<T> next;

        // Constructor

        // replaced by Object

        // everywhere it gets rid of the type parameters

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        // Getter and Setter

        public T getData() {
            return data;
        }
        // ...
    }

    // public class  Node T is replaced by Node

    public class Node {
        private Object data;
        private Node next;

        public node(Object data, Node next) {

            this.data = data;
            this.next = next;

        }

        public Object getData() {
            return data;
        }
        // ...
    }
}





