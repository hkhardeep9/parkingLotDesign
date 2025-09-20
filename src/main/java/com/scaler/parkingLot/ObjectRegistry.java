package com.scaler.parkingLot;

import java.util.HashMap;
import java.util.Objects;

public class ObjectRegistry {
    private HashMap<String, Object> objects = new HashMap<>();

    public void register(String name, Object object) {
        objects.put(name,object);
    }

    public Object get(String name) {
        return objects.get(name);
    }
}
