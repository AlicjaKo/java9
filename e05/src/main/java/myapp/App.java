package myapp;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {

    }
}

interface Movable {
    String upKey();
    String downKey();
    String leftKey();
    String rightKey();
}

class Player implements Movable {

    @Override
    public String upKey() {
       return "Player moving up.";
    }

    @Override
    public String downKey() {
       return "Player moving down.";
    }

    @Override
    public String leftKey() {
        return "Player moving left.";
    }

    @Override
    public String rightKey() {
       return "Player moving right.";
    }
    
}


class Computer implements Movable {

    @Override
    public String upKey() {
        return "Computer moving up.";
    }

    @Override
    public String downKey() {
        return "Computer moving down.";
    }

    @Override
    public String leftKey() {
        return "Computer moving left.";
    }

    @Override
    public String rightKey() {
       return "Computer moving right.";
    }
    
}

/*
 * 
 * 
- Create an interface named `Movable` with four methods, `upKey`, `downKey`, `leftKey` and `rightKey`.
- Create two classes named `Player` and `Computer` that implement the `Movable` interface. 
- In each class, implement the `upKey`, `downKey`, `leftKey` and `rightKey` methods to return a description of the behaviour moving respectively.

💡 Hints:

- `upKey` →  or “”
- `downKey` → “” or “”
- `leftKey` → “” or “”
- `rightKey` → “” or “”

Expected output

    Player moving up.
    Player moving down.
    Player moving left.
    Player moving right.
    Computer moving up.
    Computer moving down.
    Computer moving left.
    Computer moving right.


 */
