import React, { useState } from "react";
import StudentForm from "./StudentForm";
import StudentList from "./StudentList";

function StudentManager() {

  const initialStudents = [
    { id: 1, name: "Snehitha", course: "CSE" },
    { id: 2, name: "Rahul", course: "AI" },
    { id: 3, name: "Priya", course: "Data Science" },
    { id: 4, name: "Arjun", course: "Cyber Security" },
    { id: 5, name: "Neha", course: "IT" }
  ];

  const [students, setStudents] = useState(initialStudents);

  const [newStudent, setNewStudent] = useState({
    id: "",
    name: "",
    course: ""
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setNewStudent({ ...newStudent, [name]: value });
  };

  const addStudent = () => {
    if (newStudent.id && newStudent.name && newStudent.course) {
      setStudents([...students, newStudent]);
      setNewStudent({ id: "", name: "", course: "" });
    }
  };

  const deleteStudent = (id) => {
    const updated = students.filter(student => student.id !== id);
    setStudents(updated);
  };

  return (
    <div>
      <h2>Student Manager</h2>

      <StudentForm
        newStudent={newStudent}
        handleChange={handleChange}
        addStudent={addStudent}
      />

      <StudentList
        students={students}
        deleteStudent={deleteStudent}
      />
    </div>
  );
}

export default StudentManager;