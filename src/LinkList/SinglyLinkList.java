package LinkList;

public class SinglyLinkList {

    Node head;
    Node last;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            last = head;
        } else {
            last.next=node;
        }
        last=node;


/*
        Node node = head;
        while (node == null) {
         node.data=data;
         node=node.next;
        }*/

    }

    public void pintList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkList linkList = new SinglyLinkList();

        for (int i = 1; i <= 10; i++) {
            linkList.insertNode(i);
        }

        linkList.pintList();
    }
}
