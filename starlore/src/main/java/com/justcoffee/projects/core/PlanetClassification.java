package com.justcoffee.projects.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
// TODO: A lot of this needs rethinking, but for the sake of the beginning we start with this
public enum PlanetClassification {
    TERRESTRIAL(0),             // like earth or mars with a solid planetary surface (rocky)
    GASGIANT(1),                // like Jupiter or Saturn, light gases like hydrogen and helium
    ICEGIANT(2),                // like Uranus and Neptun, with heavier gases like oxygen or carbon
    DWARFPLANET(3),             // small planets like ceres or pluto
    PLANETOID(4);               // something that is neither a dwarf planet, not an asteroid, but with a direct orbit around the sun

    private int classNumber;

    PlanetClassification(int classNumber) {
        this.classNumber = classNumber;
    }

    private static Map<Integer, PlanetClassification> classificationMap = new HashMap<>();

    static {
        for(PlanetClassification classification : PlanetClassification.values()) {
            classificationMap.put(classification.classNumber, classification);
        }
    }

    public static PlanetClassification getRandomClassification() {
        Random random = new Random(System.currentTimeMillis());
        return classificationMap.get(random.nextInt(classificationMap.size()));
    }
}
