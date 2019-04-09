package ExpensesTracker.Models;


import java.util.Calendar;
import java.util.Locale;

public class Dashboard {
    private Calendar cal = Calendar.getInstance();
    private String formattedDateString = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " " + cal.get(Calendar.YEAR);
    //There is the expensesList initialization
    private ExpensesList listOfExpenses = new ExpensesList();
    private int listHash;

    public Dashboard() {
        listHash = listOfExpenses.hashCode();
    }

    public Integer getListHash() {
        return listHash;
    }
    public void setListHash(int hash) { listHash = hash;}

    public ExpensesList getListOfExpenses(){
        return listOfExpenses; }

    public String getFormattedDate() {
        return formattedDateString;
    }
    public void setFormattedDateString(int month, int year) {
        cal.set(year, month, 1);
        formattedDateString = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " " + cal.get(Calendar.YEAR);
    }

}
