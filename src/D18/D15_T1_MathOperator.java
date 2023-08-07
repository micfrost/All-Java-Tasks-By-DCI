package D18;

public class D15_T1_MathOperator {
    public static void main(String[] args) {
        int int1 = 10;
        int int2 = 2;
        long long1 = 230030034L;
        float float1 = 22.9F;
        float float2 = 0.56F;
        double double1 = 0.233334;
        int int3 = 2;
        int int4 = 3;
        int result = int3 + int4;
        System.out.printf("Add: %d + %d = %d %n", Integer.valueOf(int3), Integer.valueOf(int4), result);
        int sto = 100;
        float multiply1 = (float)(int1 = (int)((float)int1 * float2));
        System.out.printf("Add: %d + %d = %d %n", result, Integer.valueOf(sto), result += sto);
        System.out.printf("Subtract: %d - %d = %d %n", int1, Integer.valueOf(int2), int1 -= int2);
        System.out.printf("Multiply: %d * %f = %.2f %n", int1, float2, multiply1);
        System.out.printf("Division: %f - %d = %.2f %n", double1, Integer.valueOf(int2), double1 / (double)int2);
        System.out.printf("Add: %d %% %d = %d %n", result, Integer.valueOf(int2), result % int2);

    }
}
