//Belongs to a package called org.jsmart.zerocode.coverter
package org.jsmart.zerocode.converter;
// 
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
// A new interface created called Converter
public interface Converter {
    Object xmlToJson(String xmlObject);

    Object stringToJson(String jsonString) throws IOException;

    Object jsonToJson(String jsonString) throws IOException;

    Object jsonBlockToJson(JsonNode jsonNode) throws IOException;

    default Object jsonNodeToJson(JsonNode jsonNode) throws IOException {
        return jsonBlockToJson(jsonNode);
    }
}
