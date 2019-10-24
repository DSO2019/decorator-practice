package mx.iteso;

public class FinalUser extends User {

    String publish;
    String approve;
    String delete;
    String comment;

    public void publish() {
        this.publish = "No tienes permiso de publicar";
    }

    public void approve() {
        this.approve = "No tienes permiso de aprovar";
    }

    public void delete() {
        this.delete = "No tienes permiso de borrar";
    }

    public void comment() {
        this.comment = "No tienes permiso de comentar";
    }

    public String print(){
        return "Publicar: "+ this.publish
        + "\nAprovar: "+ this.approve 
        +"\nBorrar: "+ this.delete 
        +"\nComentar: "+ this.comment; 
    }
}