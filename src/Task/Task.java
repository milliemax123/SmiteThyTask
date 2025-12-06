
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
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.table.DefaultTableModel;

//

public class Task implements Serializable  {
         private static final long serialVersionUID = 1L;//thiss is a version number foe our class so that our objects are valid even when i make small changes because it locks in this version it prevents java from refusing to load old saved objects after we chnage code
     private int id;
    private String title;
    private String dueDate;
    private Priority priority;
    private Category category;
    private Status status;
    private List<SubTask> subTasks = new ArrayList<>();

        //constructor to create a task
        public Task(int id, String title, String  dueDate, Priority priority, Category category, Status status) {
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
        
        public void setDueDate(String  dueDate) {
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

        public String  getDueDate() {
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
                public String toRead() {
                    return "Task{" +
                            "id=" + id +
                            ", title='" + title + '\'' +
                            ", dueDate=" + dueDate +
                            ", priority=" + priority +
                            ", category=" + category +
                            ", status=" + status +
                            '}';
                }
                
                public String checkOverdue() {
                        //  if dates empty 
                        if (dueDate == null || dueDate.trim().isEmpty()) {
                            return "No due date";
                        }

                        try {
                            // coverts string due date into a date
                            LocalDate due = LocalDate.parse(dueDate.trim());  // yyyy-mm-dd format
                            LocalDate today = LocalDate.now();

                            if (due.isBefore(today)) {
                                return "Overdue";
                            } else {
                                return "Due on: " + dueDate;
                            }
                        } catch (Exception e) {//errror for ehrn user enter wrong date
                            return "use yyyy-mm-dd format";
                        }
                    }
                //https://www.baeldung.com/java-string-to-date -- this helped me in this method
                

}
            

        

       

