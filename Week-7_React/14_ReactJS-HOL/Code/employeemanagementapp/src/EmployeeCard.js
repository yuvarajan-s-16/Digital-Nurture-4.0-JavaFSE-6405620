// src/EmployeeCard.js
import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';

const EmployeeCard = ({ employee }) => {
  const theme = useContext(ThemeContext);

  const themeClass = theme === 'dark' ? 'btn-dark' : 'btn-light';

  return (
    <div style={{ border: '1px solid gray', padding: '10px', margin: '10px' }}>
      <h3>{employee.name}</h3>
      <p>Role: {employee.role}</p>
      <button className={themeClass}>View Profile</button>
    </div>
  );
};

export default EmployeeCard;
