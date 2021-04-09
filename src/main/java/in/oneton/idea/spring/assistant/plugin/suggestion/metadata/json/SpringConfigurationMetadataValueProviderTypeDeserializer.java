package in.oneton.idea.spring.assistant.plugin.suggestion.metadata.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class SpringConfigurationMetadataValueProviderTypeDeserializer
        extends JsonDeserializer<SpringConfigurationMetadataValueProviderType> {

    @Override
    public SpringConfigurationMetadataValueProviderType deserialize(final JsonParser jsonParser, final DeserializationContext deserializationContext)
            throws IOException, JsonProcessingException {
        String providerTypeAsStr = jsonParser.getValueAsString();
        switch (providerTypeAsStr) {
            case "class-reference":
                return SpringConfigurationMetadataValueProviderType.class_reference;
            case "handle-as":
                return SpringConfigurationMetadataValueProviderType.handle_as;
            case "logger-name":
                return SpringConfigurationMetadataValueProviderType.logger_name;
            case "spring-bean-reference":
                return SpringConfigurationMetadataValueProviderType.spring_bean_reference;
            case "spring-profile-name":
                return SpringConfigurationMetadataValueProviderType.spring_profile_name;
            case "any":
                return SpringConfigurationMetadataValueProviderType.any;
            default:
                return SpringConfigurationMetadataValueProviderType.unknown;
        }
    }
}
