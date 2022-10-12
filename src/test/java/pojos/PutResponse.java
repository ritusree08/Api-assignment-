package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutResponse {

        @JsonProperty("name")
        private String name;
    @JsonProperty("job")
    private String job;

    @JsonProperty("updatedAt")
    private String updateAt;

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }
}
