import java.util.ArrayList;
public class Starter{
    public static void main(String arg[]){
        ArrayList<Animal> animals = new <Animal>ArrayList();//creating arraylist of animals
        Cow cow = new Cow();//creating cow object
        Pig pig = new Pig();//creating pig object
        Chicken chicken = new Chicken();//creating chicken object
        Dog dog = new Dog();//creating dog object
        animals.add(cow);//adding cow to arraylist
        animals.add(pig);//adding pig to arraylist
        animals.add(chicken);//adding chicken to arraylist
        animals.add(dog);//adding dog to arraylist
        oldMacdonald(animals);//running static method for the song
        summaryOfAnimals(animals);//runs the summary method
    }
    public static void oldMacdonald(ArrayList<Animal> animals){
        for(int i = 0; i < animals.size(); i++){//for loop to go through each animal inside of the arraylist
           //song 
           System.out.print(
           "♪ Old MacDonald had a farm ♪" + "\n" +
           "♪ E-I-E-I-O ♪" + "\n" + 
           "♪ And on that farm he had a " + animals.get(i).name + " ♪" + "\n" +
           "♪ E-I-E-I-O ♪" + "\n"+
           "♪ With a " + animals.get(i).speech + " " + animals.get(i).speech + " here ♪" + "\n" + 
           "♪ And a " + animals.get(i).speech + " " + animals.get(i).speech + " there ♪" + "\n" +
           "♪ Here a " + animals.get(i).speech + ", there a " + animals.get(i).speech +  " ♪" + "\n" +
           "♪ Everywhere a " + animals.get(i).speech + " " + animals.get(i).speech +" ♪" + "\n" + 
           "♪ Old MacDonald had a farm ♪" + "\n" +
           "♪ E-I-E-I-O ♪" + "\n");
        }
        //there are two E I E I O s at the end of the song
        System.out.println("♪ E-I-E-I-O ♪" + "\n" + "___________________________");
        //also adds a spacer
    }
    public static void summaryOfAnimals(ArrayList<Animal> animals){
        for(int i = 0; i < animals.size(); i++){//for loop to go through the arraylist
            System.out.println(animals.get(i).name + "'s prefered food is " + animals.get(i).preferedFood + ". " +
            "\n" + animals.get(i).name + "'s housing is " + animals.get(i).housing + ". " + "\n");
            //two lines
                //one for the food
                //the other for the housing
        }
    }
}
