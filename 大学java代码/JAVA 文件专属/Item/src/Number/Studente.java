package Number;

public class Studente {
	private String stuid;
	private String name;
	private String sex;
	private String id;
	private String _class;
	public Studente() {
				}
	public Studente(String stuid, String name, String sex, String id, String _class) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.sex = sex;
		this.id = id;
		this._class = _class;
			}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public void display() {
		System.out.println("学号"+stuid);
		System.out.println("姓名"+name);
		System.out.println("性别"+sex);
		System.out.println("身份证号码"+id);
		System.out.println("班级"+_class);
	}
	
	

}
