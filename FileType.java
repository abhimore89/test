public enum FileType {

	PNG("png"), png("png"), JPG("jpg"), jpg("jpg");

	String desc;

	FileType(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return desc;
	}

}
