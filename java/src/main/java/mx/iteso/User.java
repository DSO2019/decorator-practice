package mx.iteso;

public abstract class User {

    private String Descripcion = "Usuario";

    public String  getDescripcion() {
        return this.Descripcion;
    }

    public  void setDescripcion (String descripcion){
        this.Descripcion = descripcion;
    }

    public abstract boolean canPublish();

    public abstract boolean canComment();

    public abstract boolean canDelete();

    public abstract boolean canApprove();

}

