package soal1;

public class Main {
    public static void main(String[] args) {
        PlayerList playerList = new PlayerList();
        playerList.addLast(new Pemain("Syafa", 170, 100));
        playerList.addLast(new Pemain("Rizky", 168, 110));
        playerList.addLast(new Pemain("Ratu", 160, 75));
        playerList.addLast(new Pemain("Andika", 165, 40));
        playerList.addLast(new Pemain("Wahyu", 165, 60));
        playerList.addLast(new Pemain("Alam", 172, 86));


        System.out.println("List pemain sebelum di sort : ");
        playerList.print();
        System.out.println("List pemain berdasarkan alphabet : ");
        playerList.bubbleSort();
        playerList.print();
    }
}
