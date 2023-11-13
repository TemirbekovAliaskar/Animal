public class Main {
    public static void main(String[] args) {

        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        Animal [] animals = {shark,turtle,eagle};

        Shark [] sharks = new Shark[10];
        Turtle [] turtles = new Turtle[10];
        Eagle [] eagles = new Eagle[10];

        for (Animal animal : animals){
            if (animal instanceof Shark){
                ((Shark)animal).attack();
            }else if (animal instanceof Turtle){
                ((Turtle)animal).swim();
            } else if (animal instanceof Eagle) {
                ((Eagle)animal).fly();
            }
        }

        for (Animal animal : animals){
            if (animal instanceof Shark){
                sharks[0] = (Shark) animal;
            } else if (animal instanceof Turtle) {
                turtles[0] = (Turtle) animal;
            } else if (animal instanceof Eagle) {
                eagles [0] = (Eagle) animal;
            }
        }

    }
}