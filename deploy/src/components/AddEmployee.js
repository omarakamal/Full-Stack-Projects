import axios from "axios";
import React, { Component } from "react";
import EmployeeService from "../services/EmployeeService";

class AddEmployee extends Component {
  constructor(props) {
    super(props);
    this.state = {
      firstName: "",
      lastName: "",
      department: "",
      upload: "",
    };
  }
  handleFirstName = (event) => {
    this.setState({ firstName: event.target.value });
  };
  handleLastName = (event) => {
    this.setState({ lastName: event.target.value });
  };
  handleDepartment = (event) => {
    this.setState({ department: event.target.value });
  };
  handleUpload = (event) => {
    this.setState({ upload: event.target.value });
  };
  handleSaveEmployee = (e) => {
    e.preventDefault();
    let employee = {
      firstName: this.state.firstName,
      lastName: this.state.lastName,
      department: this.state.department,
      upload: this.state.upload,
    };
    console.log("employee => " + JSON.stringify(employee));

    axios({
      method: "post",
      url: "http://localhost:8080/api/v1/employees",
      data: employee,
    });

    // EmployeeService.createEmployee(employee).then((res) => {
    //   this.props.history.push("/employees");
    //   return <this.handleSaveEmployee to="/chat" />;
    // });
  };

  handleCancel = () => {
    this.props.history.push("/employees");
  };

  render() {
    return (
      <div>
        <div className="container">
          <div className="row">
            <div className="card col-md-6 offset-md-3 offset-md-3">
              <h3 className="text-center">Add Employee</h3>
              <div className="card-body">
                <form>
                  <div className="form-group">
                    <label> First Name:</label>
                    <input
                      placeholder="First Name"
                      name="firstName"
                      className="form-control"
                      value={this.state.firstName}
                      onChange={this.handleFirstName}
                    ></input>
                  </div>
                  <div className="form-group">
                    <label> Last Name:</label>
                    <input
                      placeholder="Last Name"
                      name="lastname"
                      className="form-control"
                      value={this.state.lastName}
                      onChange={this.handleLastName}
                    ></input>
                  </div>
                  <div className="form-group">
                    <label> Department:</label>
                    <input
                      placeholder="Department"
                      name="department"
                      className="form-control"
                      value={this.state.department}
                      onChange={this.handleDepartment}
                    ></input>
                  </div>
                  <div className="form-group">
                    <label> upload:</label>
                    <input
                      type="file"
                      placeholder="upload"
                      name="upload"
                      className="form-control"
                      value={this.state.upload}
                      onChange={this.handleUpload}
                    ></input>
                  </div>

                  <button
                    className="btn btn-success"
                    onClick={this.handleSaveEmployee}
                  >
                    Save Employee
                  </button>
                  <button
                    className="btn btn-danger"
                    onClick={this.handleCancel.bind(this)}
                    style={{ marginLeft: "10px" }}
                  >
                    Cancel
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default AddEmployee;
