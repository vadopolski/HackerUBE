package day2;

public enum  Direction {
    UP {
        public Direction opposite(){return DOWN;}
    },
    DOWN {
        public Direction opposite(){return UP;}
    };

    public abstract Direction opposite();
}