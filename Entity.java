package ID_27409.Q1;

    class Entity {
        private int id;
        private String createdDate;
        private String updatedDate;

        public Entity(int id, String createdDate, String updatedDate) {
            if (id <= 0) {
                id = 1;
            }
            if (createdDate == null || createdDate.trim().isEmpty()) {
                createdDate = "1970-01-01";
            }
            if (updatedDate == null || updatedDate.trim().isEmpty()) {
                updatedDate = "1970-01-01";
            }
            this.id = id;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }

        public int getId() {
            return id;
        }
        public String getCreatedDate() {
            return createdDate;
        }
        public String getUpdatedDate() {
            return updatedDate;
        }

        public void display() {
            System.out.println("Entity: id=" + id + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate);
        }
    }

