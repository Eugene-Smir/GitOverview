package net.proselyte.gitoverview;

public class BaseEntity {

    private long id;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public boolean isNew() {
        return false;
    }
}
