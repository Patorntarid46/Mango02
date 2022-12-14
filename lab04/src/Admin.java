import java.time.LocalDate;

public class Admin extends Lab04{
    public void doSomething(){
        doSomething(1);
    }
    public void doSomething(int n){
        while (n >= 1){
            System.out.println("Hello admin" + super.getName() + "!");
            n = n-1;
        }
    }
    public void doExtra(){
        if(LocalDate.now().equals(super.getDate())){
            System.out.println("Happy birthday Admin!");
        }
    }
}
