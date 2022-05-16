/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author P.RAZA
 */
public class Task2 {

    public static boolean checkTaskDescription(String taskDescription) {
        boolean u = false;
        if (taskDescription.length() <= 50) {

            u = true;
        }
        
        if (u) {
            return true;
        } else {
            return false;
        }

    }

    public static String createTaskID(String taskName, int taskNumber, String developerName) {

        String taskID = taskName.substring(0, 2) + ":"
                + Integer.toString(taskNumber) + ":" + developerName.substring(developerName.length() - 3);

        return taskID;

    }

    public String printTaskDetails(String taskName, int taskNumber, String taskDescription,
            String devFirstName, String devLastName, int taskDuration, String taskID, String taskStatus) {

        String printValue = taskName + " " + Integer.toString(taskNumber) + " " + taskDescription
                + " " + devFirstName + " " + devLastName + " " + Integer.toString(taskDuration) + " " + taskID + " " + taskStatus;

        return printValue;

    }

    public int returnTotalHours(int numTasks, int enteredHours) {
        int totalHours = 0;
        for (int i = 0; i < numTasks; i++) {
            totalHours += enteredHours;
        }

        return totalHours;

    }

    public int addSlackTime(int numTasks, int duration, int slackTime, String slack) {
        int totalTimeWithSlack = 0;

        for (int i = 1; i < numTasks; i++) {

            slackTime += slackTime;
            totalTimeWithSlack = slackTime + duration;
            JOptionPane.showMessageDialog(null, "slack currently is " + slack);
        }

        return totalTimeWithSlack;

    }

    public String[] populateDeveloperArray() {
        String[] developers = new String[]{"Mike Smith", "Edward Harrington",
             "Samantha Paulson", "Glenda Oberholzer"};

        return developers;

    }

    public String[] populateTaskNameArray() {

        String[] TaskName = new String[]{"Create Login", "Create Add Features",
             "Create Reports", "Create Arrays"};

        return TaskName;

    }

}
