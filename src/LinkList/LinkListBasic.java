package LinkList;

public class LinkListBasic {
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

    public void pintList(Node newNode) {
        Node node = newNode;
        while (node != null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }
    }

    public Node addNodeToHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public void deleteNode(int value) {
        Node node = head, previous = null;
        while (node != null) {
            if (node.data == value) {
                if (previous == null) {
                    head = node.next;
                } else {
                    previous.next=node.next;
                }

            }
            previous=node;
            node=node.next;
        }
    }

    public Node addNoteToLast(int data) {
        Node newNode = new Node(data);
        return newNode;
    }

    public void addNodeAfterGivenNode(Node givenNode, int data) {
        Node node = new Node(data);
        node.next = givenNode.next;
        givenNode.next = node;
    }

    public static void main(String[] args) {

        LinkListBasic linkList = new LinkListBasic();
        linkList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        third.next = linkList.addNoteToLast(10);
        //link among the object
        linkList.head.next = second;
        second.next = third;
        linkList.addNodeAfterGivenNode(second, 100);
        linkList.pintList(linkList.head);
        linkList.deleteNode(100);
        System.out.println();
        linkList.pintList(linkList.head);

    }
}
