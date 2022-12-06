package ie.atu;

public class Business {
    private String name;
    private long id;
    private String address;
    private int openTime;
    private int closeTime;

    public Business(String name, long id, String address, int openTime, int closeTime) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getOpenTime() {
        return openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setName(String name) {
        if(name.length() >= 4){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name must have at least 4 characters");
        }
    }

    public void setId(long id) {
        if(id > 0){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("Id must be be a positive integer");
        }
    }

    public void setAddress(String address) {
        if(address.length() >= 6) {
            this.address = address;
        }
        else{
            throw new IllegalArgumentException("Address must have at least 6 characters");
        }
    }

    public void setOpenTime(int openTime) {
        if(openTime > 0 && openTime <= 2359) {
            this.openTime = openTime;
        }
        else{
            throw new IllegalArgumentException("The opening time must be a valid 24hr time");
        }
    }

    public void setCloseTime(int closeTime) {
        if(closeTime > 0 && closeTime <= 2359) {
            this.closeTime = closeTime;
        }
        else{
            throw new IllegalArgumentException("The closing time must be a valid 24 hr time");
        }
    }

    public static void main(String[] args) {
        System.out.println("Docker is running this project");
    }

    public void printSomething(){
        System.out.println("This is for a test!!");
    }
}
