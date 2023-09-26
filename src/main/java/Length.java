public class Length {

    private final double value;
    private final String unit;

    public Length(double val, String unit) {
        this.value = val;
        this.unit = unit;
    }

    public Length convertToNewUnit(String newUnit) {
        LengthUnitEnum fromUnit = LengthUnitEnum.valueOf(this.unit.toUpperCase());
        LengthUnitEnum toUnit = LengthUnitEnum.valueOf(newUnit.toUpperCase());
        return new Length(LengthUnitEnum.getConversionRatio(fromUnit, toUnit) * this.value, newUnit);
    }

    public double getVal() {
        return this.value;
    }

    public String getUnit() {
        return this.unit;
    }
}
