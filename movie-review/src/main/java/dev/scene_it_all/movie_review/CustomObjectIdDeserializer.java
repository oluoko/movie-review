package dev.scene_it_all.movie_review;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.bson.types.ObjectId;

import java.io.IOException;

public class CustomObjectIdDeserializer extends StdDeserializer<ObjectId> {
    public CustomObjectIdDeserializer() {
        this(null);
    }

    public CustomObjectIdDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public ObjectId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return new ObjectId(p.getText());
    }
}
