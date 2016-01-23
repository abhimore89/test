public class TestEnum {

	public static void main(String args[]) {

		String ft = "png";

		if (FileType.valueOf(ft) != null) {
			System.out.println("hello");
		}
	}

}
