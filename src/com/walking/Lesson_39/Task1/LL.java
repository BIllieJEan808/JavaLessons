package com.walking.Lesson_39.Task1;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void push(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

     public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
         System.out.print("END");
     }

     public void insertLast(int value){
        if (tail == null){
            push(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

     }

    public int popFIFO() { //deleteFirst first in first out
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;

    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //deleteLast first in last out
    public int popFILO(){
        if(size <= 1){
            return popFIFO();
        }

        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public void insert(int value, int index){
        if (index == 0){
            push(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
         for (int i = 1; i < index; i++) {
             temp = temp.next;
         }

         Node node = new Node(value, temp.next);
         temp.next = node;

         size++;
     }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;

        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


}
