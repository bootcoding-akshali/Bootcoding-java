package bootcoding.basicmatths.LinkedList;

public class InsertionNode {
    public static void main(String[] args) {
        Node node = FirstInsertData();
        printFirstInsertNode(node);
       FirstInsertData();

    }
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static void printFirstInsertNode(Node head){
        Node temp = head;
        System.out.println(head);
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static Node FirstInsertData(){
        Node newNode = new Node(100);
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node forthNode = new Node(40);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        newNode.next =head;
        head =newNode;
        return head;
    }

}
