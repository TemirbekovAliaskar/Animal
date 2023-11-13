public class Shark extends Animal {

    public void attack(){
        System.out.println("Акула жырткыч  !");
    }


    @Override
    public String toString() {
        return "Shark  :  " + super.toString();
    }
}
