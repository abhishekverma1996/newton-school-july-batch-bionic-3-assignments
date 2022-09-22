// your class code goes here
 class VipCustomer {
    public String name;
    public double creditLimit;
    public String email;

    public VipCustomer() {
        this("XYZ", 10, "xyz@abc.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "xyz@abc.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
