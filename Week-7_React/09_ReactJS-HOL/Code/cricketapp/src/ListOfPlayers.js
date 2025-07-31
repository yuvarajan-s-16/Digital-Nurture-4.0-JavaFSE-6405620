import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat', score: 95 },
    { name: 'Rohit', score: 60 },
    { name: 'Dhoni', score: 100 },
    { name: 'Hardik', score: 45 },
    { name: 'Gill', score: 85 },
    { name: 'Jadeja', score: 70 },
    { name: 'Bumrah', score: 30 },
    { name: 'Shami', score: 50 },
    { name: 'Kuldeep', score: 90 },
    { name: 'Surya', score: 25 },
    { name: 'Rahul', score: 55 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70:</h3>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
