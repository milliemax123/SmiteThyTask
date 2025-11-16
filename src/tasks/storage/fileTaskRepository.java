/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * classname: fileTaskRepository.java
 * rev : 4
 * date : 14/11/25
 * @amelia maxwell
 *  x23471092
 */
package tasks.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import person.storageIF.taskRepository;


public class fileTaskRepository implements taskRepository
{
    private String filePath;

    public fileTaskRepository(String filePath)
    {
        this.filePath = filePath;
    }

    public void saveTask(Task task)
    {
        ArrayList<Task> tasks = findAll();
        tasks.add(task);

        try
        {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
            out.writeObject(tasks);
            out.close();
            JOptionPane.showMessageDialog(null, "Task saved to file.");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error saving task: " + e.getMessage());
        }
    }

    public void deleteTask(int id)
    {
        ArrayList<Task> tasks = findAll();
        Task toRemove = null;

        for(Task t : tasks)
        {
            if(t.getId() == id)
            {
                toRemove = t;
            }
        }

        if(toRemove != null)
        {
            tasks.remove(toRemove);
            try
            {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
                out.writeObject(tasks);
                out.close();
                JOptionPane.showMessageDialog(null, "Task deleted from file.");
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, "Error deleting task: " + e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }

    public Task findById(int id)
    {
        ArrayList<Task> tasks = findAll();
        for(Task t : tasks)
        {
            if(t.getId() == id)
            {
                return t;
            }
        }
        return null;
    }

    public ArrayList<Task> findAll()
    {
        ArrayList<Task> tasks = new ArrayList<Task>();
        File file = new File(filePath);

        if(!file.exists())
        {
            return tasks;
        }

        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
            tasks = (ArrayList<Task>) in.readObject();
            in.close();
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Class not found: " + e.getMessage());
        }

        return tasks;
    }
}

