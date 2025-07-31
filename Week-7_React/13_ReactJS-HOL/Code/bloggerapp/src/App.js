import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view, setView] = useState("book"); // Default: BookDetails

  // 1. If-Else statement rendering
  function renderWithIfElse() {
    if (view === "book") return <BookDetails />;
    else if (view === "blog") return <BlogDetails />;
    else return <CourseDetails />;
  }

  // 2. Ternary Operator Rendering
  const renderWithTernary =
    view === "book" ? (
      <BookDetails />
    ) : view === "blog" ? (
      <BlogDetails />
    ) : (
      <CourseDetails />
    );

  // 3. Logical && rendering (only for one case)
  const renderWithLogicalAnd =
    view === "course" && <CourseDetails />;

  // 4. Switch-like Rendering
  const renderSwitchCase = () => {
    switch (view) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return <p>Select a valid view</p>;
    }
  };

  return (
    <div className="App">
      <h1>Blogger App</h1>
      <div>
        <button onClick={() => setView("book")}>Book</button>
        <button onClick={() => setView("blog")}>Blog</button>
        <button onClick={() => setView("course")}>Course</button>
      </div>

      <hr />

      <h2>Rendered using If-Else:</h2>
      {renderWithIfElse()}

      <h2>Rendered using Ternary:</h2>
      {renderWithTernary}

      <h2>Rendered using Logical AND (only shows Course):</h2>
      {renderWithLogicalAnd}

      <h2>Rendered using Switch-Case style:</h2>
      {renderSwitchCase()}
    </div>
  );
}

export default App;
