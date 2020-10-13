
public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet() {
        System.out.println("Empty Constructor.");

    }

    public Pet(String petName, int petAge, String petLocation, String petType) {
        System.out.println("Empty Constructor.");
        this.name = petName;
        this.age = petAge;
        this.location = petLocation;
        this.type = petType;

    }

//These are the Get Methods
    public void getName() {
        System.out.println("\nThe pet name is " + name);
    }

    public void getAge() {
        System.out.println("\nThe pet age is " + age);
    }

    public void getType() {
        System.out.printf("\nThe pet type is %s", type);
    }

//These are the Set Methods
    public void setName(String newName){
        System.out.println("The pet's new name is now " + newName);
        this.name = newName;
    }
    
    public void setAge(int newAge){
        System.out.println("The pet's new age is now " + newAge);
        this.age = newAge;
    }

    public void setLocation(String newLocation){
        System.out.println("The pet's new location is now " + newLocation);
        this.location = newLocation;
    }
}