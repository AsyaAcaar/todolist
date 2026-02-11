import java.util.Scanner;
import java.util.ArrayList;//we nwwd array structur to creat a to do list template
public class todolist {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<String> tasks= new ArrayList<String>();//that means there is a string arraylist which is'tasks' and a new empty array list
        while(true){ //this loop for always repeat
        System.out.printf("Welcome to todolist. \nchoose 1 for add task .\nchoose 2 for delete task.\nchoose 3 for list of all tasks.");
        int operation=input.nextInt();//user choice 
        switch(operation){
        
            case 1:
                input.nextLine();//for buffer problem.very important point because first of all we need to clear the all list for tasks.except this line there would be only 'enter'.and code goes directly to line 17.
                System.out.println("What is the task?");
                String userTask=input.nextLine();//nextLine() instead of next() because task could be a line not a word
                tasks.add(userTask);//adding structure
                System.out.println("Task added!");
                break;
            case 2:
                System.out.println("Which task you wanna delete?");
                int userTask2=input.nextInt();
                tasks.remove(userTask2-1);//for delete use .remove().minus 1 because index0=1
                System.out.println("Task successfully deleted!");
                break;
            case 3:
                System.out.println("Here is your to do list:  "+ tasks);
                break;

 }
        }

    }
    
}
