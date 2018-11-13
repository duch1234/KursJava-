package pl.developerpi91.typyNumeryczneEnum;


	public enum Computation{
		ADD{

			@Override
			public double perform(double x, double y) {
				return x+y;
			}
			
		},
		MULTIPY {
			@Override
			public double perform(double x, double y) {
				return x*y;
			}
		},
		DIVIDE {
			@Override
			public double perform(double x, double y) {
				return x/y;
				}
		},
		SUBSTRACT {
			@Override
			public double perform(double x, double y) {
				return x-y;
			}
		};
		
	public static void main(String[] args) {
		System.out.println("ADD " + Computation.ADD.perform(1, 2));
		System.out.println("MUL" + Computation.MULTIPY.perform(1, 2));

	}
	public abstract double perform(double x, double y);
}
