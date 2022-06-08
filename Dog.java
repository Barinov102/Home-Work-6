package Lesson6;

class Dog extends Animal {

    String name;
    public int run;
    public int sweem;

    //konstruktor

    public Dog(String name, int run, int sweem) {

        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }
    public void dogInfo() {
        System.out.println("Clicha" + name  + " Ogranichenie po rassoianiu" + run+ " Colichestvo metrov" + " Skolko proplivet" + sweem);
    }
}

