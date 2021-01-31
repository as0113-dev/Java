package DataStructure;

public class testing {
    public static void main(String[] args) {
        
        LinkedList list1 = new LinkedList();
        for (int i = 1; i < 6; i++) {
            list1.add(i*2);
        }
        list1.printList();
        list1.addFirst(0);
        list1.printList();
        list1.addMiddle(5, 1);
        list1.printList();
        System.out.println(list1.size);
        list1.remove(10);
        list1.printList();
        System.out.println(list1.size);
    }
    
}
