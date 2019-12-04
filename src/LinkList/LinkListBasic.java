package LinkList;

public class LinkListBasic {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

    public void pintList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        LinkListBasic linkList = new LinkListBasic();
        linkList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        //link among the object

        linkList.head.next = second;
        second.next = third;
        linkList.pintList();

    }
}
