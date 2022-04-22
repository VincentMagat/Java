public class Dog {
    int size;
    String breed;
    String name;
    
    public void bark(){
        if (size >= 50){
        System.out.println("Gahoo gahoo!");}
        if (size < 50){
            System.out.println("Yip yip!");
        }
    }

    public static void main(String[] args){
        Dog d = new Dog();
        d.size = 50;
        d.breed = "German Shepherd";
        d.name = "Loco";
        System.out.println(d.size + "\n" + d.breed + "\n" + d.name);
        d.bark();

        Dog b = new Dog();
        b.size = 20;
        b.breed = "chihuahua";
        b.name = "Kaka";
        System.out.println(b.size + "\n" + b.breed + "\n" + b.name);
        b.bark();

    }

    
}
