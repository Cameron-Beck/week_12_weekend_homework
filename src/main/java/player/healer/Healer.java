package player.healer;

import player.Player;

    public abstract class Healer extends Player {

        public Healer(String name, int maxHp, int hp) {
            super(name, maxHp, hp);
        }
    }
