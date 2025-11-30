
package Task;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * class name: Task..java
 * @Ciara Lynch
 *  x23461962
 * 
 */

import java.util.ArrayList;
import java.util.List;
//import javax.swing.table.DefaultTableModel;

//

public class Task {
     private int id;
    private String title;
    private String dueDate;
    private Priority priority;
    private Category category;
    private Status status;
    private List<SubTask> subTasks = new ArrayList<>();

        //constructor to create a task
        public Task(int id, String title, String dueDate, Priority priority, Category category, Status status) {
            this.id = id;
            this.title = title;
            this.dueDate = dueDate;
            this.priority = priority;
            this.category = category;
            this.status = status;
        }

    
        //getters and setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
        
        public void setTitle(String title) {
            this.title = title;
        }
        
        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }
        
        public void setPriority(Priority priority) {
            this.priority = priority;
        }
        
       public void setCategory(Category category) {
            this.category = category;
        }
       
        public void setStatus(Status status) {
            this.status = status;
        }

        
        
        public String getTitle() {
            return title;
        }

        public String getDueDate() {
            return dueDate;
        }

        public Priority getPriority() {
            return priority;
        }

        public Category getCategory() {
            return category;
        }

        public Status getStatus() {
            return status;
        }
        public List<SubTask> getSubTasks() {
            return subTasks;
        }

        
        
        //this adds a subtask
        public void addSubtask(SubTask subtask) {
            subTasks.add(subtask);
        }

        //for task editing as done or not done
        public void markDone() {
            this.status = Status.Completed;
        }

        public void undoDone() {
            this.status = Status.Uncompleted;
        }
            
            //used this so all tasks and their fields are printed in a readable way and also geat for testing 
                public String toString() {
                    return "Task{" +
                            "id=" + id +
                            ", title='" + title + '\'' +
                            ", dueDate=" + dueDate +
                            ", priority=" + priority +
                            ", category=" + category +
                            ", status=" + status +
                            '}';
                }
}
            

        

       

