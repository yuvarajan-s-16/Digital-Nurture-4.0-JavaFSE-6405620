import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainerList from './TrainerList';
import TrainerDetails from './TrainerDetails';
import trainers from './TrainersMock';

function App() {
  return (
    <BrowserRouter>
      <nav style={{ margin: 20 }}>
        <Link to="/" style={{ marginRight: 10 }}>Home</Link>
        <Link to="/trainers">Trainers</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainerList trainers={trainers} />} />
        <Route path="/trainer/:id" element={<TrainerDetails />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
