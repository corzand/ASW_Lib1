/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asw1009.model.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizzata nella serializzazione/deserializzazione dei Task
 * su file xml.
 * @author Andrea
 */
@XmlRootElement(name = "Tasks")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaskList {

    @XmlElement(name = "Task", type = Task.class)
    List<Task> tasks;
    int progId;

    /**
     * Costruttore di default per l'oggetto, inizializza il progressivo a zero e 
     * l'array vuoto
     */
    public TaskList() {
        this.progId = 0;
        this.tasks = new ArrayList<>();
    }

    /**
     * Restituisce la lista dei tasks
     * @return lista tasks
     */
    public List<Task> getList() {
        return tasks;
    }

    /**
     * Setta la lista dei tasks
     * @param tasks lista deei tasks
     */
    public void setList(List<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Metodo utilizzato per ottenere il nuovo identificatore progressivo.
     *
     * @return nuovo identificatore progressivo
     */
    public int getNextId() {
        progId = progId + 1;
        return progId;
    }
}
