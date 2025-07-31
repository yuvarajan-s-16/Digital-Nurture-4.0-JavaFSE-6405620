import React, { Component } from 'react';

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null,
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      this.setState({ user: data.results[0] });
    } catch (error) {
      console.error('Failed to fetch user:', error);
    }
  }

  render() {
    const { user } = this.state;

    if (!user) {
      return <p>Loading user data...</p>;
    }

    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <h2>User Details</h2>
        <img src={user.picture.large} alt="User" style={{ borderRadius: '50%' }} />
        <h3>
          {user.name.title} {user.name.first}
        </h3>
      </div>
    );
  }
}

export default Getuser;
