import React, { useState } from "react";

function DeleteStudent() {
  const [rollno, setRollno] = useState("");

  const deleteStudent = async () => {
    await fetch(`http://localhost:8080/api/student/${rollno}`, {
      method: "DELETE"
    });
    alert("Student Deleted");
  };

  return (
    <div className="page">
      <h2>Delete Student</h2>
      <input
        type="number"
        placeholder="Enter Roll No"
        value={rollno}
        onChange={e => setRollno(e.target.value)}
      />
      <button onClick={deleteStudent}>Delete</button>
    </div>
  );
}

export default DeleteStudent;
