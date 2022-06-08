package Lesson6;

class Cat extends Animal {
       String name;
    protected boolean sweem;
    int run;

//konstruktor Cat

    public Cat(String name, int run, boolean sweem) {

        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }


    public void catInfo() {
        System.out.println("Clickha" + " " + name + " " + "Ogranichenie po rassoianiu" + " " + run + " " + "Colichestvo metrov" + " " + "Skolko proplivet" + " " + sweem);
    }
}

