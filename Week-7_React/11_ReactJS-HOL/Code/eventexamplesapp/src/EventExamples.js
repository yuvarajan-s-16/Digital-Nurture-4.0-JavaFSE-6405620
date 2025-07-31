import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class EventExamples extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
      message: '',
    };

    // Binding for 'this'
    this.increment = this.increment.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.handleMultiple = this.handleMultiple.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.onPress = this.onPress.bind(this);
  }

  increment() {
    this.setState({ count: this.state.count + 1 });
  }

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello() {
    alert("Hello! Welcome to React Events.");
  }

  handleMultiple() {
    this.increment();
    this.sayHello();
  }

  sayWelcome(msg) {
    alert(msg);
  }

  onPress(e) {
    alert("I was clicked");
    console.log(e); // Synthetic Event
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h1>React Event Examples</h1>

        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.handleMultiple}>Increase</button>{' '}
        <button onClick={this.decrement}>Decrease</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome to Event Handling!")}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.onPress}>Synthetic Event Button</button>

        <br /><hr /><br />

        <CurrencyConvertor/>
      </div>
    );
  }
}

export default EventExamples;
