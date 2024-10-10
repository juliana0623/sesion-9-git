module com.example.sesion9gestiondeproyectos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sesion9gestiondeproyectos to javafx.fxml;
    exports com.example.sesion9gestiondeproyectos;
}