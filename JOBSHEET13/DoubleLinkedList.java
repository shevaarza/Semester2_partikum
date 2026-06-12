public class DoubleLinkedList {
    
    Node head;
    Node tail;

    DoubleLinkedList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFrist(Student25 data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student25 data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            
        }
    }

    void insertAfter(String key , Student25 data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp!= null && !temp.data.nim.equalsIgnoreCase(key)){
            temp = temp.next;
        }
           if(temp == null) {
            System.out.println("Insertion failed ("+ key + ") not found !");
           }else {
            if(temp == tail){
                addLast(data);
            }else{
                newNode.next = temp.next;
                newNode.prev = temp;

                temp.next.prev = newNode;
                temp.next = newNode;
            }
           }
    }

    void print(){
        if(!isEmpty()){
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");

        }else{
            System.out.println("Double linked list is currently empty!!");
        }
    }

    void removeFrist(){
        if(isEmpty()){
            System.out.println("double linked list is currently empty");

        }else if (head == tail){
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Double linked list is currently empty");

        }else if(head == tail){
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {
        if(isEmpty()){
            System.out.println("Double linked list is currently empty");
        }else if(index == 0 ){
            removeFrist();
        }else{
            Node temp = head ;
            for(int i= 0 ; i<index; i ++){
                temp = temp.next;
            }

            if(temp == tail){
                removeLast();
            }else{
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
        
    }
}
