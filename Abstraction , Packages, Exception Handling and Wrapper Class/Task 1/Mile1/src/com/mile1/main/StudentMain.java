package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public StudentMain() {

        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }

        data[0] = new Student("Sekar", new int[]{85, 75, 95});
        data[1] = new Student(null, new int[]{11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        StudentMain obj = new StudentMain();

        StudentReport report = new StudentReport();

        // Validate all Student objects
        for (int i = 0; i < data.length; i++) {

            try {

                String result = report.validate(data[i]);

                if (result.equals("VALID")) {

                    String grade = report.findGrades(data[i]);

                    System.out.println(grade);
                }

            } catch (NullNameException e) {

                e.printStackTrace();

            } catch (NullMarksArrayException e) {

                e.printStackTrace();

            } catch (NullStudentObjectException e) {

                e.printStackTrace();
            }
        }

        // Create StudentService object
        StudentService service = new StudentService();

        // Count null marks arrays
        System.out.println(
                service.findNumberOfNullMarksArray(data)
        );

        // Count null names
        System.out.println(
                service.findNumberOfNullName(data)
        );

        // Count null student objects
        System.out.println(
                service.findNumberOfNullObjects(data)
        );
    }
}