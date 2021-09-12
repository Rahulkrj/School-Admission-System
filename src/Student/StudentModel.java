package Student;

public class StudentModel {
  private int id;
  private String name;
  private String dob;
  private String contactNo;
  private String fatherName;
  private String address;

  public StudentModel() {
  }

  public StudentModel(String name, String dob, String contactNo, String fatherName,
      String address) {
    this.name = name;
    this.dob = dob;
    this.contactNo = contactNo;
    this.fatherName = fatherName;
    this.address = address;
  }

  public StudentModel(int id, String name, String dob, String contactNo, String fatherName,
      String address) {
    this.id = id;
    this.name = name;
    this.dob = dob;
    this.contactNo = contactNo;
    this.fatherName = fatherName;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "id=" + id +
        "\nname='" + name + '\'' +
        "\ndob='" + dob + '\'' +
        "\ncontactNo='" + contactNo + '\'' +
        "\nfatherName='" + fatherName + '\'' +
        "\naddress='" + address + '\''+"\n";
  }

}
