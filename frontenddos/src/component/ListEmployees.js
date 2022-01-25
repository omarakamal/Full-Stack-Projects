import React, { useEffect, useState } from "react";
import axios from "axios";

export default function ListEmployees() {
  const [myStudent, setMyStudent] = useState({ id: "", name: "", email: "" });
  useEffect(() => {
    axios.get("https://murmuring-lake-94113.herokuapp.com/api/bootcamp").then((response) => {
      console.log(response.data);
      setMyStudent(response.data[0]);
    });
    return () => {};
  }, []);

  return (
    <div>
    <h1>hi Omar</h1>
      <h2>my Student details are: {JSON.stringify(myStudent)}</h2>
    </div>
  );
}
