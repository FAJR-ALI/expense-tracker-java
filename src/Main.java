public class Main {
    public static void main(String[] args) throws Exception {
       
        ExpenseManager manager = new ExpenseManager();

        Expense makeup = new Expense("MAC", Category.SHOPPING, "11/5", 2, 490);
        Expense coffe = new Expense("amrecano", Category.FOOD, "3/6", 1, 21);
        Expense netflix = new Expense("Netflix", Category.ENTERTAMENT, "8/12", 5, 260);

        manager.addExpenses(makeup);
        manager.addExpenses(netflix);
        manager.addExpenses(coffe);

        manager.showExpenses();
    }
}
