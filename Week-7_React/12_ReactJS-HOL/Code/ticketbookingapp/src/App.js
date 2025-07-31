import React, { useState } from "react";

function GuestPage() {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>You can browse flight details below:</p>
      <ul>
        <li>Flight 101 - Delhi to Mumbai</li>
        <li>Flight 202 - Chennai to Bangalore</li>
        <li>Flight 303 - Kolkata to Hyderabad</li>
      </ul>
    </div>
  );
}

function UserPage() {
  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>You can now book your tickets:</p>
      <button>Book Flight 101</button><br />
      <button>Book Flight 202</button><br />
      <button>Book Flight 303</button>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  let button;
  let content;

  if (isLoggedIn) {
    button = <button onClick={handleLogoutClick}>Logout</button>;
    content = <UserPage />;
  } else {
    button = <button onClick={handleLoginClick}>Login</button>;
    content = <GuestPage />;
  }

  return (
    <div className="App">
      <h1>Ticket Booking App</h1>
      {button}
      {content}
    </div>
  );
}

export default App;
