package com.successdca.tictactoe;

import com.successdca.tictactoe.ships.Ship;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    private final List<Ship> ships = new ArrayList<>();

    public void add(Ship ship) {
        this.ships.add(ship);
    }
}
