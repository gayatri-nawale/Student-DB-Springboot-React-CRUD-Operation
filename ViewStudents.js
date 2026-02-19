import React, { useEffect, useState } from "react";

function ViewStudents() {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/students")
      .then(res => res.json())
      .then(data => setStudents(data));
  }, []);

  return (
    <div className="page">
      <h2>All Students</h2>
      <table>
        <thead>
          <tr>
            <th>Roll</th>
            <th>Name</th>
            <th>Dept</th>
            <th>Year</th>
            <th>City</th>
            <th>Phone</th>
          </tr>
        </thead>
        <tbody>
          {students.map(s => (
            <tr key={s.rollno}>
              <td>{s.rollno}</td>
              <td>{s.name}</td>
              <td>{s.department}</td>
              <td>{s.year}</td>
              <td>{s.city}</td>
              <td>{s.phonenumber}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default ViewStudents;
