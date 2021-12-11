import React, { Component } from "react";
import axios from 'axios';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

export default class AnimalHealthTechAddAnimal extends Component {

    handleSubmit = e => {
        e.preventDefault();
        const sendData = {
            name: this.name,
            status: this.status,
            tattoo: this.tattoo,
            dateBirth: this.dateBirth,
            city: this.city,
            breed: this.breed,
            type: this.type,
            sex: this.sex,
            userID: this.userID,
        }
        axios.post(this.state.REST_API_ADD_ANIMAL, sendData)
             .then(res => {
                 if (res.data==true){
                    alert("Animal"+" "+ sendData.name + " Successfully Added.");
                    window.location.reload();
                 }
             })
    }
    constructor(props) {
        super(props);
        this.state = {
            FName: localStorage.getItem('FName'),
            LName: localStorage.getItem('LName'),
            REST_API_ADD_ANIMAL: "http://localhost:8080/animal/addAnimal",
            gender:"",
            result:"null",
        };
    }
    render() {
        return (
            <form>
                <div className="container-fluid">
                    <div className="row">
                    <nav className="col-md-2 d-none d-md-block bg-light sidebar">
                            <div className="sidebar-sticky">
                                <h7 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1  text-muted">
                                    <span><strong>Animal Health Technician</strong></span>
                                </h7>
                                <ul className="nav flex-column">
                                    <li className="nav-item">
                                        <div className="d-flex flex-column align-items-center text-center">
                                            <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" className="rounded-circle" width="130" />
                                        </div>
                                    </li>
                                </ul>
                                <h6 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1 text-muted">
                                    <span><strong>{this.state.FName}  {this.state.LName}</strong></span>
                                </h6>
                                <ul className="nav flex-column mb-2">
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/AnimalHealthTechnicianProfile"}>My Profile</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/AnimalHealthTechnicianAnimalSearch"}>Animal List</Link>
                                    </li>
                                </ul>
                            </div>
                        </nav>

                        <main role="main" className="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                            <div className="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                            </div>
                            <h2 style={{ marginBottom: 20, fontSize: 20 }}>Add Animal</h2>
                            <div className="col-md-8 order-md-1">
                                <div className="col-md-6 mb-3">
                                    <label for="name">Name</label>
                                    <input type="text"
                                        onChange={e => this.name = e.target.value}
                                        className="form-control" id="name" placeholder="" required />
                                    <div className="invalid-feedback">
                                        Valid name is required.
                                    </div>
                                </div>

                                <div className="col-md-6 mb-3">
                                    <label for="status">Status</label>
                                    <input type="text"
                                        onChange={e => this.status = e.target.value}
                                        className="form-control" id="status" placeholder="" required />
                                    <div className="invalid-feedback">
                                        Valid status is required.
                                    </div>
                                </div>

                                <div className="col-md-6 mb-3">
                                    <label for="tattoo">Tattoo (3 Digits)</label>
                                    <input type="text"
                                        onChange={e => this.tattoo = e.target.value}
                                        className="form-control" id="tattoo" placeholder="" required />
                                    <div className="invalid-feedback">
                                        Valid tattoo number is required.
                                    </div>
                                </div>
                                <div className="col-md-6 mb-3">
                                    <label for="breed">Breed</label>
                                    <input type="text"
                                        onChange={e => this.breed = e.target.value}
                                        className="form-control" id="breed" placeholder="" required />
                                    <div className="invalid-feedback">
                                        Valid breed is required.
                                    </div>
                                </div>
                                <div className="col-md-6 mb-3">
                                    <label for="type">Type</label>
                                    <input type="text"
                                        onChange={e => this.type = e.target.value}
                                        className="form-control" id="type" placeholder="" required />
                                    <div className="invalid-feedback">
                                        Valid type is required.
                                    </div>
                                </div>
                                <div className="col-md-6 mb-3">
                                    <label for="city">City</label>
                                    <input type="text"
                                        onChange={e => this.city = e.target.value}
                                        className="form-control" id="city" placeholder="" required />
                                    <div className="invalid-feedback">
                                        Valid city is required.
                                    </div>
                                </div>
                                <div className="radio-buttons" style={{ fontSize: 19,marginBottom: 15 }}>
                                    <input 
                                        id="Male"
                                        value="M"
                                        name="gender"
                                        type="radio"
                                        onChange={e => this.sex = e.target.value}
                                    />
                                    Male   
                                    <input style={{ marginLeft: 20 }}
                                        id="Female"
                                        value="F"
                                        name="gender"
                                        type="radio"
                                        onChange={e => this.sex = e.target.value}
                                    />
                                    Female
                                </div>

                                <div className="col-md-6 mb-3">
                                    <label for="start" >Birthday Date:</label>
                                    <br />
                                    <input onChange={e => this.dateBirth = e.target.value} className="form-control" type="date" id="start" name="trip-start"
                                        min="2005-01-01" max="2022-12-20" />
                                </div>
                                <div className="col-md-6 mb-3">
                                    <label for="password">Assigned Health Technician</label>
                                    <input onChange={e => this.userID = e.target.value}
                                        type="text" className="form-control" id="userID" placeholder="" required />
                                    <div className="invalid-feedback">
                                        Valid userID is required.
                                    </div>
                                </div>
                                <button
                                    onClick={this.handleSubmit}
                                    type="submit" className="btn btn-primary btn-block">Submit</button>
                            </div>
                        </main>
                    </div>
                </div>
            </form >
        );
    }
}