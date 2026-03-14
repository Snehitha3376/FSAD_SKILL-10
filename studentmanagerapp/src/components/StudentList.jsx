import React from "react";
import StudentItem from "./StudentItem";

function StudentList({ students, deleteStudent }) {

  if (students.length === 0) {
    return <p>No students available</p>;
  }

  return (
    <table border="1">

      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Course</th>
          <th>Action</th>
        </tr>
      </thead>

      <tbody>
        {students.map(student => (
          <StudentItem
            key={student.id}
            student={student}
            deleteStudent={deleteStudent}
          />
        ))}
      </tbody>

    </table>
  );
}

export default StudentList;