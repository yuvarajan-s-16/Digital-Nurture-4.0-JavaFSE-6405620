import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Virat', 'Dhoni', 'Jadeja', 'Bumrah', 'Kuldeep'];
  const evenTeam = ['Rohit', 'Gill', 'Shami', 'Surya', 'Rahul'];

  const [v1, v2, v3, v4, v5] = oddTeam;
  const [e1, e2, e3, e4, e5] = evenTeam;

  const T20players = ['Rohit', 'Virat', 'Gill'];
  const RanjiTrophyPlayers = ['Jadeja', 'Shami', 'Dhoni'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>
        {[v1, v2, v3, v4, v5].map((player, index) => <li key={index}>{player}</li>)}
      </ul>

      <h2>Even Team Players:</h2>
      <ul>
        {[e1, e2, e3, e4, e5].map((player, index) => <li key={index}>{player}</li>)}
      </ul>

      <h2>Merged T20 & Ranji Trophy Players:</h2>
      <ul>
        {mergedPlayers.map((player, index) => <li key={index}>{player}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
