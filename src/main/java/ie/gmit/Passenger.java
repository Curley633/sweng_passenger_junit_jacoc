package ie.gmit;

public class Passenger {
    private String title;
    private String name;
    private String ID;
    private String phone;
    private int age;

    public Passenger()
    {

    }

    public Passenger(String title, String name, String ID, String phone, int age)
    {
        if(title.matches("mr|ms|mrs|Mr|Ms|Mrs" )) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title entered");
        }

        if(name.length() >= 4) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid Name, too short");
        }

        if(ID.length() >= 10) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("ID: Must be at least 10 characters");
        }

        if(phone.length() >= 10) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone: Must be at least 10 characters");
        }
        if(age >= 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Passenger must be 18 or over");
        }
    }
    public String getTitle()
    {
        return title;
    }

    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return ID;
    }

    public String getPhone()
    {
        return phone;
    }

    public int getAge()
    {
        return age;
    }
}
