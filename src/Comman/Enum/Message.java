package Comman.Enum;

public enum Message {
  INVALID_OPTION("Invalid Option Please Choose Again"),
  INVALID_INPUT_INT("Please provide valid Integer"),
  STUDENT_SAVED("Student Saved."),
  STUDENT_NOT_FOUND("Student not found");


  public final String value;

  Message(String value) {
    this.value = value;
  }
}
