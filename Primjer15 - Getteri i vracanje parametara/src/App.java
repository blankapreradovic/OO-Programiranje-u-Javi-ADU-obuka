class Person {
    private String name;
    private int age;
    
    // primjer konstruktora
    
    public Person() {
    	System.out.println("Sistem je detektovao da je kreiran novi objekat Person.");
    }
    public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
     
    void speak() {
        System.out.println("Moje ime je: " + name);
    }
     
    int calculateYearsToRetirement() {
        int yearsLeft = 70 - age;
         
        return yearsLeft;
    }
     
    int getAge() {
        return age;
    }
     
    String getName() {
        return name;
    }
    
    void setName(String name) {
    	this.name = name;
    }
    
    void setAge(int ageee) {
    	this.age = ageee;
    }
}
 
 
public class App {
 
    public static void main(String[] args) {
        Person person1 = new Person();
         
        /*
         * Dodjeljivanje vrijednosti direktno na atribut (primjer lose prakse, javice Error na private)
         * 
         * person1.name = "Marko";
         * person1.age = 28;
         */
        
        /*
         * Dodjeljivanje parametara putem settera (primjer dobre prakse)
         */
        person1.setName("Marko");
        person1.setAge(28);
         
        int years = person1.calculateYearsToRetirement();
         
        System.out.println("Godine do penzije: " + years);
        int age = person1.getAge();
        String name = person1.getName();
         
        System.out.println("Ime: " + name);
        System.out.println("Godine: " + age);
    }
 
}