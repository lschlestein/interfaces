package InterfaceDuck;

public interface Voice {
    default void talk(){
        System.out.println("I can talk talk");
    }
}