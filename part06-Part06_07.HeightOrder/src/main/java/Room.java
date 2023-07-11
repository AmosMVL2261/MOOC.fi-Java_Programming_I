import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room(){
        this.persons=new ArrayList<>();
    }

    public void add(Person person){
        persons.add(person);
    }

    public boolean isEmpty(){
        if(persons.size()==0){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        if(isEmpty()==false){
            Person shortestPerson = persons.get(0);
            for(Person person : persons){
                if(person.getHeight()<shortestPerson.getHeight()){
                    shortestPerson=person;
                }
            }
            return shortestPerson;
        }else{
            return null;
        }
    }

    public Person take(){
        Person p = shortest();
        if(p!=null){
            for(int i = 0; i<persons.size(); i++){
                if(p.equals(persons.get(i))){
                    //p=persons.get(i);
                    persons.remove(i);
                }
            }
            return p;
        }else{
            return null;
        }
    }
}
