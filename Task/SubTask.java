
package Task;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * class name: SubTask.java
 * @Ciara Lynch
 *  x23461962
 * 
 */

public class SubTask {

    private int id;
    private String title;
    private boolean done;

    //to create a subtask it needs an id and title
    public SubTask(int id, String title) {
        this.id = id;
        this.title = title;
    }

    //says if the task is done
    public void toggle() {
        done = !done;
    }

   //will say true if its done
    public boolean isDone() {
        return done;
    }

    //gets subtasks id
    public int getId(){
        return id; 
    }
    
    //gets subtasks title
    public String getTitle(){ 
        return title; 
    }
}
