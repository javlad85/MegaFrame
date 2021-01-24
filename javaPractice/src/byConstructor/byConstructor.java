package byConstructor;

public class byCostructor {

    int id;
    String name;
    float salary;

    void insert(int i,String n,float s){
        id=i;
        name=n;
        salary=s;
    }

    void displayValue(){
        System.out.println(id+" "+name+" "+salary);
    }


    public static void main(String[] args) {
        byConctructor c1 =new byCostructor();
    }
}
