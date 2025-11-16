/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * classname: taskRepository.java
 * rev : 2
 * date : 10/11/25
 *  x23471092
 * @amelia maxwell
 */

package tasks.storage;
import java.util.ArrayList; //imported because this returns arraylist


public interface taskRepository {
    void saveTask(Task task);
    void deleteTask(int id);
    Task findById(int id);
    ArrayList<Task> findAll();
}


