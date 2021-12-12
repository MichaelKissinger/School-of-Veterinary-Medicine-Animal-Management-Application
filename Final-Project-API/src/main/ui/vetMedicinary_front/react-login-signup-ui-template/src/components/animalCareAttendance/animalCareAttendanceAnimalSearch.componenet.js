import React, { Component } from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import axios from "axios";


const User_REST_API_URL = 'http://localhost:8080/allAnimals';

const AnimalCareAttendanceAnimalSearch = () => {

    function handleLogout (){
        localStorage.clear();
        window.open("/Login");
    }

    const[myArray, setMyArray] = React.useState([]);
    const[ID, setID] = React.useState();
    const[changeStatus, setChangeStatus] = React.useState();

    const FName=localStorage.getItem('FName');
    const LName=localStorage.getItem('LName');

    React.useEffect(() => {
      axios.get(User_REST_API_URL).then(response => setMyArray(response.data));
    }, []);

    // function statusInput(id) {



    function statusInput(id) {
    setChangeStatus("Requested");
    setID(id);
    const status = {Status : changeStatus};
    console.log(status);
    axios.put('http://localhost:8080/animal/updateStatus/'+ID, status)
          .then();
    window.location.reload(false);
  }
        return (
            <form>
                <div className="container-fluid">
                    <div className="row">
                        <nav className="col-md-2 d-none d-md-block bg-light sidebar">
                            <div className="sidebar-sticky">
                                <h7 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1  text-muted">
                                <span><strong>Animal Care Attendance</strong></span>
                                </h7>
                                <ul className="nav flex-column">
                                    <li className="nav-item">
                                        <div className="d-flex flex-column align-items-center text-center">
                                            <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" className="rounded-circle" width="130" />
                                        </div>
                                    </li>
                                </ul>
                                <h6 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1 text-muted">
                                    <span><strong>{FName}  {LName}</strong></span>
                                </h6>
                                <ul className="nav flex-column mb-2">
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/AnimalCareAttendanceProfile"}>My Profile</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/AnimalCareAttendanceAnimalSearch"}>Animal List</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/AnimalCareAttendanceAlertAnimal"}>Alerts</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/AnimalCareAttendanceRequestedTreatment"}>Requested Treatment</Link>
                                    </li>
                                </ul>
                                <button
                                    onClick={handleLogout}
                                    style={{marginLeft:50}} type="submit" className="btn btn-outline-primary">Logout</button>
                            </div>
                        </nav>

                        <main role="main" className="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                            <div className="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">

                                <div>
                                    <table className="table table-responsive">
                                        <tbody>
                                            <tr>
                                                <td><input className="form-control mr-sm-2" type="search" placeholder="ID" /></td>
                                                <td><input className="form-control mr-sm-2" type="search" placeholder="Name" /></td>
                                                <td><button className="btn btn-outline-primary" type="submit">Search</button></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <h2>Animals List</h2>
                            <div className="table-responsive">
                                <table className="table table-responsive table-striped table-hover">
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
                                            <th scope="col">Alert Disease</th>
                                            <th scope="col">Request Treatment</th>
                                            <th scope="col">Animal Profile</th>
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
                                                  <td><a className="fa fa-bell" href="#"></a></td>
                                                  <td><button className="fa fa-ambulance" href="#" onClick= {() => statusInput(myArray.animalId)}></button></td>
                                                  <td><a className="fa fa-eye" href="#"></a></td>
                                                  </tr>)
                                                 }
                                    </tbody>
                                </table>
                            </div>
                            <br/>
                            <Link to={"/AnimalCareAddAnimal"}> <button className="btn btn-outline-primary" type="submit">Add Animal</button></Link>
                        </main>
                    </div>
                </div>
            </form >
        );
    }
export default AnimalCareAttendanceAnimalSearch;