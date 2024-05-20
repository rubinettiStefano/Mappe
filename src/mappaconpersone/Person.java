package mappaconpersone;

public class Person 
{
    private Integer id;
    private String name,surname;

    

    public Person(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
    
    
    //hash è un termine tecnico che indica uan rappresentazione di lunghezza fissa di 
    //un oggetto
    //Lo stesso oggetto produrra sempre lo stesso hash
    //Oggetti diversi produrrano hash diversi
    //un metodo che ereditiamo da Object e che va sovrascritto

    @Override
    public int hashCode()
    {
        return id;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Person)
        {
            Person other = (Person)o;
            return this.hashCode()==other.hashCode();
        }
        else
            return false;
    }
}
