public class Node {
    

   Student25 data;
   Node prev;
   Node next ;
   
   Node(){
   }
    Node(Student25 data){
        this.data = data;
        prev = null;
        next = null;
    }
    Node(Node prev , Student25 data , Node next ){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
   
}
