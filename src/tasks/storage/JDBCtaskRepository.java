/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * classname: JDBCtaskRepository.java
 * rev : 6 (had many issues haha)
 * date : 14/11/25
 * @amelia maxwell
 *  x23471092
 */

package tasks.storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCtaskRepository implements taskRepository{
    private Connection connection;

    public JDBCtaskRepository(){
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:tasks.db");
            System.out.println("Connected to database.");

            try{
                Statement stmt = connection.createStatement();
                String sql = "CREATE TABLE tasks (id INTEGER PRIMARY KEY, title TEXT)";
                stmt.executeUpdate(sql);
                stmt.close();
            }catch (SQLException e){
                if (e.getMessage().contains("already exists")){
                    System.out.println("Table already exists, continuing...");
                }else{
                    System.out.println("Error creating table: " + e.getMessage());
                }
            }
        }
        catch (Exception e){
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }

    public void saveTask(Task task){
        try{
            String sql = "INSERT INTO tasks (id, title) VALUES (?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, task.getId());
            ps.setString(2, task.getTitle());
            ps.executeUpdate();
            ps.close();
            System.out.println("Task saved.");
        }catch (SQLException e){
            System.out.println("Error saving task: " + e.getMessage());
        }
    }

    public void deleteTask(int id){
        try{
            String sql = "DELETE FROM tasks WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            ps.close();
                if (rows > 0){
                    System.out.println("Task deleted.");
                }else{
                    System.out.println("Task not found.");
                }
        }catch (SQLException e){
            System.out.println("Error deleting task: " + e.getMessage());
        }
    }

    public Task findById(int id){
        Task task = null;
        try{
            String sql = "SELECT * FROM tasks WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                task = new Task();
                task.setId(rs.getInt("id"));
                task.setTitle(rs.getString("title"));
            }

        rs.close();
        ps.close();
        }
        
        catch (SQLException e){
            System.out.println("Error finding task: " + e.getMessage());
        }
        return task;
    }

    public ArrayList<Task> findAll(){
        ArrayList<Task> list = new ArrayList<Task>();
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tasks");

            while (rs.next()){
                Task t = new Task();
                t.setId(rs.getInt("id"));
                t.setTitle(rs.getString("title"));
                list.add(t);
            }

            rs.close();
            stmt.close();
        }
        catch (SQLException e){
            System.out.println("Error reading tasks: " + e.getMessage());
        }
        return list;
    }


    public void close(){
        try{
            if (connection != null){
                connection.close();
                System.out.println("Connection closed.");
            }
        }
        catch (SQLException e){
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}

/*
I initially thought the interface due was my interface that being used for storage so i used
*/