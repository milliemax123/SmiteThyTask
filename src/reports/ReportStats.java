package reports;

import reports.ReportTask;
import java.util.List;

/**
 *
 * @author Blesson Robert 
 */



public class ReportStats {

    private int totalTasks;
    private int completedTasks;
    private int overdueTasks;

    public ReportStats(int totalTasks, int completedTasks, int overdueTasks) {
        this.totalTasks = totalTasks;
        this.completedTasks = completedTasks;
        this.overdueTasks = overdueTasks;
    }

    public int getTotalTasks() {
        return totalTasks;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public int getOverdueTasks() {
        return overdueTasks;
    }


    public static ReportStats fromTasks(List<ReportTask> tasks) {
        int total = tasks.size();
        int completed = 0;
        int overdue = 0;

        for (ReportTask t : tasks) {
            String s = t.getStatus();
            if (s.equalsIgnoreCase("Completed")) {
                completed++;
            } else if (s.equalsIgnoreCase("Overdue")) {
                overdue++;
            }
        }

   

        return new ReportStats(total, completed, overdue);
    }
}