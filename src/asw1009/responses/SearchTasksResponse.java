package asw1009.responses;

import asw1009.model.entities.Task;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Risposta del servizio di Ricerca Task.
 *
 * @author ASW1009
 */
@XmlRootElement(name="data")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchTasksResponse extends BaseResponse {

    private List<Task> tasks;

    /**
     * Imposta l'elenco dei Task risultati da una ricerca.
     *
     * @param tasks Lista di oggetti Task risultato di una ricerca.
     */
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Restituisce l'elenco dei Task risultati da una ricerca.
     *
     * @return Lista di oggetti Task risultato di una ricerca.
     */
    public List<Task> getTasks() {
        return this.tasks;
    }
}
