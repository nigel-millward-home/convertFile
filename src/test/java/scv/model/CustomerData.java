package scv.model;

import com.google.gson.annotations.Expose;

public class CustomerData {

    public void setAssertionFile(String assertionFile) {
        this.assertionFile = assertionFile;
    }

    @Expose(serialize = false)
    private transient String enumeratedType;
    @Expose(serialize = false)
    private transient String assertionFile;

    private String activityType;
    private String isStoreUser;
    private String messageId;
    private Person person;

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getIsStoreUser() {
        return isStoreUser;
    }

    public void setIsStoreUser(String isStoreUser) {
        this.isStoreUser = isStoreUser;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getEnumeratedType() {
        return enumeratedType;
    }

    public void setEnumeratedType(String enumeratedType) {
        this.enumeratedType = enumeratedType;
    }

    public String getAssertionFile() {
        return assertionFile;
    }

}