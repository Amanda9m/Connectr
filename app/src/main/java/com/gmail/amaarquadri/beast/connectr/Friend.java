package com.gmail.amaarquadri.beast.connectr;

import java.util.TreeMap;

/**
 * Created by amandamorin on 2018-01-27.
 */

public class Friend extends User {
    private final boolean hasPermission;

    public Friend(int index, int id, String username, String password, LocationData lastLocation,
                  boolean hasPermission) {
        super(index, id, username, password, lastLocation, null);
        this.hasPermission = hasPermission;
    }

    public boolean hasPermission() {
        return hasPermission;
    }
}
