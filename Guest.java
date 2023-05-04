class Guest {
    private String name;
    private final String ID_number;
    private String mobile_number;

    public Guest(String name,String ID_number,String mobile_number) {
        this.name = name;
        this.ID_number = ID_number;
        this.mobile_number = mobile_number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID_number() {
        return ID_number;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
}