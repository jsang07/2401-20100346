package challenge;

public class Tree implements Countable{
    String name;

    public Tree(String name) {
        this.name = name;
    }

    void ripen(){
        System.out.println(name +"열매가 잘 익었다.");
    }

    @Override
    public void count() {
        System.out.println(name+"가 5그루 있다.");
    }
}
