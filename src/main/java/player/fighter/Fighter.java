package player.fighter;

import player.Player;

public abstract class Fighter extends Player {

    public Fighter(String name, int maxHp, int hp) {
        super(name, maxHp, hp);
    }
}