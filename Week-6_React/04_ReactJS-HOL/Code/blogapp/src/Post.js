import React from 'react';

class Post extends React.Component {
  render() {
    const { title, body } = this.props;
    return (
      <div style={{ border: '1px solid gray', padding: '10px', marginBottom: '10px' }}>
        <h3>{title}</h3>
        <p>{body}</p>
      </div>
    );
  }
}

export default Post;
