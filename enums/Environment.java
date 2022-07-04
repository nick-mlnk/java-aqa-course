package enums;

public enum Environment {
    DEV("dev"), // will use base print
    STAGE("stage") {
        @Override
        public void print() {
            System.out.println("Higher ".concat(this.toString()));
        }
    },
    PROD("prod") {
        @Override
        public void print() {
            System.out.println("Higher ".concat(this.toString()));
        }
    };

    private final String name;

    Environment(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "name='" + name + '\'' +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}
