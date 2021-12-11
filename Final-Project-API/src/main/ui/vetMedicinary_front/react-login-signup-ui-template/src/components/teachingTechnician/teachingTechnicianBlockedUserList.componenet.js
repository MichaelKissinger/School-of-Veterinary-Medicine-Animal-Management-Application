import React, { Component } from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";



const TeachingTechnicianBlockedUserList = () => {
        const FName=localStorage.getItem('FName');
        const LName=localStorage.getItem('LName');

        return (
            <form>
                <div className="container-fluid">
                    <div className="row">
                        <nav className="col-md-2 d-none d-md-block bg-light sidebar">
                            <div className="sidebar-sticky">
                                <h7 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1  text-muted">
                                <span><strong>Teaching Technician</strong></span>
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
 
                                <ul className="nav flex-column mb-2">                                <li className="nav-item">
                                        <Link className="nav-link" to={"/TeachingTechnicianProfile"}>My Profile</Link>
                                    </li>
                                                                        <li className="nav-item">
                                        <Link className="nav-link" to={"/TeachingTechnicianUserList"}>Student List</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/TeachingTechnicianBlockedUserList"}>Blocked User List</Link>
                                    </li>

                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/TeachingTechnicianAnimalSearch"}>Animal List</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/TeachingTechnicianRequestedAnimal"}>Requested Animal</Link>
                                    </li>
                                </ul>
                            </div>
                        </nav>

                        <main role="main" className="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                            <div className="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">

                                <div>
                                    <table className="table table-responsive">
                                        <tbody>
                                            <tr>
                                                <td><input className="form-control mr-sm-2" type="search" placeholder="First Name" /></td>
                                                <td><input className="form-control mr-sm-2" type="search" placeholder="Last Name" /></td>
                                                <td><button className="btn btn-outline-primary" type="submit">Search</button></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <h2>Blocked Users</h2>
                            <div className="table-responsive">
                                <table className="table table-responsive table-hover table-striped">
                                    <thead>
                                        <tr>
                                            <th scope="col">First Name</th>
                                            <th scope="col">Last Name</th>
                                            <th scope="col">Edit</th>
                                            <th scope="col">Block</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="col">User Name</th>
                                            <th scope="col">John Smith</th>
                                            <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                            <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">Frank Puskas</th>
                                            <th scope="col">John Smith</th>
                                            <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                            <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">Jim Carrey</th>
                                            <th scope="col">John Smith</th>
                                            <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                            <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">John Smith</th>
                                            <th scope="col">John Smith</th>
                                            <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                            <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">Frank Puskas</th>
                                            <th scope="col">John Smith</th>
                                            <th scope="col"><a className="fa fa-edit" href="#"></a></th>
                                            <th scope="col"><a className="fa fa-times" href="#"></a></th>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </main>
                    </div>
                </div>
            </form >
        );
    }
    export default TeachingTechnicianBlockedUserList;