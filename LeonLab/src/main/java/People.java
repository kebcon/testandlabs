import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class People {

      private List<Person> personList = new ArrayList<>();

      People(){

      }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


    public void adD(Person p){
        personList.add(p);
    }


    public Person findById(long id){
        Iterator<Person> itr = personList.iterator();
        while (itr.hasNext()) {
            Person p = itr.next();
            if (p.getId() == id) {
                //System.out.println("found person with id " + id);
                return p;
            }
        }
        //System.out.println("did  not find person with id " + id);
        return null;
    }

    public void removE(Person person){
          personList.remove(person);
//        Iterator<Person> itr = personList.iterator();
//        while (itr.hasNext()) {
//            Person p = itr.next();
//            if (p.getName().equals(person.getName()) && p.getId() == person.getId()) {
//                itr.remove();
//            }
//
//        }
    }

    public void removE(long id){
        Iterator<Person> itr = personList.iterator();
        while (itr.hasNext()) {
            Person p = itr.next();
            if (p.getId() == id) {
                itr.remove();
            }

        }
    }


   // The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.

    public int getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        return personList.toArray(new Person[personList.size()]);
    }


    public void removeAll(){
        personList.clear();
    }


    public String toString(){
        return "people " + Arrays.toString(getArray());
    }

    public boolean contains(Person person) {
         return personList.contains(person);
    }
}


/*
Create a People class.
The class should instantiate an ArrayList field of Person objects named personList.
The class should define a method named add which adds a Person to the personList.
The class should define a method named findById which makes use of a long id parameter to return a Person object with the respective id field.
The class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.
The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.
The class should define a method named getCount which returns the size of personList.
The class should define a method named getArray which returns an array representation of the personList field.
The class should define a named removeAll which clears our personList field.
 */