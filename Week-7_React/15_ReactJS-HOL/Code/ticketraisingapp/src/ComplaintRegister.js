import React, { useState } from 'react';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!employeeName.trim() || !complaint.trim()) {
      alert('Please fill in all fields.');
      return;
    }

    const referenceNumber = 'REF' + Math.floor(100000 + Math.random() * 900000);
    alert(
      `Complaint submitted successfully!\n\nEmployee: ${employeeName}\nReference Number: ${referenceNumber}`
    );

    // Reset form
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>Raise a Complaint</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '10px' }}>
          <label>
            Employee Name:
            <input
              type="text"
              value={employeeName}
              onChange={(e) => setEmployeeName(e.target.value)}
              required
              style={{ marginLeft: '10px', padding: '5px' }}
            />
          </label>
        </div>
        <div style={{ marginBottom: '10px' }}>
          <label>
            Complaint:
            <br />
            <textarea
              value={complaint}
              onChange={(e) => setComplaint(e.target.value)}
              rows="5"
              cols="50"
              required
              style={{ padding: '5px' }}
            />
          </label>
        </div>
        <button type="submit">Submit Complaint</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
