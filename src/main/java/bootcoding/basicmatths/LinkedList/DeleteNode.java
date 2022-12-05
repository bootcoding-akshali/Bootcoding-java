package bootcoding.basicmatths.LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        Node node = lastDeleteNode();
        printDeleteNode(node);
        lastDeleteNode();
    }
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static void printDeleteNode(Node head){
        Node temp = head;
        System.out.println("Delete Last Node :");
        while (temp !=null){
            System.out.println(temp.data);
            if (temp.next.next == null){
                temp.next = null;
            }
            temp = temp.next;
        }

    }
    private static Node lastDeleteNode() {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        Node head = firstNode; // 10
        head.next = secondNode; // 10 -> 20
        secondNode.next=thirdNode; // 10 -> 20 -> 30
        thirdNode.next=fourthNode; // 10 -> 20 -> 30 -> 40
        return head; // 10 (starting node)
    }



}
