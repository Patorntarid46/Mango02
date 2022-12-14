import java.time.LocalDate;

public class Lab04 {
    private String name;
    private LocalDate dob;

    public void doSomething(){

    }
    public Lab04(){
//        this(null , LocalDate.now().getYear() , LocalDate.now().getMonth() , LocalDate.now(). );
        this.name = null;
        this.dob = LocalDate.now();
    }
    public Lab04(String name , int year , int month , int day){
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }
     public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

}

