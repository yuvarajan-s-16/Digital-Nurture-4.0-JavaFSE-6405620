import React from 'react';

const OfficeSpace = () => {
  // JSX heading
  const heading = <h1 style={{ textAlign: 'center' }}>Office Space Rentals</h1>;

  // JSX image attribute
  const imageUrl = "https://via.placeholder.com/600x300.png?text=Office+Space";
  const imageElement = <img src={imageUrl} alt="Office Space" width="600" height="300" style={{ display: 'block', margin: 'auto' }} />;

  // Object of office
  const office = {
    name: "Prestige Tech Park",
    rent: 55000,
    address: "Whitefield, Bangalore"
  };

  // List of offices
  const officeList = [
    { name: "WeWork Koramangala", rent: 45000, address: "Koramangala, Bangalore" },
    { name: "CoWrks RMZ", rent: 80000, address: "RMZ EcoWorld, Bangalore" },
    { name: "91Springboard", rent: 60000, address: "HSR Layout, Bangalore" },
    { name: "Regus Indiranagar", rent: 30000, address: "Indiranagar, Bangalore" }
  ];

  return (
    <div style={{ padding: '20px' }}>
      {heading}
      {imageElement}

      <h2>Single Office Details</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Rent:</strong> <span style={{ color: office.rent > 60000 ? 'green' : 'red' }}>₹{office.rent}</span></p>
      <p><strong>Address:</strong> {office.address}</p>

      <h2>Available Offices</h2>
      <ul>
        {officeList.map((item, index) => (
          <li key={index}>
            <p><strong>Name:</strong> {item.name}</p>
            <p><strong>Rent:</strong> <span style={{ color: item.rent > 60000 ? 'green' : 'red' }}>₹{item.rent}</span></p>
            <p><strong>Address:</strong> {item.address}</p>
            <hr />
          </li>
        ))}
      </ul>
    </div>
  );
};

export default OfficeSpace;
