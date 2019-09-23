package scv.model;


public class CustomerTestDataBuilder {

    private String enumeratedType;
    private String assertionFile;
    private String activityType;
    private String isStoreUser;
    private String eventType;
    private String id;
    private String status;
    private String createDate;

    public CustomerTestDataBuilder withTestData(CustomerTestData customerData) {
        this.enumeratedType = customerData.getEnumeratedType();
        this.assertionFile  = customerData.getAssertionFile();
        this.activityType = customerData.getActivityType();
        this.isStoreUser = customerData.getIsStoreUser();
        this.eventType = customerData.getEventType();
        this.id = customerData.getId();
        this.status = customerData.getStatus();
        this.createDate = customerData.getCreateDate();

        return this;
    }

    public CustomerData build() {
        CustomerData customerData = new CustomerData();
        customerData.setEnumeratedType(this.enumeratedType);
        customerData.setAssertionFile(this.assertionFile);
        customerData.setActivityType(this.activityType);
        customerData.setIsStoreUser(this.isStoreUser);

        Person person = new Person();
        person.setEventType(this.eventType);
        person.setId(this.id);
        person.setStatus(this.status);
        person.setCreateDate(this.createDate);

        customerData.setPerson(person);

        return customerData;
    }
}
