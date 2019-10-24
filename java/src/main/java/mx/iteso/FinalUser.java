package mx.iteso;

import mx.iteso.privileges.Approve;

public class FinalUser extends User {
    public FinalUser() {
        comment = "No tiene privilegios de commentar";
        approve = "No tiene privilegios de aprobar";
        delete = "No tiene privilegios de borrar";
        publish = "No tiene privilegios de publicar";
    }

}
