package basic;

public class LinkedList<T> {
    protected Node<T> head;
    protected Node<T> tail;


    // addlast
    public void addLast(T data){ 
        Node<T> baru = new Node<T>(data);
        //jika head kosong maka node baru sebagai node pertama dan terakhir  
        if(isEmpty()){
            head = tail = baru;
        }else{
            //kita sambungin tail.next = baru
            tail.next = baru;
            baru.prev = tail;

            //pindah tail ke posisi seharusnya
            tail = baru;
        }

    }
    
    public boolean isEmpty() {
        return head == null;
    }


    //
    public void print(){}
}
