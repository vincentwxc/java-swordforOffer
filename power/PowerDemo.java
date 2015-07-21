package power;

public class PowerDemo {
	public static double  Power(double base, int exponent) {
		if(base > -0.000001 && base < 0.0000001 && exponent < 0){
			return 0.0;
		}
		double result = powerWithExponent(base, exponent);
		return result;
	  }
	public static double  powerWithExponent(double base, int exponent){
		if(exponent == 0){
			return 1.0;
		}
		if(exponent == 1){
			return base;
		}
		if(exponent < 0){
			exponent = -exponent;
			double result1 = powerWithExponent(base, exponent >> 1);
			result1 *= result1;
			if((exponent & 0x1) == 0){
				result1 *= base;
			}
			return 1/result1;
		}
		double result1 = powerWithExponent(base, exponent >> 1);
		result1 *= result1;
		if((exponent & 0x1)> 0){
			result1 *= base;
		}
		return result1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power(0,0));
		System.out.println(Power(0,-1));
		System.out.println(Power(-1,2));
		System.out.println(Power(-2,-1));
		System.out.println(Power(3,2));
		System.out.println(Power(2,-2));

	}

}
