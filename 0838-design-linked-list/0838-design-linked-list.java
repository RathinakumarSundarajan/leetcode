class MyLinkedList {

//-------------constructor for empty node---
    class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public Node head;
    public int size;





//-------------constructor for empty node---
    public MyLinkedList() {
        head = null;
        size = 0;
        
    }



//-------------Get data based on index number ---   
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.val;  
    }
//-------------Get data based on index number ---   




//-------------Add Node at First------- 
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;    
    }
//-------------Add Node at First------- 
   




//-------------Add Node at last------- 
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }
//-------------Add Node at last------- 





//-------------Add Node at lgiven index------- 
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node curr = head;
        for(int i = 0; i < index-1; i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
//-------------Add Node at lgiven index------- 







//-------------Delete Node at lgiven index------- 
    public void deleteAtIndex(int index) {
         if (index < 0 || index >= size) return;
        
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }
//-------------Delete Node at lgiven index------- 


    
    }



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */