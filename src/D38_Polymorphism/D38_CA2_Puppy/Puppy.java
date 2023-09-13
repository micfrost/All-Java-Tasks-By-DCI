package D38_Polymorphism.D38_CA2_Puppy;


class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

 class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating...");
    }
}


 class Puppy extends Dog {

}

 class Main {
    public static void main(String[] args) {
//        this upcasting makes an object puppy more flexible. In future it is possible to use Animal or Dog or Puppy
        Animal puppy = new Puppy();
        puppy.eat();

    }
}

