import React, { Component } from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import axios from "axios";


const User_REST_API_URL = 'http://localhost:8080/allAnimals';

const AdministratorAccess = () => {

    const[myArray, setMyArray] = React.useState([]);

    React.useEffect(() => {
      axios.get(User_REST_API_URL).then(response => setMyArray(response.data));
    }, []);
        return (
            <form>
                <div class="container-fluid">
                    <div class="row">
                        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                            <div class="sidebar-sticky">
                                <h7 class="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1  text-muted">
                                    <span>Administrator</span>
                                </h7>
                                <ul class="nav flex-column">
                                    <li class="nav-item">
                                        <div class="d-flex flex-column align-items-center text-center">
                                            <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" class="rounded-circle" width="130" />
                                        </div>
                                    </li>
                                </ul>
                                <h6 class="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1 text-muted">
                                    <span>Current user full name</span>
                                </h6>

                                <ul class="nav flex-column mb-2">
                                    <li class="nav-item">
                                        <Link className="nav-link" to={"/AdminProfile"}>My Profile</Link>
                                    </li>
                                    <li class="nav-item">
                                        <Link className="nav-link" to={"/AdminUserList"}>User List</Link>
                                    </li>
                                    <li class="nav-item">
                                        <Link className="nav-link" to={"/AdminBlockedUserList"}>Blocked User List</Link>
                                    </li>
                                    <li class="nav-item">
                                        <Link className="nav-link" to={"/AdminAnimalSearch"}>Animal List</Link>
                                    </li>
                                </ul>
                            </div>
                        </nav>

                        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">

                                <div>
                                    <table class="table table-responsive">
                                        <tbody>
                                            <tr>
                                                <td><input class="form-control mr-sm-2" type="search" placeholder="ID" /></td>
                                                <td><input class="form-control mr-sm-2" type="search" placeholder="Name" /></td>
                                                <td><button class="btn btn-outline-primary" type="submit">Search</button></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <h2>Animals List</h2>
                            <div class="table-responsive">
                                <table class="table table-responsive table-striped table-hover">
                                    <thead>
                                        <tr>
                                            <th scope="col">ID</th>
                                            <th scope="col">Type</th>
                                            <th scope="col">City</th>
                                            <th scope="col">Date of Birth</th>
                                            <th scope="col">Name</th>
                                            <th scope="col">Sex</th>
                                            <th scope="col">Status</th>
                                            <th scope="col">Tattoo</th>
                                            <th scope="col">Breed</th>
                                            <th scope="col">User ID</th>
                                            <th scope="col">Edit</th>
                                            <th scope="col">View</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {                                           
                                                myArray.map(myArray =>
                                                    <tr key={myArray.animalId}>
                                                  <td>{myArray.animalId}</td>
                                                  <td>{myArray.breed}</td>
                                                  <td>{myArray.city}</td>
                                                  <td>{myArray.dateBirth}</td>
                                                  <td>{myArray.name}</td>
                                                  <td>{myArray.sex}</td>
                                                  <td>{myArray.status}</td>
                                                  <td>{myArray.tattoo}</td>
                                                  <td>{myArray.type}</td>
                                                  <td>{myArray.userID}</td>
                                                  <td><a class="fa fa-edit" href="#"></a></td>
                                                  <td><a class="fa fa-eye" href="#"></a></td>
                                                  </tr>)
                                            }
                                    </tbody>
                                </table>
                            </div>
                        </main>
                    </div>
                </div>
            </form >
        );
    };
    
export default AdministratorAccess;