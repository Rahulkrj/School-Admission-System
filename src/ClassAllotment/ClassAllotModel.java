package ClassAllotment;

import Admission.AdmissionModel;
import Student.StudentModel;

public class ClassAllotModel {
    private int classAllotId;
    private int className;
    private String classTeacher;
    private String section;
    private String session;
    AdmissionModel admissionModel;

    public int getClassAllotId() {
        return classAllotId;
    }

    public void setClassAllotId(int classAllotId) {
        this.classAllotId = classAllotId;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public AdmissionModel getAdmissionModel() {
        return admissionModel;
    }

    public void setAdmissionModel(AdmissionModel admissionModel) {
        this.admissionModel = admissionModel;
    }

    public String toString(){
        return  "admissionId='" + admissionModel + '\'' +
                "\nclassName='" + className + '\'' +
                "\nclassTeacher='" + classTeacher + '\'' +
                "\nsection='" + section + '\'' +
                "\nsession='" + session + '\'' + "\n";
    }
}
