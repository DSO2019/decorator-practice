package mx.iteso;

public class FinalUser extends User {
    public String publish() {
        return "No tengo privilegios para publicar";
    }

    public String delete() {
        return "No tengo privilegios para borrar";
    }

    public String approve() {
        return "No tengo privilegios para aprobar";
    }

    public String comment() {
        return "No tengo privilegios para comentar";
    }
}
