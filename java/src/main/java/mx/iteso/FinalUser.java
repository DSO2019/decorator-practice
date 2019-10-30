package mx.iteso;

/**
 * Created by ElMaligno666 on October 2019.
 */
public class FinalUser extends User {

    /**
     * @return right to publish.
     */
    public String publish() {
        return "No tengo privilegios para publicar";
    }

    /**
     * @return right to delete.
     */
    public String delete() {
        return "No tengo privilegios para borrar";
    }

    /**
     * @return right to approve.
     */
    public String approve() {
        return "No tengo privilegios para aprobar";
    }

    /**
     * @return right to comment.
     */
    public String comment() {
        return "No tengo privilegios para comentar";
    }
}
