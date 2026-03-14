import React from "react";

function StudentItem({ student, deleteStudent }) {

  return (
    <tr>

      <td>{student.id}</td>
      <td>{student.name}</td>
      <td>{student.course}</td>

      <td>
        <button
          onClick={() => deleteStudent(student.id)}
        >
          Delete
        </button>
      </td>

    </tr>
  );
}

export default StudentItem;