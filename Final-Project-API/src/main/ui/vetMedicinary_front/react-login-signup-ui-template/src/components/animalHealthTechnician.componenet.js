import React, { Component } from "react";

export default class AnimalHealthTechnician extends Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date().toLocaleString()
        };
    }
    render() {
        return (
            <form class="animal-care-access-point">
                <header>
                    <div class="search-header-container blog-main-clear">
                        <div class="search-header-date-container">
                            <div class="header-date-inner">{this.state.date}</div>
                        </div>
                        <div class="sign-out">
                        <a class="sign-out fa fa-times" href="./Login" title="log out"></a>
                        </div>
                    </div>
                </header>
                <div class="admin-access-container row">
                    <div class="col-md-3">
                        <div class="card">
                            <h4 class="text-center bg-dark text-white-50">Animal Health Technician</h4>
                            <div class="card-body">
                                <div class="d-flex flex-column align-items-center text-center">
                                    <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" class="rounded-circle" width="150" />
                                    <div class="mt-3">
                                        <table class="table table-responsive">
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
                                                    <th scope="col"><strong><i>Animal Health Technician</i></strong></th>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-5">
                        <div class="card">
                            <h4 class="text-center bg-dark text-white-50">Animals List</h4>
                            <div class="card-body">
                                <div class="d-flex flex-column align-items-center text-center">
                                    <div class="mt-5">
                                        <table class="table table-responsive table-hover table-striped">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Name</th>
                                                    <th scope="col">Type</th>
                                                    <th scope="col">diagnose</th>
                                                    <th scope="col">prescribe</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat A</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Kangaroo</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>

                                                </tr>
                                                <tr>
                                                    <th scope="col">Dog B</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
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
                    <div class="search-footer-container">
                    <p class="footer-address-inner">School of Veterinary Medicine 
                                            </p>
                    </div>
                </footer>
            </form >
        );
    }
}