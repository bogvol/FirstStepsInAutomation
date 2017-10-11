import org.junit.Test;

public class MyNetSalaryCalculator {
    public double mySalaryPerMonth = 9000;
    public static final double SOCIAL_INSURANCES_PERCENT = 0.1371;
    public static final double HEALTH_CARE_DEDUCTION_PERCENT = 0.09;

    @Test
    public void calculateNetSalary() {

        double socialInsurancesSum = mySalaryPerMonth * SOCIAL_INSURANCES_PERCENT;
        double healthCareDeductionSum = (mySalaryPerMonth - socialInsurancesSum) * HEALTH_CARE_DEDUCTION_PERCENT;
        System.out.printf("Social Insurance and Health Care in total is: " + (socialInsurancesSum + healthCareDeductionSum));
    }

}
