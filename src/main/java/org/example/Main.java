package org.example;
import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

import static org.example.entity.StringSet.findUniqueWords;

public class Main {
    public static void main(String[] args) {
        Set<Task> annsTasks= new HashSet<>();
        Task taskAnn= new Task("workintech", "dummy","emrah" , Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2= new Task("workintech", "dummy2","emrah", Status.IN_PROGRESS, Priority.HIGH);
       annsTasks.add(taskAnn2);
       annsTasks.add(taskAnn);
        Set<Task> bobsTasks= new HashSet<>();
        Task bobsTask= new Task("workintech", "dummy","emrah", Status.IN_PROGRESS, Priority.HIGH);
        Task bobsTask2= new Task("workintech", "dummy2","emrah", Status.IN_PROGRESS, Priority.HIGH);
        bobsTasks.add(bobsTask);
        annsTasks.add(bobsTask2);


        Set<Task> carolsTasks= new HashSet<>();
        Task carolTask= new Task("workintech", "dummy","emrah", Status.IN_PROGRESS, Priority.HIGH);
        Task carolTask2= new Task("workintech", "dummy2","emrah", Status.IN_PROGRESS, Priority.HIGH);
        carolsTasks.add(carolTask);
        carolsTasks.add(carolTask2);

        Set<Task> unassignedTasks= new HashSet<>();
        Task unassignedTask= new Task("workintech", "dummy","emrah", Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(unassignedTask);

        TaskData taskData =new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);

    }
}