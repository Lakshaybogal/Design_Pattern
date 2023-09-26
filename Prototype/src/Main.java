public class Main {
    public static void main(String[] args) {
        Prototype p1 = new Chess(8,"white","black");
         p1.display();
        System.out.println("\n");
        Chess c = (Chess) p1.getClone();
        c.display();
    }
}

interface Prototype{
    Prototype getClone();
    void display();
}
class Chess implements Prototype{
    int blocks;
    String color1;
    String color2;
    Chess(int blocks,String color1,String color2){
        this.blocks = blocks;
        this.color1 = color1;
        this.color2 = color2;
    }

     public void display(){
        System.out.println("Number of blocks : " + blocks);
        System.out.println("Colors are : " + color1 + " " + color2);
    }

    @Override
    public Prototype getClone() {
        return new Chess(blocks,color1,color2);
    }
}

class TieTacToe implements Prototype{
    int blocks;
    String color;

    TieTacToe(int blocks,String color){
        this.blocks = blocks;
        this.color = color;
    }

    public void display(){
        System.out.println("Number of blocks : " + blocks);
        System.out.println("Color is : " + color);
    }

    @Override
    public Prototype getClone() {
        return new TieTacToe(blocks,color);
    }
}
