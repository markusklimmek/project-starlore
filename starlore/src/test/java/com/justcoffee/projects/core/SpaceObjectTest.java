package com.justcoffee.projects.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class SpaceObjectTest {

    @Test
    public void theIdOfASpaceObjectIsAUUID() {
        SpaceObject object = new SpaceObject();
        Assert.assertThat(object.getID(),is(instanceOf(UUID.class)));
    }


}