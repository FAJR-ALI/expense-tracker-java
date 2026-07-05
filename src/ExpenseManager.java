import java.util.ArrayList;

public class ExpenseManager {

   private ArrayList <Expense> expenses= new ArrayList<>(); 

   public void addExpenses (Expense expense){
    expenses.add(expense);
   }

   public void showExpenses(){
    if(expenses.isEmpty()){
        System.out.println("No Expenses found! ");
        return;
    }
    for(Expense expense : expenses){
        System.out.println(expense);
    }
   }

}
