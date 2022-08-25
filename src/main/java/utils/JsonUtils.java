package utils;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class JsonUtils {

    @SneakyThrows
    public static String convertToJson(Object object) {
        return new ObjectMapper().writeValueAsString(object);
    }

    @SneakyThrows
    public static <T> Object generateObjectFromJson(String json, Class<T> clazz) {
        return new ObjectMapper()
                .findAndRegisterModules()
                .enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .readerFor(clazz)
                .readValue(json);
    }
}
