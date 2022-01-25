import React, { Component } from "react";
import axios from "axios";
import "./ListEmoloyees.css";

export class ListEmployees extends Component {
  constructor(props) {
    super(props);
    this.state = {
      employees: [],
      firstName: "",
      lastName: "",
      department: "",
    };
  }
  handleChange = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  };
  componentDidMount() {
    axios
      .get("https://wethebest.herokuapp.com/api/v1/employees")
      .then((response) => {
        console.log(response.data);
        this.setState({ employees: response.data });
      });
  }

  handlePost = (e) => {
    let newData = {
      firstName: this.state.firstName,
      lastName: this.state.lastName,
      department: this.state.department,
    };

    e.preventDefault();
    console.log(newData);

    axios({
      method: "post",
      url: "https://wethebest.herokuapp.com/api/v1/employees/add",
      data: newData,
    });
  };
  render() {
    return (
      <div>
        <h1>this is it</h1>
        {this.state.employees.map((employee) => (
          <ul key={employee.id}>
            <li> {employee.firstName} </li>
            <li> {employee.lastName}</li>
            <li> {employee.department}</li>
            <li>
              <img src={employee.pic}></img>
            </li>
          </ul>
        ))}

        <form>
          <input
            type="text"
            value={this.state.firstName}
            name="firstName"
            placeholder="First Name"
            onChange={this.handleChange}
          />
          <br />
          <input
            type="text"
            value={this.state.lastName}
            name="lastName"
            placeholder="Last Name"
            onChange={this.handleChange}
          />
          <br />
          <input
            placeholder="department"
            type="text"
            value={this.state.department}
            name="department"
            onChange={this.handleChange}
          />
          <br />
          <p>First Name: {this.state.firstName}</p>
          <p>Last Name: {this.state.lastName}</p>
          <p>Department: {this.state.department}</p>
          <button onClick={this.handlePost}>Post IT!!!</button>
        </form>
      </div>
    );
  }
}

export default ListEmployees;
