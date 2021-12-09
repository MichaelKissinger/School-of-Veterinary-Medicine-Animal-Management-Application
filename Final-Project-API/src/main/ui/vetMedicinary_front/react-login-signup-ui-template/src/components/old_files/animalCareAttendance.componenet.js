import React, { Component } from "react";

export default class AnimalCareAttendance extends Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date().toLocaleString()
        };
    }
    render() {
        return (
            <form className="animal-care-access-point">
                <header>
                    <div className="search-header-container blog-main-clear">
                        <div className="search-header-date-container">
                            <div className="header-date-inner">{this.state.date}</div>
                        </div>
                        <div className="sign-out">
                        <a className="sign-out fa fa-times" href="./Login" title="log out"></a>
                        </div>
                    </div>
                </header>
                <div className="admin-access-container row">
                    <div className="col-md-3">
                        <div className="card">
                            <h4 className="text-center bg-dark text-white-50">Animal Care Attendance</h4>
                            <div className="card-body">
                                <div className="d-flex flex-column align-items-center text-center">
                                    <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" className="rounded-circle" width="150" />
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
                                                    <th scope="col"><strong><i>Animal Care Attendance</i></strong></th>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-5">
                        <div className="card">
                            <h4 className="text-center bg-dark text-white-50">Animals List</h4>
                            <div className="card-body">
                                <div className="d-flex flex-column align-items-center text-center">
                                    <div className="mt-5">
                                        <table className="table table-responsive table-hover table-striped">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Name</th>
                                                    <th scope="col">Type</th>
                                                    <th scope="col">Alert Disease</th>
                                                    <th scope="col">Request Treatment</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a className="fa fa-bell" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-ambulance" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat A</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a className="fa fa-bell" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-ambulance" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Kangaroo</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a className="fa fa-bell" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-ambulance" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Dog B</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a className="fa fa-bell" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-ambulance" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a className="fa fa-bell" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-ambulance" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a className="fa fa-bell" href="#"></a></th>
                                                    <th scope="col"><a className="fa fa-ambulance" href="#"></a></th>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <footer>
                    <div className="search-footer-container">
                    <p className="footer-address-inner">School of Veterinary Medicine 
                                            </p>
                    </div>
                </footer>
            </form >
        );
    }
}