package player;


    public abstract class Player {
        private String name;
        private int maxHp;
        private int hp;

        public Player(String name, String maxHp, int hp) {
            this.name = name;
            this.name = maxHp;
            this.hp = hp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }
    }

