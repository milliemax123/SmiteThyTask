/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * class name: taskRepository.java
 * rev : 1
 * date : 25/11/25
 * @author Amelia Maxwell
 * x23471092
 */

package Task.storage;

import java.util.ArrayList;
import Task.Task;

public interface taskRepository {
    void saveTask(Task task);
            /*this saves tasks to our storage file by reading the current task array list in the file
            then adding the new task into that array list, then rewrites the entire array list so it can
            be upadted and put back into the file*/

    void deleteTask(int id);
            /*this uses the tasks id number to delete it from the storage file. it reads all tasks then deletes the 
             one with the same id number then writes the updated task list back into the storage*/
    
    Task findById(int id);
            //reads all tasks until it find the matching id

    ArrayList<Task> findAll();
            //reads all tasks then returns them to us from storage 

    void updateTask(Task task);
            /*this reads every task in the file then rewrites the entire upadted list to be put
             back into the file*/

}

