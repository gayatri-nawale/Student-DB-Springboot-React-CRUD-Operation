import React, { useState } from "react";

function EditStudent() {
  const [student, setStudent] = useState({
    rollno: "",
    name: "",
    department: "",
    year: "",
    city: "",
    phonenumber: ""
  });

  const handleChange = e =>
    setStudent({ ...student, [e.target.name]: e.target.value });

  const handleSubmit = async e => {
    e.preventDefault();

    await fetch("http://localhost:8080/api/student", {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(student)
    });

    alert("Student Updated");
  };

  return (
    <div className="page">
      <h2>Edit Student</h2>
      <form className="form" onSubmit={handleSubmit}>
        {Object.keys(student).map(k => (
          <input
            key={k}
            name={k}
            placeholder={k}
            value={student[k]}
            onChange={handleChange}
            required
          />
        ))}
        <button>Update</button>
      </form>
    </div>
  );
}

export default EditStudent;
