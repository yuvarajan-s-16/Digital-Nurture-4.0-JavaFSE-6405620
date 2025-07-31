// src/EmployeesList.js
import React from 'react';
import EmployeeCard from './EmployeeCard';

const EmployeesList = () => {
  const employees = [
    { id: 1, name: 'John', role: 'Developer' },
    { id: 2, name: 'Sara', role: 'Designer' },
  ];

  return (
    <div>
      <h2>Employees</h2>
      {employees.map(emp => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
};

export default EmployeesList;
