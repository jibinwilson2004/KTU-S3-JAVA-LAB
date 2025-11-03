// made by JIBIN WILSON S7 CSE
import java.util.Scanner;

public class DoublyLinkedListDemo {
    static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    static class DoublyLinkedList {
        Node head, tail;

        void addLast(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        boolean deleteFirstOccurrence(int value) {
            Node curr = head;
            while (curr != null) {
                if (curr.data == value) {
                    if (curr.prev != null) curr.prev.next = curr.next; else head = curr.next;
                    if (curr.next != null) curr.next.prev = curr.prev; else tail = curr.prev;
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }

        void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + (curr.next != null ? " <-> " : ""));
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }
        System.out.print("Enter element to delete: ");
        int del = sc.nextInt();
        boolean removed = list.deleteFirstOccurrence(del);
        System.out.println(removed ? "Element deleted." : "Element not found.");
        System.out.println("List after deletion:");
        list.display();
        sc.close();
    }
}


