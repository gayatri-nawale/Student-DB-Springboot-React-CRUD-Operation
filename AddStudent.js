import React, { useState } from "react";

function AddStudent() {
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
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(student)
    });

    alert("Student Added Successfully");
  };

  return (
    <div className="page">
      <h2>Add Student</h2>
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
        <button>Add</button>
      </form>
    </div>
  );
}

export default AddStudent;
