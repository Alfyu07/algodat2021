package basic;

public class Node<T> {
    public T data; 
    public Node<T> next; //pointer next  -> menunjuk data berikutnya
    public Node<T> prev; //pointer prev ->  menunjuk data sebelumnya

    // constructor -> fungsi yang pertama kali dijalankan pada saat pembuatan objek
    public Node(T data){ 
        this.data = data;  
    }
} 

//visibilitas
//public -> bisa diakses oleh seluruh folder atau class
//protected -> dia cuma bisa diakses oleh kelas anak nya  
//private  -> cuma bisa diakses oleh class itu sendiri
//default => cuma bisa diakses oleh folder yang sama