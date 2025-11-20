package ID_27409.Q2;

class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        this.id = id > 0 ? id : 1;
        this.createdDate = (createdDate == null || createdDate.isBlank()) ? "1970-01-01" : createdDate;
        this.updatedDate = (updatedDate == null || updatedDate.isBlank()) ? "1970-01-01" : updatedDate;
    }
    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
    public void display() { System.out.println("Entity id=" + id + " created=" + createdDate + " updated=" + updatedDate); }
}

