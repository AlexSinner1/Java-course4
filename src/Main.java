import model.Epic;
import enums.Status;
import model.Task;
import model.Subtask;
import service.TaskManager;

public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        Task washDish = new Task("Помыть посуду", "С новым средством");
        Task washDishCreated = taskManager.addTask(washDish);
        System.out.println(washDishCreated);

        Task washDishToUpdate = new Task(washDish.getId(), "Не забыть помыть посуду", "Можно и без средства",
                Status.IN_PROGRESS);
        Task washDishUpdated = taskManager.updateTask(washDishToUpdate);
        System.out.println(washDishUpdated);


        Epic readBooks = new Epic("Прочитать книги за каникулы");
        taskManager.addEpic(readBooks);
        System.out.println(readBooks);
        Subtask readBooksSubtask1 = new Subtask("Прочитать книги", "Обязательно школьную литературу!",
                readBooks.getId());
        Subtask readBooksSubtask2 = new Subtask("Купить новые книги", "Прочитанные книги продать",
                readBooks.getId());
        taskManager.addSubtask(readBooksSubtask1);
        taskManager.addSubtask(readBooksSubtask2);
        System.out.println(readBooks);
        readBooksSubtask2.setStatus(Status.DONE);
        taskManager.updateSubtask(readBooksSubtask2);
        System.out.println(readBooks);
    }
}