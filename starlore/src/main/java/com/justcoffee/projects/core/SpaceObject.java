package com.justcoffee.projects.core;

import java.util.UUID;

/**
 * Everything is a space object
 */

public class SpaceObject {

    private final UUID id;  // TODO: Every Object is although a database object and needs a unique identifier

    public SpaceObject() {
        id = UUID.randomUUID();
    }

    public UUID getID() {
        return id;
    }
}
