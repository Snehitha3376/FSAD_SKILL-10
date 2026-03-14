import React from "react";

function StudentForm({ newStudent, handleChange, addStudent }) {

  return (
    <div>

      <input
        type="text"
        name="id"
        placeholder="Student ID"
        value={newStudent.id}
        onChange={handleChange}
      />

      <input
        type="text"
        name="name"
        placeholder="Student Name"
        value={newStudent.name}
        onChange={handleChange}
      />

      <input
        type="text"
        name="course"
        placeholder="Course"
        value={newStudent.course}
        onChange={handleChange}
      />

      <button onClick={addStudent}>
        Add Student
      </button>

    </div>
  );
}

export default StudentForm;