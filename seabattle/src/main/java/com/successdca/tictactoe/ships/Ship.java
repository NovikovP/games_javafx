package com.successdca.tictactoe.ships;

import com.successdca.tictactoe.Cell;

import java.util.List;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public interface Ship {
    List<Cell> position();

    List<Cell> border();
}
