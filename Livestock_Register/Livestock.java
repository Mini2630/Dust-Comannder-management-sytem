package Livestock_Register;

<<<<<<< HEAD
/**
 * This class is meant to keep track of the livestock.
 * ID, age, gender, medical history, how many births*/
public class Livestock {

    private int id;
    private int age;
    private String gender;
    private int immunizations;
    private int births;

    /**
     * the constructor is used to initialize the new livestock
     * @param id
     * @param age
     * */
    public Livestock(int id, int age){
        this.immunizations=0;
        this.gender = "";
        this.births = 0;
        this.id = id;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /***?
     *
     * @param immunized
     */
    public void updateImmunizations(int immunized) {
        immunizations += immunized;
    }

    /**
     * @param birth */
    public void updateBirths(int birth) {
        births += birth;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getImmunizations() {
        return immunizations;
    }

    public int getBirths() {
        return births;
    }

    public void add(Livestock livestock) {
    }
=======
public class Livestock {
>>>>>>> origin/main
}
