module es.juliogtrenard.gestionarpersonasv4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.juliogtrenard.gestionarpersonasv4 to javafx.fxml;
    exports es.juliogtrenard.gestionarpersonasv4;
    exports es.juliogtrenard.gestionarpersonasv4.controladores;
    exports es.juliogtrenard.gestionarpersonasv4.modelos;
    opens es.juliogtrenard.gestionarpersonasv4.controladores to javafx.fxml;
    opens es.juliogtrenard.gestionarpersonasv4.modelos to javafx.fxml;
}