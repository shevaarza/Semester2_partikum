import org.w3c.dom.Node;

public class SingleLinkedList {

    node25 head;
    node25 tail;

    boolean isEmpty() {
        return (head == null);
    }

    void print() {
        if (!isEmpty()) {
            node25 tmp = head;
            System.out.println("LinkedList Data:");

            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList is empty!!");
        }
    }

    void addFirst(Student25 std) {
        node25 newnode25 = new node25(std, null);

        if (isEmpty()) {
            head = newnode25;
            tail = newnode25;
        } else {
            newnode25.next = head;
            head = newnode25;
        }
    }

    void addLast(Student25 std) {
        node25 newnode25 = new node25(std, null);

        if (isEmpty()) {
            head = newnode25;
            tail = newnode25;
        } else {
            tail.next = newnode25;
            tail = newnode25;
        }
    }

    void insertAfter(Student25 std, String key) {
        node25 newnode25 = new node25(std, null);
        node25 temp = head;

        do {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newnode25.next = temp.next;
                temp.next = newnode25;

                if (newnode25.next == null) {
                    tail = newnode25;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Student25 std) {
        if (index < 0) {
            System.out.println("Wrong index!!");
        } else if (index == 0) {
            addFirst(std);
        } else {
            node25 temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new node25(std, temp.next);

            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    Student25 getData(int idx){
    if(isEmpty()){
        System.out.println("LinkedList is empty!!");
        return null;
    }

    node25 tmp = head;

    for(int i = 0; i < idx; i++){
        tmp = tmp.next;
    }

    return tmp.data;
}

int indexOf(String key){
    if(isEmpty()){
        System.out.println("LinkedList is empty!!");
        return -1;
    }

    node25 tmp = head;
    int idx = 0;

    while(tmp != null && !tmp.data.name.equalsIgnoreCase(key)){
        tmp = tmp.next;
        idx++;
    }

    if(tmp == null){
        return -1;
    }else{
        return idx;
    }
}

void removeFirst(){
    if(isEmpty()){
        System.out.println("LinkedList is empty!!");
    }else if(head == tail){
        head = tail = null;
    }else{
        head = head.next;
    }
}

void removeLast(){
    if(isEmpty()){
        System.out.println("LinkedList is empty!!");
    }else if(head == tail){
        head = tail = null;
    }else{
        node25 tmp = head;

        while(tmp.next != tail){
            tmp = tmp.next;
        }

        tmp.next = null;
        tail = tmp;
    }
}

public void remove(String key) {
    if (isEmpty()) {
        System.out.println("LinkedList is empty!!");
    } else {
        node25 temp = head;

        while (temp != null) {

            if ((temp.data.name.equalsIgnoreCase(key)) && (temp == head)) {
                removeFirst();
                break;

            } else if (temp.next.data.name.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;

                if (temp.next == null) {
                    tail = temp;
                }
                break;
            }

            temp = temp.next;
        }
    }
}

public void removeAt(int index) {
    if (index == 0) {
        removeFirst();
    } else {
        node25 temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (temp.next == null) {
            tail = temp ;
        }
    }
}

}