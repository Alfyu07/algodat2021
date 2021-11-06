package soal1;

import basic.LinkedList;
import basic.Node;

public class PlayerList extends LinkedList<Pemain> {
    
    @Override
    public void print(){
        Node<Pemain> cur = head;
        while(cur != null){
            //print data
            cur.data.print(); //player
            cur = cur.next;
        }
        System.out.println();
    }

    //alphabet
    public void bubbleSort(){
        Node<Pemain> i = head;
        while(i != null){
            Node<Pemain> j = i.next;
            while(j != null){
                //cek apakah data di i > data di j? iya -> tuker
                if(i.data.name.compareTo(j.data.name) > 0){
                    //tuker
                    Pemain temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }


}
