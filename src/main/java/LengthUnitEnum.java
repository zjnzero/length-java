/**
 * description:
 *
 * @author zhangjunnan03
 * @date 2023/9/26 10:32 AM
 */
public enum LengthUnitEnum {
    INCH(1, "英寸"),
    F(2, "英尺"),
    YARD(3, "码");

    private final int value;
    private final String desc;

    LengthUnitEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static double getConversionRatio(LengthUnitEnum fromUnit, LengthUnitEnum toUnit) {
        return getInch(fromUnit) / getInch(toUnit);
    }

    private static double getInch(LengthUnitEnum unit) {
        switch (unit) {
            case INCH:
                return 1;
            case F:
                return 12;
            case YARD:
                return 36;
            default:
                throw new IllegalArgumentException("不支持的单位");
        }
    }
}
