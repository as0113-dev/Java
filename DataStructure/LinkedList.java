package DataStructure;

public class LinkedList {
    Node head;
    int size = 0;

    //creating an empty linked list
    public LinkedList(){}

    //creating a linked list with one argument, making the head its first value
    public LinkedList(int d){
        this.head.data = d;
        this.size += 1; 
    }

    //adds elements on the end of list
    public void add(int d){
        if(this.head == null){
            Node node = new Node(d);
            this.head = node;
            this.head.next = null;
            this.size++;
        }else{
            Node node = new Node(d);
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
            node.next = null;
            this.size++;
        }
    }

    //adds element to start making it the new head
    public void addFirst(int d){
        Node node = new Node(d);
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    //adds element at the specified index
    public void addMiddle(int index, int d){
        if(index >= size){
            System.out.println("Index out of Bound");
        }else{
            int i = 1;
            Node node = new Node(d);
            Node current_1 = this.head;
            Node current_2 = current_1.next;
            while(i != index){
                current_1 = current_1.next;
                current_2 = current_1.next;
                i++;
            }
            current_1.next = node;
            node.next = current_2;
            this.size++; 
        }
    }

    //traverses thru list and if element is in list then removes the node
    public void remove(int d){
        Node current_1 = this.head;
        Node current_2 = current_1.next;

        while(current_2.data != d){
            current_1 = current_1.next;
            current_2 = current_1.next;
        }
        Node temp = current_2.next;
        current_1.next = temp;
        this.size--;
    }

    //prints the linked list
    public void printList() {
        if(this.head == null){
            System.out.println("Nothing to print, List is empty");
        }else{
            //current is at head
            Node current = this.head;
            //traverse till last element in the list
            while(current.next != null){
                System.out.print("["+current.data+"]"+"-->");
                current = current.next;
            }
            //print the last element
            System.out.println("["+current.data+"]");
        }
    }

}
