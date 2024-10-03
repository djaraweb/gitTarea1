package org.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.pokemones.Pokemon;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    private static final String pokemonesJsonPath = "src/main/resources/dataJson/pokemones.json";

    public static List<Pokemon> getPokemonList() {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(pokemonesJsonPath),
                    TypeFactory.defaultInstance().constructCollectionType(List.class, Pokemon.class));
        } catch (IOException ioException) {
            throw new RuntimeException(ioException.getLocalizedMessage());
        }
    }
}
