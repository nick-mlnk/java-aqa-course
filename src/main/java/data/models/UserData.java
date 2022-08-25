package data.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import utils.JsonUtils;

@Builder
@Getter
public class UserData {

    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String email;
    @JsonProperty
    private String gender;
    @JsonProperty
    private String status;

    public String toJson() {
        return JsonUtils.convertToJson(this);
    }
}
