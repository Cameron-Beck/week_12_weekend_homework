package player;


    public abstract class Player {
        private String name;
        private int maxHp;
        private int hp;

        public Player(String name, int maxHp, int hp) {
            this.name = name;
            this.maxHp = maxHp;
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

        public int getMaxHp() {
            return maxHp;
        }

        public void setMaxHp(int maxHp) {
            this.maxHp = maxHp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }
    }

