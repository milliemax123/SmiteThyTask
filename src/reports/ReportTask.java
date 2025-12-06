package reports;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Blesson Robert 
 */

public class ReportTask {

    private String name;
    private String status;
    private int dueInDays;

    public ReportTask(String name, String status, int dueInDays) {
        this.name = name;
        this.status = status;
        this.dueInDays = dueInDays;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getDueInDays() {
        return dueInDays;
    }
}

