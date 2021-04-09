package in.oneton.idea.spring.assistant.plugin.suggestion.metadata.json;

import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * 〈一句话功能简述〉<br>
 * 〈JacksonMapper〉
 *
 * @author zhangzza
 * @create 2021-04-09 16:56
 * @since 2021.04.09
 */
public class JacksonMapper {
    private static final ObjectMapper MAPPER = JsonMapper.builder()
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
            .enable(JsonReadFeature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)
            .enable(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .build();

    public static ObjectMapper getMapper() {
        return MAPPER;
    }
}
