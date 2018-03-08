package design.singleTon;

public class SingleObject {

    private static SingleObject instance = new SingleObject();


    private SingleObject() {

    }


    public static SingleObject getInstance(){
        return instance;
    }


    public void showMessage(){

        System.out.println("hi there my coding friends <3");

    }

}
