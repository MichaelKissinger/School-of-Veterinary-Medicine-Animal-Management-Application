import React, { Component } from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

export default class StudentProfile extends Component {
    render() {
        return (
            <form>
                <div className="container-fluid">
                    <div className="row">
                        <nav className="col-md-2 d-none d-md-block bg-light sidebar">
                            <div className="sidebar-sticky">
                                <h7 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1  text-muted">
                                    <span>Student</span>
                                </h7>
                                <ul className="nav flex-column">
                                    <li className="nav-item">
                                        <div className="d-flex flex-column align-items-center text-center">
                                            <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" className="rounded-circle" width="130" />
                                        </div>
                                    </li>
                                </ul>
                                <h6 className="sidebar-heading d-flex flex-column align-items-center text-center px-3 mt-4 mb-1 text-muted">
                                    <span>Current user full name</span>
                                </h6>
                                <ul className="nav flex-column mb-2">
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/studentProfile"}>My Profile</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to={"/StudentAnimalSearch"}>Animal List</Link>
                                    </li>

                                </ul>
                            </div>
                        </nav>

                        <main role="main" className="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                            <h2>[Current user name] Profile</h2>
                            <div className="mt-3">
                                <table className="table table-responsive">
                                    <tbody>
                                        <tr>
                                            <th scope="col">Name:</th>
                                            <th scope="col"><strong><i>John</i></strong></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">Family:</th>
                                            <th scope="col"><strong><i>Smith</i></strong></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">Birtdate:</th>
                                            <th scope="col"><strong><i>1984-08-30</i></strong></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">Type of Access:</th>
                                            <th scope="col"><strong><i>Teacher Assistant</i></strong></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">Phone Number:</th>
                                            <th scope="col"><strong><i>808-808-4444</i></strong></th>
                                        </tr>
                                        <tr>
                                            <th scope="col">Email:</th>
                                            <th scope="col"><strong><i>email@site.com</i></strong></th>
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
}