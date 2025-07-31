import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent page reload
    const converted = parseFloat(rupees) / 90; // Assuming 1 Euro = ₹90
    setEuro(converted.toFixed(2));
  };

  return (
    <div>
      <h2>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Enter Amount in Rupees:
          <input
            type="number"
            value={rupees}
            onChange={(e) => setRupees(e.target.value)}
            required
          />
        </label>
        <button type="submit">Convert</button>
      </form>

      {euro && (
        <p>
          ₹{rupees} = €{euro}
        </p>
      )}
    </div>
  );
}

export default CurrencyConvertor;
