import React from "react";
import { Link } from "react-router-dom";

function Home() {
  return (
    <div className="home">
      <h1>🎓 Student Management System</h1>

      <div className="menu">
        <Link to="/add" className="card-btn">➕ Add Student</Link>
        <Link to="/edit" className="card-btn">✏️ Edit Student</Link>
        <Link to="/delete" className="card-btn">🗑️ Delete Student</Link>
        <Link to="/view" className="card-btn">📋 View Students</Link>
      </div>
    </div>
  );
}

export default Home;
