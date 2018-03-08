package design.singleTon;

public class MainTes {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();

        object.showMessage();

    }



}
