public class StudentReader {
    public static final String[] LABEL_START = new String[] { "<name>", "<gpa>" };
    public static final String[] LABEL_END = new String[] { "</name>", "</gpa>" };
    public static final String START_STUDENT = "student ";

    public String input;
    public Student[] list;

    public StudentReader(String input) {
        this.input = input;
    }

    public int countStudents() {
        int count = 0;
        int idx = this.input.indexOf(START_STUDENT);
        while (true) {
            if (idx < 0)
                break;
            count++;
            idx = this.input.indexOf(START_STUDENT, idx + 1);
        }
        return count;
    }

    public Student[] getStudents() {
        int studentCount = countStudents();
        Student[] students = new Student[studentCount];
        int leftIndex, rightIndex = 0;

        for (int i = 0; i < studentCount; i++) {
            // Student ID
            leftIndex = input.indexOf(START_STUDENT, rightIndex);
            rightIndex = input.indexOf(">", leftIndex);
            int id = Integer.parseInt(input.substring(leftIndex + START_STUDENT.length() + 4, rightIndex - 1));

            // Student NAME
            leftIndex = input.indexOf(LABEL_START[0], rightIndex);
            rightIndex = input.indexOf(LABEL_END[0], leftIndex);
            String name = input.substring(leftIndex + LABEL_START[0].length(), rightIndex);

            // Student GPA
            leftIndex = input.indexOf(LABEL_START[1], rightIndex);
            rightIndex = input.indexOf(LABEL_END[1], leftIndex);
            double gpa = Double.parseDouble(input.substring(leftIndex + LABEL_START[1].length(), rightIndex));

            students[i] = new Student(id, name, gpa);
        }

        list = students;
        return students;
    }

    public String getStudentNames() {
        StringBuilder sb = new StringBuilder("Students are: ");
        for (int i = 0; i < list.length; i++) {
            if (i != 0)
                sb.append(", ");
            sb.append(list[i].name());
        }
        return sb.toString();
    }
}
