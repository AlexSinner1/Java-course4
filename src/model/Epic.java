package model;

import java.util.ArrayList;

import enums.Status;


public class Epic extends Task {
    private ArrayList<Subtask> subtaskList = new ArrayList<>();

    public Epic(String name, String description) {
        super(name, description);
    }

    public Epic(int id, String name, String description, Status status) {
        super(id, name, description, status);
    }

    public void addSubtask(Subtask subtask) {
        subtaskList.add(subtask);
    }

    public void clearSubtask() {
        subtaskList.clear();
    }

    public ArrayList<Subtask> getSubtaskList() {
        return subtaskList;
    }

    public void updateSubtask(Subtask subtask) {
        subtaskList.remove(subtask);
        subtaskList.add(subtask);
    }

    @Override
    public String toString() {
        return "Epic{" +
                "name= " + name + '\'' +
                ", description = " + description + '\'' +
                ", id=" + id +
                ", subtaskList.size = " + subtaskList.size() +
                ", status = " + status +
                '}';
    }
}
