package soal2;
import basic.LinkedList;
import basic.Node;

public class BookList extends LinkedList<Book>{

    @Override
    public void print(){
        Node<Book> cur = head;
        while(cur != null){
            cur.data.print(); //book
            cur = cur.next;
        }
    }
}