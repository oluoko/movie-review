package dev.scene_it_all.movie_review;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.bson.types.ObjectId;

import java.io.IOException;

public class CustomObjectIdSerializer extends StdSerializer<ObjectId> {
    public CustomObjectIdSerializer() {
        this(null);
    }

    public CustomObjectIdSerializer(Class<ObjectId> t) {
        super(t);
    }

    @Override
    public void serialize(ObjectId objectId, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(objectId.toHexString());
    }
}
