class Task {
    int taskId;
    String taskName, status;

    Task(int id, String name, String status) {
        this.taskId = id;
        this.taskName = name;
        this.status = status;
    }
}

class Node {
    Task data;
    Node next;

    Node(Task d) {
        data = d;
    }
}
//Main class
public class TaskManagementSystem {
    Node head = null;

    void add(Task t) {
        Node n = new Node(t);
        n.next = head;
        head = n;
    }

    Node search(int id) {
        Node c = head;
        while (c != null) {
            if (c.data.taskId == id)
                return c;
            c = c.next;
        }
        return null;
    }

    void traverse() {
        Node c = head;
        while (c != null) {
            System.out.println(c.data.taskName);
            c = c.next;
        }
    }

    void delete(int id) {
        Node c = head, prev = null;
        while (c != null && c.data.taskId != id) {
            prev = c;
            c = c.next;
        }
        if (c == null)
            return;
        if (prev == null)
            head = c.next;
        else
            prev.next = c.next;
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
        tms.add(new Task(1, "Task1", "Open"));
        tms.add(new Task(2, "Task2", "Done"));
        tms.add(new Task(3, "Task3", "In Progress"));
        System.out.println("Tasks after adding:");
        tms.traverse();
        System.out.println("\nSearching for task with ID 2:");
        Node foundTask = tms.search(2);
        if (foundTask != null) {
            System.out.println("Found task: " + foundTask.data.taskName + ", Status: " + foundTask.data.status);
        } else {
            System.out.println("Task not found.");
        }
        System.out.println("\nDeleting task with ID 1...");
        tms.delete(1);
        System.out.println("\nTasks after deleting task 1:");
        tms.traverse();
    }
}