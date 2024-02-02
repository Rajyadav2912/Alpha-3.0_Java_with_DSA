public class Interfaces {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.moves();

        King K = new King();
        K.moves();
    }
}

interface Chessplayer {
    // this function is by defualt public or abstract
    void moves();
}

class Queen implements Chessplayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal(all direction)....");
    }
}

class Rook implements Chessplayer {
    public void moves() {
        System.out.println("up, down, right, left....");
    }
}

class King implements Chessplayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal(In a 1 step)...");
    }
}