
public class LinkedListWithoutCollectionFramework {

    //node class for in which one is stroing data and other is storing next location 
    class Node{  
        String data;
        Node next;

        public Node(String data){ //consturctor 
            this.data = data;
            this.next = null; // next is the last element which next location will be null
        }
    }

    private Node head; // first element is called head 

    //add element at first 
    public void addFirst(String add){
        Node newNode = new Node(add); // declaring new node for which store value after adding node
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head; 
        head = newNode;
    }

    //add element to last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // iterate throgh the nodes to find last element and add element to last
        Node currentNode = head;
        while(currentNode.next != null){ 
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //delete first element 
    //simple context is when it found first element it link the head with next element so that the first element get removed
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    //delete last element
    //iterate through the element and linked second last element to next to that last element gets removed
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {

        LinkedListWithoutCollectionFramework list = new LinkedListWithoutCollectionFramework();
        list.addFirst("a");
        list.addLast("d");
        list.addFirst("b");
        list.addLast("c");

        list.deleteFirst();
        list.deleteLast();
        
        list.printList();

 }
        
}
