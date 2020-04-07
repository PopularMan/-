/**
 * 工厂模式.
 */
public abstract class Hero {
	abstract String say();

	protected String getObject() {
		return say();
	}

	public static void main(String[] args) {
		Hero yasuo = new Yasuo();
		String object = yasuo.getObject();
		Hero qgy = new Qingangyin();
		System.out.println(object + "_" + qgy.getObject());

	}

}

class Yasuo extends Hero {

	@Override
	String say() {
		return "且随疾风前行，身后可留风云";
	}
}

class Qingangyin extends Hero {

	@Override
	String say() {
		return "精准与否，就是手术与屠宰的区别";
	}
}

