public enum FileType {

	PNG("png"), JPG("jpg");

	String desc;

	FileType(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return desc;
	}

}
