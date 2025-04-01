package Q_04;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner() {
        this.ownerName = "Unknown";
        this.phoneNo = "Unknown";
    }

    public Owner(String name, String num) {
        this.ownerName = name;
        this.phoneNo = num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String num) {
        this.phoneNo = num;
    }
}

class Bicycle {
    // Data Member
    private Owner owner;

    // Constructor: Initializes the data member
    public Bicycle() {
        owner = new Owner(); // Default Owner object
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    // Returns the Owner object
    public Owner getOwner() {
        return owner;
    }
    // Assigns the Owner object
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

public class BicycleOwner {
    public static void main(String[] args) {
        Owner owner_1 = new Owner("vidarshana", "0762244909");
        Bicycle bike1 = new Bicycle(owner_1);

        Owner owner_2 = new Owner();
        owner_2.setOwnerName("Nimal");
        owner_2.setPhoneNo("0784134943");
        Bicycle bike2 = new Bicycle();
        bike2.setOwner(owner_2);

        System.out.println("Bike 1 Owner: " + bike1.getOwner().getOwnerName() + ", Phone: " + bike1.getOwner().getPhoneNo());
        System.out.println("Bike 2 Owner: " + bike2.getOwner().getOwnerName() + ", Phone: " + bike2.getOwner().getPhoneNo());
    }
}
