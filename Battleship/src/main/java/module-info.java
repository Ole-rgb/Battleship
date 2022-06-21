module de.uni_hannover.hci.battleship.battleship {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.uni_hannover.hci.battleship.battleship to javafx.fxml;
    exports de.uni_hannover.hci.battleship.battleship;
}