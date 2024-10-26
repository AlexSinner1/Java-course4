import java.util.ArrayList;

public class Epic extends  Task{

    private ArrayList<Subtask> subtaskList = new ArrayList<>();

    public Epic(String name, String description, ArrayList<Subtask> subtaskList) {
        super(name, description);
        this.subtaskList = subtaskList;
    }

    public Epic(int id, String name, String description, Status status, ArrayList<Subtask> subtaskList) {
        super(id, name, description, status);
        this.subtaskList = subtaskList;
    }

    public void addSubtask(Subtask subtask){
        subtaskList.add(subtask);
    }

    public void clearSubtask(Subtask subtask){
        subtaskList.clear();
    }

    public ArrayList<Subtask> getSubtaskList() {
        return subtaskList;
    }

    public void setSubtaskList(ArrayList<Subtask> subtaskList) {
        this.subtaskList = subtaskList;
    }


}
