package equipment;

abstract class Equipment {
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    abstract void accept(EquipmentVisitor equipmentVisitor);
}