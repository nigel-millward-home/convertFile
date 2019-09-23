package scv.model;

import com.google.gson.annotations.Expose;
import com.univocity.parsers.annotations.Parsed;


public class CustomerTestData {
    @Expose(serialize = false)
    @Parsed(index = 1)
    private transient String enumeratedType;

    @Expose(serialize = false)
    @Parsed(index = 2)
    private transient String assertionFile;

    @Parsed(index = 3)
    private String activityType;

    @Parsed(index = 4)
    private String isStoreUser;

    @Parsed(index = 5)
    private String eventType;

    @Parsed(index = 6)
    private String id;

    @Parsed(index = 7)
    private String enablePersonalisation;

    @Parsed(index = 8)
    private String status;

    @Parsed(index = 9)
    private String createDate;

    public String getEnumeratedType() {
        return enumeratedType;
    }

    public void setEnumeratedType(String enumeratedType) {
        this.enumeratedType = enumeratedType;
    }

    public String getAssertionFile() {
        return assertionFile;
    }

    public void setAssertionFile(String assertionFile) {
        this.assertionFile = assertionFile;
    }

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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id =id;
    }

    public String getEnablePersonalisation() {
        return enablePersonalisation;
    }

    public void setEnablePersonalisation(String enablePersonalisation) {
        this.enablePersonalisation = enablePersonalisation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}

